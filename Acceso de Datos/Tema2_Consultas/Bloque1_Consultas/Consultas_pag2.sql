-- (01) Número de ciclistas que hay
	--Ģcount(*) (ciclista)
SELECT count(*) as total_ciclista from ciclista;

-- (02) Número de ciclistas que hay del equipo Banesto
	--Ģcount(*) (σnomequipo='Banesto' (ciclista))
SELECT COUNT(*)AS CICLISTAS_BANESTO FROM CICLISTA WHERE NOMEQUIPO='BANESTO';

-- (03) Edad media de los ciclistas
--Ģavg(edad) (ciclista)
SELECT AVG(EDAD)AS EDAD_MEDIA FROM CICLISTA;

-- (04) La edad media de los del equipo Banesto
--Ģavg(edad) (σnomequipo='Banesto' (ciclista))
SELECT AVG(EDAD)AS equipo_banesto from ciclista where nomequipo='Banesto';


-- (05) La edad media de los ciclistas por cada equipo
-- nomequipoĢavg(edad) (ciclista)
SELECT AVG(edad) FROM ciclista GROUP BY nomequipo;

-- (06) El número de ciclistas por equipo
--nomequipoĢcount(*) (ciclista)
SELECT COUNT(*)FROM CICLISTA GROUP BY NOMEQUIPO;

-- (07) El número total de puertos
-- Ģcount(nompuerto) (puerto)
SELECT COUNT(nompuerto) FROM puerto;


-- (08) El número total de puertos mayores de 1500
--Ģcount(*) (σaltura>1500 (puerto))
SELECT COUNT(*) FROM puerto WHERE altura>1500;


-- (09) Listar el nombre de los equipos que tengan más de 4 ciclistas



--OTRA FORMA

select distinct nomequipo from ciclista group by nomequipo having count(*)>4;

select distinct nomequipo from ciclista where (select count(*)as c from c.ciclista where c.nomequipo=ciclista.nomequipo)>4 ;


-- (10) Listar el nombre de los equipos que tengan más de 4 ciclistas cuya edad esté entre 28 y 32

-- nomequipoĢnomequipo,count(nomequipo) (σedad between 28 and 32 (ciclista)) -> c1
SELECT nomequipo, COUNT(nomequipo) AS numciclistas FROM ciclista WHERE edad BETWEEN 28 AND 32 GROUP BY nomequipo;

-- Πnomequipo (σnumciclistas>4 (c1))

SELECT DISTINCT c1.nomequipo FROM ( SELECT nomequipo, COUNT(nomequipo) AS numciclistas FROM ciclista WHERE edad BETWEEN 28 AND 32 GROUP BY nomequipo
  )c1 WHERE c1.numciclistas>4;
  
  
  
  --correccion maria:
  
  --(σedad between 28 and 32 (ciclista)) -> c1
  ---- nomequipoĢnomequipo,count(*)numciclistas (c1)-> c2
  -- Πnomequipo (σnumciclistas>4 (c2))
  
  
  Select distinct nomequipo from ciclista where edad between 28 and 32 group by nomequipo having count(*)>4;
  
  

-- (11) Indícame el número de etapas que ha ganado cada uno de los ciclistas
-- dorsalĢcount(numetapa) (etapa)
SELECT COUNT(numetapa) FROM etapa GROUP BY dorsal;

--correccion maria
--dorsalĢcount(*) (etapa)
select count(*)from etapa group by dorsal;

-- (12) Indícame el dorsal de los ciclistas que hayan ganado más de una etapa

-- dorsalĢdorsal,count(numetapa) (etapa) -> c1
SELECT dorsal, COUNT(numetapa) AS e_ganadas FROM etapa GROUP BY dorsal;

-- Πdorsal (σetapasganadas>1 (c1))
SELECT DISTINCT c1.dorsal FROM ( SELECT dorsal, COUNT(numetapa) AS e_ganadas FROM etapa GROUP BY dorsal )c1
  WHERE c1.e_ganadas>1;
  
  
  -- correccion maria
  
  -- 
  select distinct dorsal from etapa group by dorsal having count(*)>1;