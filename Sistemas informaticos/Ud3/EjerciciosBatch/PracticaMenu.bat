@echo off
cls

:Menu
echo Seleccione una opcion
echo .
echo 1.Primera opcion
echo 2.segunda opcion
echo 3.salida

set /p var=introduce la opcion: 
if %var%==1 goto :primero
if %var%==2 goto :segundo
if %var%==3 goto :salida
if %var% GTR 3 echo error 
goto :Menu

:primero
echo seleccionaste la primera opcion
echo pulse cualquier tecla para volver al Menu
pause>nul
goto :Menu

:segundo
echo seleccionaste la segunda opcion
echo pulse cualquier tecla para volver al Menu
pause>nul
goto :Menu

:salida
echo has pulsado salida
echo hasta pronto
pause>nul
exit