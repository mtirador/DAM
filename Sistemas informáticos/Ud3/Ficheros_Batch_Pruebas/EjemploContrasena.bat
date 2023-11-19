@echo off

:inicio

cls
set contrasena=padel
set /p contrasena2=Introduzca la contrasena correcta:


if "%contrasena2%"=="%contrasena%" goto correcto else goto incorrecto

:incorrecto
echo respuesta incorrecta game over
echo derecho al lobby
pause >nul
goto inicios

:correcto
echo respuesta correcta 
echo te regalo un pin
pause >nul

