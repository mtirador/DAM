@echo off
cls

rem voy a hacer una multiplicacion

set var1=4
set var2=5

echo multiplicamos la variable %var1% con la %var2%
set /a resultado=%var1%*%var2%
echo El resultado de la multiplicacion es: %resultado%

echo pulse para continuar
pause>nul