@ECHO OFF

CLS

cd %userprofile%\OneDrive\escritorio
echo %userprofile%

if not exist ej10bat (
    md ej10bat
    dir > ej10bat\recursos.txt
    echo creado listado de recursos
    pause

) else (
    dir >> ej10bat\recursos.txtx
    echo añadiendo informacion al fichero de recursos.
    pause
)

dir > ej10bat\recursos.txt
cd ..
type \OneDrive\escritorio\ej10bat\recursos.txt