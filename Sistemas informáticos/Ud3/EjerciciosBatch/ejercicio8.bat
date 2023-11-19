@ECHO OFF

ECHO "Iniciando Notepad++.exe"
START notepad.exe
PAUSE
ECHO "ejecucion del programa Notepad.exe"

rem taskkil es el comando que se utiliza para finalizar un proceso en Windows. 
rem"/IM notepad++.exe" especifica el nombre de la imagen (en este caso, el proceso de Notepad++) que se desea finalizar.
rem"/F" se utiliza para forzar la finalización del proceso sin pedir confirmación al usuario.
rem"/T" indica que también se deben finalizar todos los procesos secundarios 
rem(también conocidos como procesos hijos) del proceso principal especificado.
TASKKILL /IM notepad++.exe /F /T

echo "finaliza notepad"
pause>nul
