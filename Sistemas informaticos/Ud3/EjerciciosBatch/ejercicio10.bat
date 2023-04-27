@ECHO OFF

CLS
MKDIR "%USERPROFILE%\escritorio\EJ10bat"

IF EXIST "%USERPROFILE%\escritorio\EJ10bat\recursos.txt" GOTO :existe

:noexiste
ECHO Creado listado de recursos.
GOTO :fin

:existe
ECHO Añadiendo informacion al fichero.
GOTO :fin

:fin
DIR "%USERPROFILE%\escritorio" >> "%USERPROFILE%\escritorio\EJ10bat\recursos.txt"
CD "%USERPROFILE%\escritorio"
TYPE EJ10bat\recursos.txt
PAUSE
