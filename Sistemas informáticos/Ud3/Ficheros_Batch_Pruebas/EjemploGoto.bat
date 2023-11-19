@echo off
rem etiquetas :
:inicio 
cls
set /p resultado=cuanto son 2+2?
if %resultado%==4 goto correcto else goto incorrecto

:incorrecto
echo Respuesta incorrecta.
echo Presione cualquier tecla para volver a intentarlo.
pause >nul
goto inicio

:correcto
echo Has acertado
echo presione cualquier tecla para volver a intentarlo.
pause >nul
exit

