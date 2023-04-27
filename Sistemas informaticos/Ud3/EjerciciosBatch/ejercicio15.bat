@echo off
cls


:teclear
set /p tecla=pulse la tecla x:

if %tecla%==x goto fin

echo error al pulsar la tecla x
echo presione cualquier tecla
pause > nul
goto teclear

:fin
echo ha pulsado la tecla x correctamente
echo presione cualquier tecla para salir
pause >nul
exit