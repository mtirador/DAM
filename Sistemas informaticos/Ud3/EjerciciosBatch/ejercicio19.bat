@echo off

cls
rem esto lo hace todo: md %userprofile%\OneDrive\Escritorio\EJ19bat\sub1\sub2

mkdir C:\Users\buffy\OneDrive\Escritorio\EJ19bat
mkdir C:\Users\buffy\OneDrive\Escritorio\EJ19bat\sub1
mkdir C:\Users\buffy\OneDrive\Escritorio\EJ19bat\sub1\sub2

cd C:\Users\buffy\OneDrive\Escritorio\EJ19bat\sub1\sub2

md %userprofile%\OneDrive\Escritorio\EJ19bat\sub1a

tree %userprofile%\OneDrive\Escritorio > %userprofile%\OneDrive\Escritorio\EJ19bat\sub1a\listado.txt

type C:\Users\buffy\OneDrive\Escritorio\EJ19bat\sub1a\listado.txt

copy C:\Users\buffy\OneDrive\Escritorio\EJ19bat\sub1a\listado.txt C:\Users\buffy\OneDrive\Escritorio\EJ19bat\sub1

type C:\Users\buffy\OneDrive\Escritorio\EJ19bat\sub1\listado.txt


echo se acabo esta practica de mierda
pause > nul