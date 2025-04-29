@echo on
echo --- Running JUnit 5 Tests ---

:: Create required folders if they don't exist
if not exist build mkdir build
if not exist reports mkdir reports

:: Ensure the JUnit JAR file is in the correct location or update the path
if not exist libs\junit-platform-console-standalone-1.13.0.jar (
    echo JUnit JAR file not found. Please ensure it's in the 'libs' directory.
    pause
    exit /b
)

:: Compile Java classes including main and test classes
echo --- Compiling Java Classes ---
javac -cp .;libs\junit-platform-console-standalone-1.13.0.jar -d build src\LinkedList\LinkedList.java src\Node\Node.java src\test\java\LinkedListTest.java

:: Check if compilation was successful
if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed. Exiting.
    pause
    exit /b
)

:: Run Tests using JUnit Platform Console
echo --- Running JUnit 5 Tests ---
java -jar libs\junit-platform-console-standalone-1.13.0.jar --class-path build --scan-class-path > reports\test_report.txt
cd reports
echo --- JUnit 5 Testing Complete ---
