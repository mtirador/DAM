@echo off

cls

if "%1"=="" goto error1
if not exist C:\Users\buffy\OneDrive\Escritorio\%1 goto error2
cd C:\Users\buffy\OneDrive\Escritorio\%1
echo creando directorio
md ..\..\nivel2up
goto fin

:error1
echo no ha introducido un nombre de directorio
goto fin

:error2
echo el directorio no existe

:fin
echo pulsa cualquier tecla para seguir

