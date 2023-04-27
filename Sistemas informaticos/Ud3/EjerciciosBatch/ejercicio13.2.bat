@echo off

cls

if exist E:\ goto existe else goto noexiste

rem despues del else goto tiene que ir el noexiste porque si.
:noexiste
echo no existe
pause > nul

:existe
echo el usb existe
pause > nul


exit