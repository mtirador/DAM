-- (1) Nombre y edad de los ciclistas que NO han ganado etapas


-- es lo mismo y slo habria que cambiar los conjuntos de entidades
select distinct c.nombre,c.edad from ciclista c left join etapa e on c.dorsal=e.dorsal where e.dorsal is null;

select distinct c.nombre,c.edad from etapa e right join ciclista c on c.dorsal=e.dorsal where e.dorsal is null;


-- (2) Nombre y edad de los ciclistas que NO han ganado puertos

select distinct c.nombre,c.edad from ciclista c left join puerto p on c.dorsal=p.dorsal where p.dorsal is null;
select distinct c.nombre,c.edad from puerto p right join ciclista c on c.dorsal=p.dorsal where p.dorsal is null;


-- (3) Listar el director de los equipos que tengan ciclistas que NO hayan ganado ninguna etapa

select distinct e.director from equipo e 
inner join ciclista c on e.nomequipo=c.nomequipo
left join etapa t on c.dorsal=t.dorsal where t.dorsal is null;


select distinct director from equipo inner join 
(select * from ciclista left join etapa using(dorsal)where etapa.dorsal is null)c1 using (nomequipo);

-- (4) Dorsal y nombre de los ciclistas que NO hayan llevado ningún maillot


select distinct c.dorsal,c.nombre from ciclista c left join lleva l on c.dorsal=l.dorsal
where l.código is null;


-- (5) Dorsal y nombre de los ciclistas que NO hayan llevado el maillot amarillo NUNCA



Select distinct dorsal,nombre from ciclista left join
(
select distinct dorsal from lleva inner join maillot using(código)
where color='amarillo')c1 using (dorsal)where c1.dorsal is null;



-- (6) Indicar el numetapa de las etapas que NO tengan puertos

select distinct e.numetapa from etapa e left join puerto p on e.numetapa=p.numetapa where p.nompuerto is null
order by e.numetapa asc;

-- (7) Indicar la distancia media de las etapas que NO tengan puertos
select avg(e.kms)from etapa e left join puerto p on e.numetapa=p.numetapa where p.nompuerto is null;


--correccion profesor
select avg(kms)from 
(
Select * from etapa where numetapa not in 
(Select distinct numetapa from puerto)
)c2;


-- (8) Listar el número de ciclistas que NO hayan ganado alguna etapa

select count(distinct c.dorsal)as sin_etapas from ciclista c left join etapa e on c.dorsal=e.dorsal where e.numetapa is null;

-- (9)Listar el dorsal de los ciclistas que hayan ganado alguna etapa que no tenga puerto

select distinct c.dorsal from ciclista c inner join etapa e on c.dorsal=e.dorsal 
left join puerto p on e.numetapa= p.numetapa where p.nompuerto is null;


select distinct etapa.dorsal 
from etapa left join puerto using (numetapa)where puerto.numetapa is null;


-- (10) Listar el dorsal de los ciclistas que hayan ganado únicamente etapas que no tengan puertos

--select distinct c.dorsal from ciclista c inner join etapa e on c.dorsal=e.dorsal 
--left join puerto p on e.dorsal= p.dorsal where p.nompuerto is null;


--correccion

select * from 
(
select distinct etapa.dorsal from etapa left join puerto using(numetapa)
where puerto.numetapa is null
)c1
where dorsal not in 
(
select distinct etapa.dorsal
from etapa inner join puerto using(numetapa)
);