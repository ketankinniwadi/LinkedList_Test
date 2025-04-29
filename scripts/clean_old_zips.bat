echo --- Cleaning Old Zips ---
forfiles /p uploads /s /m *.zip /d -7 /c "cmd /c del @path"
