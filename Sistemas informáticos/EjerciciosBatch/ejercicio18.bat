@echo off

taskkill /pid %1 /T
echo programa con Pid %1 cancelado.
echo pulse cualquier tecla para salir.
pause > nul