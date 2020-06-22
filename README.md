Java 9 modules - the simplest example
======

It's the simplest example of using java 9 modules. Before this you can refer this blog [Deep Dive into Java Modules](https://blog.knoldus.com/deep-dive-into-java-modules/)

This Template contains three modules `java9.greeting` , `java9.main` and `java9.methods`.
`java9.main` has a dependency on `java9.methods`, module contains class with a one single-line method.

Java 9 modules - Compile the code
====

`javac --module-source-path ~(Source Path) -d ~/(Destination Path) -m module name`

`javac --module-source-path ~/Java-9-Modules/src/ -d ~/out -m java9.main`

Java 9 modules - Run the code
====

`java --module-path ~/(Destination Path) -m File-name`

`java --module-path ~/out -m java9.main/main.Main`


In this we have a module `java9.greeting` which does not export any package. So the methods defined in module `java9.greeting` can't be used outside the module.
If you want to try that we can't access the method compile and run the code without removing the commented part and now remove the commented part compile and run the commands.