@echo off
del "%temp%\Listing"
dir %1 /b /-p /o:gn > "%temp%\Listing"
start notepad "%temp%\Listing"
Exit