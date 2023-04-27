@echo off

set /p dato= dame un numero
set /p dato2= otro numero

for %%n in (%dato%,%dato2%) do echo parametro= %%n 

echo pulsa para finalizar
pause > nul