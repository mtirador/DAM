-- (1) Listar el nombre y edad de los ciclistas que han ganado etapas

select nombre, edad FROM ciclista WHERE dorsal IN (select DISTINCT dorsal FROM etapa);


select c.nombre, c.edad FROM ciclista c INNER JOIN (select DISTINCT dorsal FROM etapa) e ON c.dorsal = e.dorsal;

select distinct c.nombre,c.edad from ciclista c inner join etapa e on c.dorsal=e.dorsal;

select distinct nombre,edad from ciclista inner join etapa using(dorsal);


-- (2) Listar el nombre y edad de los ciclistas que han ganado puertos

select distinct c.nombre,c.edad from ciclista c inner join (select distinct dorsal from puerto)e on c.dorsal=e.dorsal;
select distinct nombre,edad from ciclista where dorsal in (select distinct dorsal from puerto);

select distinct c.nombre,c.edad from ciclista c inner join puerto p on c.dorsal=p.dorsal;
-- (3) Listar el nombre y edad de los ciclistas que han ganado etapas y puertos

select DISTINCT c.nombre, c.edad FROM ciclista c
 INNER JOIN etapa e ON c.dorsal = e.dorsal 
 INNER JOIN puerto p ON e.dorsal = p.dorsal;
 
 --(no funca lo de abajo)
 select distinct nombre,edad from ciclista inner join using(dorsal) inner join puerto using(dorsal);


-- (4) Listar el director de los equipos que tengan ciclistas que hayan ganado alguna etapa

select distinct e.director from equipo e inner join ciclista c on e.nomequipo=c.nomequipo inner join etapa t on c.dorsal=t.dorsal;

-- (5) Listar el dorsal y nombre de los ciclistas que hayan llevado algún maillot

select DISTINCT c.dorsal, c.nombre FROM ciclista c INNER JOIN lleva l ON c.dorsal = l.dorsal;

select distinct c.dorsal,c.nombre from ciclista c inner join lleva l on c.dorsal=l.dorsal inner join maillot t on l.código=t.código;
-- (6) Listar el dorsal y nombre de los ciclistas que hayan llevado el maillot amarillo
select distinct c.dorsal,c.nombre from ciclista c 
inner join lleva l on c.dorsal=l.dorsal 
inner join maillot t on l.código=t.código where t.color='amarillo';

-- (7) Listar el dorsal de los ciclistas que hayan llevado algún maillot y que hayan ganado etapas

select DISTINCT c.dorsal from ciclista c
INNER JOIN lleva l ON c.dorsal = l.dorsal
INNER JOIN etapa e ON l.numetapa =e.numetapa;
-- (8) Indicar el numetapa de las etapas que tengan puertos

select distinct numetapa from puerto;
-- (10) Listar el número de ciclistas que hayan ganado alguna etapa con puerto

select distinct e.dorsal from etapa e inner join puerto p on e.numetapa=p.numetapa;




-- (11) Indicar el nombre de los puertos que hayan sido ganados por ciclistas de Banesto

select distinct p.nompuerto from puerto p inner join ciclista c on p.dorsal=c.dorsal where c.nomequipo="banesto";

-- (12) Listar el número de las etapas que tengan puerto que hayan sido ganadas por ciclistas de Banesto con más de 200km

Select distinct e.numetapa 
from etapa e inner join ciclista c on e.dorsal=c.dorsal where c.nomequipo='banesto' and e.kms>200;

select DISTINCT e.numetapa FROM etapa e
inner join puerto p ON e.numetapa = p.numetapa
INNER JOIN ciclista c ON e.dorsal = c.dorsal
WHERE c.nomequipo = 'Banesto' and e.kms > 200;
