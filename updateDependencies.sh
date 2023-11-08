#!/usr/bin/env bash
NON_INTERACTIVE_OPTION=$1
DEPENDENCY=$2

check_installed() {
  if ! type "$1" > /dev/null; then
    echo "Please ensure you have $1 installed."
    exit 1
  fi
}

check_installed curl

# macOS is known to ship 'bash' version < 4
if [[ "$OSTYPE" == "darwin"* ]]; then
  BASH_VERSION=`bash --version | grep "GNU bash, version " | awk '{print $4}' | cut -d. -f1`
  if [[ $BASH_VERSION -lt  4 ]]; then
    echo "error: 'bash' version detected is less than 4"
    if [ "$NON_INTERACTIVE_OPTION" == "--non-interactive" ]
    then
      echo "update 'bash' using 'brew install bash'? [Y/n]"
      read ANSWER
      if [ -z $ANSWER ] || [ "y" == $ANSWER ] || [ "Y" == $ANSWER ]
      then
        brew install bash
      else
        exit 1
      fi
    else
      echo "error: Please upgrade bash version and re-run"
      exit 1
    fi
  fi
fi

# check if xmllint is installed
if type xmllint > /dev/null; then
  USE_XMLLINT=1 #true
else
  echo "warning: xmllint is not installed - will try with 'grep' as a fallback..."
  USE_XMLLINT=0 #false
fi

declare -A repos=(
  [cpg]=https://repo1.maven.org/maven2/io/shiftleft/codepropertygraph-schema_3
  [joern]=https://repo1.maven.org/maven2/io/joern/console_3
  [overflowdb]=https://repo1.maven.org/maven2/io/shiftleft/overflowdb-core_3
)

function latest_version {
  local NAME=$1
  local REPO_URL=${repos[$NAME]}
  local MVN_META_URL=$REPO_URL/maven-metadata.xml
  local CURL_PARAMS="--silent --show-error $MVN_META_URL"

  if (( $USE_XMLLINT ))
  then
    curl $CURL_PARAMS | xmllint --xpath "/metadata/versioning/latest/text()" -
  else
    curl $CURL_PARAMS | grep '<latest>' | sed 's/[ ]*<latest>\([0-9.]*\)<\/latest>/\1/'
  fi
}

function update {
  local NAME=$1
  if [[ -z "${repos[$NAME]}" ]]; then
    echo "error: no repo url defined for $NAME"
    exit 1;
  fi

  local VERSION=$(latest_version $NAME)
  local SEARCH="val ${NAME}Version\([ ]*\)= .*"
  local OLD_VERSION=$(grep "$SEARCH" build.sbt | sed 's/.*"\(.*\)"/\1/')

  if [ "$VERSION" == "$OLD_VERSION" ]
  then
    echo "$NAME: unchanged ($VERSION)"
  else
    local REPLACE="val ${NAME}Version\1= \"$VERSION\""

    if [ "$NON_INTERACTIVE_OPTION" == "--non-interactive" ]
    then
      echo "non-interactive mode, auto-updating $NAME: $OLD_VERSION -> $VERSION"
      sed -i'.bak' "s/$SEARCH/$REPLACE/" build.sbt
    else
      echo "update $NAME: $OLD_VERSION -> $VERSION? [Y/n]"
      read ANSWER
      if [ -z $ANSWER ] || [ "y" == $ANSWER ] || [ "Y" == $ANSWER ]
      then
        sed -i'.bak' "s/$SEARCH/$REPLACE/" build.sbt
      fi
    fi
  fi
}

if [ "$DEPENDENCY" == "" ]; then
  update cpg
  update joern
  update overflowdb
  rm -f build.sbt.bak # Remove back-up files generated by 'sed'
else
  DEPENDENCY="${DEPENDENCY#--only=}"
  update $DEPENDENCY
fi
