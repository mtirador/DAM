@echo off

if "%1"==""(
    rem mostrar mensaje de error
    echo ERROR. Debe introducir un comando
) else (
    rem  mostrar la ayuda del comando
    echo ayuda para el comando: %1
    %1 /?

)

pause > nul
