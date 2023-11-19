@echo off
cls

:Inicio
set /p resultado=cuanto es 2+2?
if %resultado%==4 goto correcto else goto incorrecto

:incorrecto
echo respuesta incorrecta
echo presione cualquier tecla para volver a intentarlo
pause >nul
goto Inicio

:correcto
echo respuesta correcta
echo presione cualquier tecla para salir
pause >nul
exit