javac -d bin -sourcepath src -cp "lib/antlr-4.13.1-complete.jar:." src/main/Main.java
javac  main/Main.java
java -cp "lib/antlr-4.13.1-complete.jar:.:main " main.Main