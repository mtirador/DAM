@echo off

rem copiar un fichero  a otro destino

copy %1 %2

cd %2

if exist "%1" goto correcto else goto incorrecto

:incorrecto
echo incorrectos parametros
echo la copia no se realizo.
pause > nul


:correcto
echo la copia se realizo correctamente.
pause > nul

exit


