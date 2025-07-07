javac -cp "lib/antlr-4.13.1-complete.jar" parser/*.java
javac -cp "lib/antlr-4.13.1-complete.jar:." main/Main.java
java -cp "lib/antlr-4.13.1-complete.jar:.:main " main.Main