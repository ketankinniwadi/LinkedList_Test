@echo on
echo --- Running JUnit 5 Tests ---

:: Create required folders
if not exist build mkdir build
if not exist reports mkdir reports

:: Compile Java classes
javac -cp .;libs\junit-platform-console-standalone-1.10.2.jar -d build src\test\java\LinkedListTest.java

:: Run Tests
java -jar libs\junit-platform-console-standalone-1.10.2.jar --class-path build --scan-class-path > reports\test_report.txt

echo --- JUnit 5 Testing Complete ---
