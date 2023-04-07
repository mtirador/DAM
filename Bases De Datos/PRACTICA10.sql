

//Teoria

estamos en marzo 
Select Date_Format(Now(),'estamos en %M');

SELECT CONCAT('Estamos en ', ELT(month(now()), 'Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'));

SELECT CONCAT('NACI EN', ELT(DAYS(NOW()),'LUNES','MARTES','MIERCOLES','JUEVES','VIERNES','SABADO','DOMINGO'));


1.

. En la base de datos ALQUILERES visualizar los precios de alquiler diario de los
automóviles de la marca SEAT actuales, los mismos valores incrementados en un
4.5% redondeando el nuevo precio a entero hacia arriba e incrementados en un 4.5%
redondeados a entero.

SELECT PRECIO,PRECIO*1.045, CEIL(PRECIO*1.045),ROUND(PRECIO*1.045)
FROM AUTOMOVILES
WHERE MARCA='SEAT';

select precio, ceil(precio*1.045) as "Precio*1,45", round(precio*1.045,2)
from automoviles
where marca="seat";


2.(CORREGIR)

SELECT DATEDIFF(FFINAL,FINICIAL)/PRECIO,TRUNCATE(X,4),ROUND(X,2)
FROM CONTRATOS NATURAL JOIN AUTOMOVILES 
WHERE FFINAL IS NOT NULL;

datediff(FFINAL,FINICIAL)
dias_contrato/precio_coche

Obtener esa relación de las formas: truncada con dos decimales y truncada con
cuatro decimales y redondeada con dos decimales.

SELECT truncate(datediff(FFINAL,FINICIAL)/precio,2),truncate(datediff(FFINAL,FINICIAL)/precio,4), 
round(datediff(FFINAL,FINICIAL)/precio,2), NUMCONTRATO, precio
from contratos natural join automoviles 
where ffinal is not null ;



3. 

SELECT LEFT(NOMBRE,6),LEFT(APELLIDOS,10),NOMBRE,APELLIDOS
FROM CLIENTES;

LEFT(cadena, N)
Devuelve los N primeros caracteres por la izquierda de cadena.


4.


//CONCAT_WS(separador,cad1,cad2,...)

SELECT CONCAT_WS("--------",APELLIDOS, NOMBRE)
FROM CLIENTES;
 
SELECT CONCAT_WS(' ', REPEAT('_',8), APELLIDOS, NOMBRE) FROM CLIENTES;
 
 
 5.
 
 
 
 SELECT MATRICULA, ELT(ALQUILADO+1,'LIBRE','OCUPADO')AS ALQUILADO
 FROM AUTOMOVILES;
 
 
 6(MIRAR EN CASA)
 //RPAD(cad, longitud, cad2);
 //LPAD(cad, longitud, cad2);
 
 SELECT RPAD(MARCA,40,'.'),LPAD(PRECIO,10,'.')
 FROM AUTOMOVILES;
 
		CONCAT(MARCA,' ', MODELO)
SELECT RPAD(CONCAT(MARCA,' ', MODELO),40,'.') AS COCHE ,LPAD(PRECIO,10,'.') AS PRECIO
FROM AUTOMOVILES;
 
SELECT RPAD(CONCAT(MARCA,' ', MODELO),40,'.') COCHE ,LPAD(PRECIO,10,'.') PRECIO
FROM AUTOMOVILES;
 
 
 7 
  %O QUE TERMINA EN O
 O% QUE EMPIEZA EN O
 %O% QUE CONTIENE LA O
 

SELECT NOMBRE,APELLIDOS FROM CLIENTES WHERE APELLIDOS LIKE '%O%';
 
 
 
 8



SELECT MATRICULA, UPPER(MARCA) AS MARCA FROM AUTOMOVILES;

//UPDATE AUTOMOVILES set marca=upper(marca);
 
 
 9.
 

SELECT NOMBRE, LENGTH(APELLIDOS) AS LONGITUD_APELLIDOS FROM CLIENTES;
 
 
 10.
 //EL 3 ES POR QUE CHAR EMPEZAMOS
 
SELECT INSERT(APELLIDOS,3,5,'MYSQL') FROM CLIENTES;






11.


SELECT CONCAT(LEFT(APELLIDOS,2),'MYSQL',RIGHT(APELLIDOS,LENGTH(APELLIDOS)-2))FROM CLIENTES;




12.

//INSTR(cadena, subcadena, posicion, ocurrencia)


SELECT DIRECCION,INSTR (DIRECCION,',')FROM CLIENTES;



13.

SELECT DIRECCION,INSERT(DIRECCION,INSTR(DIRECCION,','),1,'-')FROM CLIENTES;



14.


SELECT NOMBRE, APELLIDOS, DIRECCION FROM CLIENTES WHERE MONTH(FECHAEXP)=10;


15


SELECT NOMBRE,APELLIDOS,CONCAT('EL DIA ',DAY(FECHAEXP),' DE ',MONTHNAME(FECHAEXP),' DE ',YEAR(FECHAEXP))AS FECHA
FROM CLIENTES
ORDER BY FECHAEXP DESC LIMIT 4;

SET LC_TIME_NAMES='es_ES'; //PARA PONERLO EN ESPAÑOL Y NO EN EL IDIOMA PREDETERMINADO




16.Cual es la hora actual con el formato Son las 15 horas 13 minutos

SELECT CURTIME();

SELECT DATE_FORMAT(CURTIME(),'SON LAS %H horas %i minutos');


17

SELECT '1992-04-02', 
ELT(WEEKDAY('1992-04-02')+1,'LUNES','MARTES','MIERCOLES','JUEVES','VIERNES','SABADO','DOMINGO');

SELECT CONCAT('NACI EN', ELT(DAY(NOW()),'LUNES','MARTES','MIERCOLES','JUEVES','VIERNES','SABADO','DOMINGO'));


18

SELECT DATEDIFF (CURDATE(),'1992-04-02');


19




20

SELECT INTERVAL(5,1,3,8,19,30);

SELECT INTERVAL(9,1,3,8,19,30);

SELECT INTERVAL(35,1,3,8,19,30);


































