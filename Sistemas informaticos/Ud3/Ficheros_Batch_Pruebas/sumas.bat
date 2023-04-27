@echo off

rem suma de variables

set /p dato1=Ingrese el primer número:
set /p dato2=Ingrese el segundo número:

set /a resultado=%dato1% + %dato2%

echo El resultado de la suma es: %resultado%

pause
exit
