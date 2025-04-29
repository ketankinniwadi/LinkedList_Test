echo --- Pushing Zip to GitHub ---

:: Get token from argument %1
set TOKEN=%1
cd uploads
git init
git commit -m "first commit"
git branch -M main
git remote add origin https://%TOKEN%@github.com/ketankinniwadi/LinkedList_Final.git
git push -u origin main