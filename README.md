Sample standalone applications on top of joern
=============================================

## A program that makes use of Joern to create a CPG and list all method names

```
sbt stage
./standalone
```

## A REPL with some custom cpg steps

```
sbt stage
./repl

Welcome to the wonderful world of this sample joern extension!
joern-sample-ext>
```

To get started you could try the following commands - then just explore
```
// import a cpg that you created previously, e.g. in joern
importCpg("path/to/some/cpg.bin")

cpg.help  
==> 
Available starter steps:
___________________________________________________________________________________________________________________________
 step               | description                                                                                         |
==========================================================================================================================|
 .all               | All nodes of the graph                                                                              |
 ...
 .customStarterStep | custom starter step as an example                                                                   |
 ...
 

cpg.customSta<TAB> // autocompletes

cpg.method.help
==>
Available steps for Method:
_______________________________________________________________________________________
 step                 | description                                                   |
======================================================================================|
 .address             | Address of the code (for binary code)                         |
 ...
 .customMethodStep    | custom step on method as an example                           |
 ...



cpg.method.cust<TAB> // autocompletes
```

Hint: `./repl --verbose` is your friend.
