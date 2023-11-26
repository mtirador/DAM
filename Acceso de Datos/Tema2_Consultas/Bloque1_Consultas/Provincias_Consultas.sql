--Posibles consultas de provincias

--Consulta para encontrar la población total por autonomía:


SELECT autonomia, SUM(poblacion) AS PoblacionTotal
FROM provincias
GROUP BY autonomia;
--Esta consulta agrupa las provincias por autonomía y calcula la población total para cada autonomía.

--Consulta para obtener la superficie promedio por provincia en cada autonomía:


SELECT autonomia, provincia, AVG(superficie) AS SuperficiePromedio
FROM provincias
GROUP BY autonomia, provincia;
---Aquí, se agrupan las provincias por autonomía y provincia, y se calcula la superficie promedio para cada combinación.

--Consulta para encontrar la provincia con la mayor población en cada autonomía:


SELECT autonomia, provincia, MAX(poblacion) AS PoblacionMaxima
FROM provincias
GROUP BY autonomia;

--Esta consulta agrupa las provincias por autonomía y encuentra la provincia con la población máxima en cada autonomía.

--Consulta para calcular la población total y la superficie total para todas las autonomías:


SELECT autonomia, SUM(poblacion) AS PoblacionTotal, SUM(superficie) AS SuperficieTotal
FROM provincias
GROUP BY autonomia;
--En esta consulta, se agrupan las provincias por autonomía y se calcula la población total y la superficie total para cada autonomía.


--Para calcular la densidad de población de Galicia, necesitamos dividir la población total de Galicia entre su superficie total. Utilizando la tabla de provincias proporcionada, podemos hacer la siguiente consulta SQL:


SELECT autonomia,
       SUM(poblacion) AS PoblacionTotal,
       SUM(superficie) AS SuperficieTotal,
       SUM(poblacion) / SUM(superficie) AS DensidadPoblacion
FROM provincias
WHERE autonomia = 'Galicia';