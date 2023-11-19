@echo off

cls
rem Ejercicio 1

echo "Bienvenido a ficheros BATCH"

set /p name= Introduce un nombre: 
echo Hola %name%

echo pulsa la tecla para seguir
pause > nul