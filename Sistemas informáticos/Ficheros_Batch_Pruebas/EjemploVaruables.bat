@echo off

cls

rem voy a crear una variable, nombre asignar a nombre un valor introducido por teclado
rem mostrar el contenido de nombre y el primer parámetro.


set name=Usuario
echo Nombre de usuario: %name%
rem ahora introduzco el nombre del usuario
set /p name=Introduzca el nombre del usuario:

echo Nombre de usuario:%name% 



pause

