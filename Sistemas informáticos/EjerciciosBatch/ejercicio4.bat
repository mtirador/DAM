@echo off
cls


if exist %1 goto crear else goto mensaje

:crear
md PruebaCopia 
copy %1 PruebaCopia 
pause >nul


:mensaje
echo No esta copiado ni se ha creado naaa
pause >nul

exit