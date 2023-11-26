-- (01) Listar las edades de todos los ciclistas de Banesto
--Π edad(σ nomequipo= ′Banesto ′(ciclista))
 select distinct edad from ciclista where nomequipo='Banesto';

-- (02) Listar las edades de los ciclistas que son de Banesto o de Navigare
-- Πedad (σnomequipo='Banesto' v nomequipo='Navigare' (ciclista))
select distinct edad from ciclista where nomequipo='Banesto'or nomequipo='Navigare';

-- (03) Listar el dorsal de los ciclistas que son de Banesto y cuya edad está entre 25 y 32
-- Πdorsal (σnomequipo='Banesto' ^ edad between 25 and 32 (ciclista))
Select distinct dorsal from ciclista where nomequipo='banesto' and edad between 25 and 32;

-- (04) Listar el dorsal de los ciclistas que son de Banesto o cuya edad está entre 25 y 32

-- Πdorsal (σnomequipo='Banesto' v edad between 25 and 32 (ciclista))
Select distinct dorsal from ciclista where nomequipo='banesto' or edad between 25 and 32;

-- (05) Listar la inicial del equipo de los ciclistas cuyo nombre comience por R
-- Πleft(nomequipo,1) (σleft(nomequipo,1)='R' (ciclista))
SELECT DISTINCT LEFT(nomequipo, 1) AS inicial_equipo FROM ciclista WHERE LEFT(nombre, 1) = 'R';

-- Πleft(nomequipo,1) σnomequipo like 'R%' (ciclista)
SELECT DISTINCT LEFT(nomequipo, 1) FROM ciclista
  WHERE nomequipo LIKE 'R%';
  
-- (06) Listar el código de las etapas que su salida y llegada sea en la misma población
--Π numetapa(σ salida=llegada(etapa)
select distinct numetapa from etapa where salida=llegada;

-- (07) Listar el código de las etapas que su salida y llegada no sean en la misma población y que conozcamos el dorsal del ciclista que ha ganado
--Π numetapa, dorsal(σ salida!=llegada(etapa))
select distinct numetapa,dorsal from etapa where salida!=llegada;

-- Πnumetapa (σsalida<>llegada ^ dorsal IS NOT NULL (etapa))
SELECT DISTINCT numetapa FROM etapa
  WHERE salida<>llegada AND dorsal IS NOT NULL;


-- (08) Listar el nombre de los puertos cuya altura esté entre 1000 y 2000 o que la altura sea mayor que 2400
-- Πnompuerto (σaltura between 1000 and 2000 v altura>2400 (puerto))
SELECT DISTINCT nompuerto FROM puerto WHERE altura BETWEEN 1000 AND 2000 OR altura > 2400;

-- (09) Listar el dorsal de los ciclistas que hayan ganado los puertos cuya altura esté entre 1000 y 2000 o que la altura sea mayor que 2400
-- Πdorsal σaltura between 1000 and 2000 v altura>2400 (puerto)
select distinct dorsal from puerto where altura between 1000 and 2000 or altura>2400;

-- (10) Listar el número de ciclistas que hayan ganado alguna etapa
--


-- Πdorsal (etapa) -> c1
SELECT DISTINCT dorsal FROM etapa;
-- Ģcount(*) (c1)
SELECT COUNT(*) FROM (
    SELECT DISTINCT dorsal FROM etapa
  )c1;

-- SELECT COUNT(DISTINCT dorsal) FROM etapa;

select count(*) from (select distinct dorsal from etapa)c1;