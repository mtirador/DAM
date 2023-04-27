@echo off
cls

echo voy  a hacer una prueba de copiar archivos

set ruta1=C:\Users\buffy\OneDrive\Escritorio\prueba\informacion.txt
set ruta2= C:\Users\buffy\OneDrive\Escritorio

copy %ruta1% %ruta2%

echo creo que se ha copiado
pause > nul