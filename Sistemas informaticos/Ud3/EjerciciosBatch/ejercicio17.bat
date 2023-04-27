@ECHO Off

REM Hace que las variables se puedan manejar de forma local
SETLOCAL ENABLEDELAYEDEXPANSION
for %%i in (0 1 2 3 4 5 6 7 8 9 A B C D E F) do (
	for %%j in (0 1 2 3 4 5 6 7 8 9 A B C D E F) do (
		CLS
		CALL color %%i%%j
		ECHO Mira que colores tiene la consola!
		set /p continuar=Introduzca una s para salir

		REM Exclamaciones para trabajar con variable local
		REM (Valor dinámico)
		echo Valor de la variable !continuar!
		
		REM Porcentajes para trabajar con variable global
		REM (Valor estático)
		echo Valor de la variable %continuar%
		pause > nul
		if !continuar!==s GOTO salir
	) 
)

:salir
color 07
echo Hasta luego!
pause > nul
