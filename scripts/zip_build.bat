echo --- Zipping Build Folder ---

if not exist artifacts mkdir artifacts

powershell Compress-Archive -Path build,logs,reports -DestinationPath artifacts\build_%date:~10,4%%date:~4,2%%date:~7,2%.zip -Force
