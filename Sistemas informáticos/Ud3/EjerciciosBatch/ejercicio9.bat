@echo off

cls
rem creo la carpeta
MKDIR C:\Users\buffy\OneDrive\Escritorio\eje9bat
rem voy a la direccion
cd C:\Users\buffy\OneDrive\Escritorio\eje9bat

rem creo un arbol en la ruta especificada y creo un texto con listado.txt
TREE C:\Users\buffy\OneDrive\Escritorio>listado.txt
rem con type se muestra elcontenido del texto en la ventana del comandos
TYPE listado.txt

pause

