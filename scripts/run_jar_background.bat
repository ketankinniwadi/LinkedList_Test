@echo on
echo --- Running JAR in Background ---

:: Ensure the logs directory exists
if not exist logs mkdir logs

:: Ensure the app.jar file exists
if not exist shared_folder\app.jar (
    echo ERROR: JAR file not found at shared_folder\app.jar
    exit /b 1
)

:: Run the JAR file in background, redirecting output to logs
start /b java -jar shared_folder\app.jar > logs\app_log.txt 2>&1
