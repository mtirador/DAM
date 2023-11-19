1

SELECT * FROM automoviles;

2

SELECT * FROM clientes;

3

SELECT * FROM contratos;

4

SELECT apellidos,nombre FROM clientes;
5


SELECT apellidos,nombre 
FROM clientes ORDER BY apellidos ASC;

6
SELECT matricula_automoviles,finicial 
FROM contratos ORDER BY finicial ASC;
7

SELECT DISTINCT matricula_automoviles FROM contratos;
8

SELECT nombre,apellidos FROM clientes
 WHERE localidad="Toledo";
9

SELECT nombre,apellidos FROM clientes 
WHERE localidad="Madrid" AND carnet="C1";
10

SELECT * FROM clientes WHERE dni="00740365";
11

SELECT matricula,finicial FROM contratos 
WHERE finicial<"2008-03-25";

12

SELECT * FROM contratos 
WHERE finicial="2009-11-24";

13


SELECT matricula_automoviles,finicial,ffinal 
FROM contratos 
WHERE finicial>="2008-03-01" AND finicial<="2008-03-31";

14
SELECT matricula,finicial,ffinal 
FROM contratos WHERE finicial BETWEEN "2008-03-01" AND "2008-03-31";



SELECT matricula,finicial,ffinal 
FROM contratos WHERE MONTH(finicial)=3 AND YEAR(finicial)=2008;


15

SELECT matricula,marca,modelo 
FROM automoviles WHERE alquilado=false;

16

SELECT matricula,marca,modelo 
FROM automoviles WHERE alquilado=false AND kilometros<20000;

17

SELECT nombre,apellidos 
FROM clientes WHERE apellidos LIKE "B%";

18

SELECT * FROM contratos WHERE numcontrato=19;

SELECT * FROM contratos 
WHERE numcontrato>=7 AND numcontrato<=12 OR numcontrato=19;

19

SELECT * FROM contratos 
WHERE numcontrato IN (7,8,9,10,11,12,19);

20

SELECT numcontrato,finicial,ffinal,kinicial,kfinal 
FROM contratos WHERE ffinal IS NOT NULL;

21

SELECT numcontrato,finicial AS "Fecha inicial",ffinal AS "Fecha final",kinicial AS "Kms iniciales",kfinal AS "Kms finales"
FROM contratos
WHERE ffinal IS NOT NULL;

22

SELECT dni,nombre,apellidos FROM clientes WHERE YEAR(CURDATE())-YEAR(fechaexp);

23

SELECT marca,modelo

SELECT CONCAT(marca_marcas," ",modelo) AS coche FROM automoviles ORDER BY marca_marcas,modelo ASC;
--SELECT CONCAT(marca_marcas," ",modelo) AS coche FROM automoviles ORDER BY marca_marcas DESC, modelo DESC;

24

SELECT CONCAT("El cliente: ",dni," Contrato el: ",matricula) AS "Contratos realizados" FROM contratos;