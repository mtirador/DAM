@echo off

cls

if exist d:\ goto verdadero
echo no tenemos ningun usb conectado
echo presione f para finalizar
pause > nul
goto fin

:verdadero
echo esta conectado 
echo presione f para finalizar
pause > nul

:fin
exit