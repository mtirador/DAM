@echo off

md C:\Users\buffy\OneDrive\Escritorio\prueba
cd C:\Users\buffy\OneDrive\Escritorio\prueba
Ver > informacion.txt
dir > informacion.txt
echo Hora: %time% >> informacion.txt

pause >nul