@echo on
if not exist build mkdir build
echo --- Compiling Java Code ---
javac -d build src\*.java

echo --- Creating JAR File ---
cd build
jar cvf app.jar *
cd ..