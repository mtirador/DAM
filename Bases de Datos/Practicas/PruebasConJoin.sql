Para unir las tablas cliente y pedido utilizando inner join puedo utilizar esto

SELECT C.NOMBRE, C.APELLIDO1, P.TOTAL, P.FECHA
FROM CLIENTE C INNER JOIN PEDIDO P ON C.ID = P.ID_CLIENTE;




Obtener el nombre de los clientes, la comisión de su comercial 
y el total de todos los pedidos que ha realizado cada cliente:

SELECT c.nombre, co.comisión, SUM(p.total) AS total_pedidos
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
INNER JOIN comercial co ON p.id_comercial = co.id
GROUP BY c.id;


Obtener el nombre y apellidos de los clientes que han realizado algún pedido y 
la comisión de su comercial:

SELECT c.nombre, c.apellido1, c.apellido2, co.comisión
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
INNER JOIN comercial co ON p.id_comercial = co.id;


Obtener el número de pedidos realizados por cada cliente y la ciudad donde reside:

SELECT c.nombre, c.ciudad, COUNT(p.id) AS num_pedidos
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
GROUP BY c.id;


Obtener el nombre de los clientes que han realizado algún pedido y su categoría, junto con el nombre y apellidos del comercial 
encargado de cada uno de sus pedidos:

SELECT c.nombre, c.categoría, co.nombre, co.apellido1, co.apellido2
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
INNER JOIN comercial co ON p.id_comercial = co.id;


.............................................LEFT JOIN......

Mostrar todos los clientes y los pedidos que han realizado, si los han hecho:

SELECT c.id, c.nombre, c.apellido1, p.total, p.fecha
FROM cliente c
LEFT JOIN pedido p
ON c.id = p.id_cliente;


Mostrar los nombres y apellidos de los comerciales, junto con los totales de los pedidos que han atendido 
(si los hay):

SELECT co.nombre, co.apellido1, SUM(p.total) AS total_ventas
FROM comercial co
LEFT JOIN pedido p
ON co.id = p.id_comercial
GROUP BY co.id;

Mostrar todos los clientes y los comerciales
que han atendido sus pedidos (si los han atendido):

SELECT c.nombre, c.apellido1, co.nombre AS nombre_comercial, co.apellido1 AS apellido_comercial
FROM cliente c
LEFT JOIN pedido p
ON c.id = p.id_cliente
LEFT JOIN comercial co
ON p.id_comercial = co.id;



............RIGHT JOIN.....................

Mostrar todos los pedidos y los comerciales correspondientes, incluso si no hay coincidencias de clientes

SELECT p.id, p.total, p.fecha, c.nombre AS nombre_cliente, com.nombre AS nombre_comercial
FROM pedido p
RIGHT JOIN cliente c ON p.id_cliente = c.id
RIGHT JOIN comercial com ON p.id_comercial = com.id;


Mostrar todos los clientes y sus pedidos correspondientes, 
incluso si no hay coincidencias de pedidos

SELECT c.id, c.nombre, p.total, p.fecha
FROM cliente c
RIGHT JOIN pedido p ON c.id = p.id_cliente;




.................................



examen a

2
ALTER TABLE COMERCIAL
MODIFY  COMISION DEC(3,2);

3


4


5
SELECT * FROM PEDIDO 
WHERE TOTAL BETWEEN 500 AND 1500 ORDER BY FECHA DESC LIMIT 10;



6
SELECT * FROM CLIENTE
 WHERE(APELLIDO1 LIKE 'C%' OR APELLIDO1 LIKE 'R%')AND
 APELLIDO2 IS NOT NULL ORDER BY APELLIDO1,APELLIDO2,NOMBRE;

7
SELECT C.ID, C.NOMBRE, C.APELLIDO1, SUM(P.TOTAL) AS TOTAL_PEDIDOS FROM COM
ERCIAL C INNER JOIN PEDIDO P ON C.ID = P.ID_COMERCIAL GROUP BY C.ID, C.NOMBRE, C.APELLIDO1 O
RDER BY C.APELLIDO1, C.NOMBRE;


8

SELECT DISTINCT C.NOMBRE, C.APELLIDO1
FROM COMERCIAL C INNER JOIN PEDIDO P ON C.ID=P.ID_COMERCIAL
WHERE P.ID_CLIENTE=(SELECT ID FROM CLIENTE WHERE NOMBRE='MARIA' AND APELLIDO1='SANTANA');

9
SELECT C2.NOMBRE, C2.APELLIDO1, C2.CIUDAD 
FROM CLIENTE C2 INNER JOIN PEDIDO P ON C2.ID=P.ID_CLIENTE;

SELECT c.nombre, c.ciudad, c.categoría, p.total, p.fecha, p.id_comercial
FROM cliente c
LEFT JOIN pedido p ON c.id = p.id_cliente
ORDER BY c.id;

10

EXAMEN B;


ALTER TABLE CLIENTE
MODIFY CIUDAD VARCHAR(33)DEFAULT('SANTANDER'):



SELECT FROM COMERCIAL co inner join pedido p
on co.id=id.comercial inner join
cliente c on c.id=id_cliente
where c.ciudad='sevilla';


6

SELECT MAX(cantidad),id_cliente, fecha
from pedido 
group by id_cliente,fecha;

7

SELECT SUM(CANTIDAD)
FROM CLIENTE INNER JOIN PEDIDO
ON CLIENTE.ID=ID_CLIENTE
GROUP BY CLIENTE.ID
HAVING SUM(CANTIDAD)>5000;




8
SELECT NOMBRE, APELLIDO1
FROM CLIENTE  INNER JOIN PEDIDO ON CLIENTE.ID=ID_CLIENTE
WHERE ID_COMERCIAL=5;


9


SELECT NOMBRE,APELLIDO1,COUNT(Pedido.id)
FROM COMERCIAL LEFT JOIN PEDIDO 
ON COMERCIAL.ID = ID_COMERCIAL
GROUP BY id_comercial;


10

SELECT COMERCIAL.*
FROM COMERCIAL
WHERE COMISIÓN>
(SELECT COMISIÓN FROM COMERCIAL WHERE NOMBRE='DIEGO' AND APELLIDO1='FLORES');