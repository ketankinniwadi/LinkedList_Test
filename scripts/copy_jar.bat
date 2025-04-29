echo --- Copying JAR to Shared Folder ---
if not exist shared_folder mkdir shared_folder
copy build\app.jar shared_folder\
