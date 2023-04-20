@echo off

:inicio
cls

call C:\Users\buffy\OneDrive\Escritorio\CEINMARK\batch\EjemploContrasena.bat
set /p ruta=Mete la ruta: 


if Exist "%ruta%" goto correcto else goto incorrecto

:incorrecto
echo la ruta introducida es incorrecta
echo porfavor no introduzca un pie entre la via y el anden
pause >nul
goto inicio

:correcto
echo la ruta introducida es correcta
echo Este tren tiene como destino...Lierganes
pause >nul
exit


