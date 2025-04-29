@echo on

cd ..
if not exist build mkdir build

echo --- Compiling Java Code ---

REM Compile main Java classes
javac -d build src\LinkedList\LinkedList.java src\Node\Node.java

echo --- Creating JAR File ---
cd build
jar cvf app.jar *
cd ..

pause
