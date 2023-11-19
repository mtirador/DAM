Seleccionar todos los registros de la tabla "Ventas" 
que se hayan realizado después del 1 de enero de 2022:

SELECT * FROM Ventas
WHERE FechaVenta > '2022-01-01';


Seleccionar el total de ventas y la fecha correspondiente de la tabla "Ventas" 
que se hayan realizado en el mes de febrero de 2023:

SELECT SUM(TotalVenta), FechaVenta FROM Ventas
WHERE FechaVenta BETWEEN '2023-02-01' AND '2023-02-28';

Seleccionar los registros de la tabla "Compras" 
que se hayan realizado en el último trimestre del año 2022:

SELECT * FROM Compras
WHERE FechaCompra BETWEEN '2022-10-01' AND '2022-12-31';

Seleccionar el número de envíos y la fecha correspondiente de la tabla "Envíos" 
que se hayan realizado en la primera mitad del año 2023:

SELECT COUNT(*) AS NumEnvios, FechaEnvio FROM Envios
WHERE FechaEnvio BETWEEN '2023-01-01' AND '2023-06-30';

..............update...........

ara cambiar la categoría de Adolfo a "Gerente",
 puedes utilizar la siguiente consulta SQL:

UPDATE CLIENTE
SET categoría = 'Gerente'
WHERE nombre = 'Adolfo';


