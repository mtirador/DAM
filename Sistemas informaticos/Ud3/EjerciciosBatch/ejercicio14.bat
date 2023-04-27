@echo off
cls


IF NOT EXIST D:\ GOTO noexiste

MD D:\WORK
DIR D:\ /A:HS /O:N > D:\WORK\ADHOME.txt
ECHO MEMORIA USB CONECTADA
GOTO fin

:noexisteECHO NO EXISTE LA MEMORIA USB

:FIN 
PAUSE


