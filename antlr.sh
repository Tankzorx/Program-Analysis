java -jar lib/antlr-4.5.3-complete.jar src/MicroC_language/parsing/MicroC.g4 
javac -sourcepath src -cp lib/*.jar src/MicroC_language/MicroC.java src/MicroC_language/parsing/*.java -d bin
java -cp ./lib/antlr-4.5.3-complete.jar:./bin MicroC ./tests/test1.microC

