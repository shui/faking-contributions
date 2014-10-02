@echo off
setlocal EnableDelayedExpansion

set username=%1
set password=%2
set repository=%3

git init > nul
git remote add origin https://%username%:%password%@github.com/%username%/%repository%.git > nul

for /f "tokens=*" %%a in (%repository%) do (
	set /a rand=!random!%%50+1
	for /L %%i in (1,1,!rand!) do (
		echo %%a:%%i > lols
		git add lols > nul
	 	git commit --date="%%a" -m "for the lols" > nul
		echo %%a:%%i
	)
	git push origin master > nul
)

endlocal