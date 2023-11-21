--(11) Listar el número de etapas que tengan puerto

-- Πnumetapa (puerto) -> c1
SELECT DISTINCT numetapa FROM puerto;
-- Ģcount(*) (c1)
SELECT COUNT(*) FROM (SELECT DISTINCT numetapa FROM puerto)c1;
-- (12) Listar el número de ciclistas que hayan ganado algún puerto
-- Πdorsal (puerto) -> c1
SELECT DISTINCT dorsal FROM puerto;
-- Ģcount(*) (c1)
SELECT COUNT(*) FROM (
    SELECT DISTINCT dorsal FROM puerto
  )c1;
-- (13) Listar el código de la etapa con el número de puertos que tiene
-- numetapaĢcount(*) (puerto)
SELECT numetapa, COUNT(*) FROM puerto
  GROUP BY numetapa;
  

-- (14) Indicar la altura media de los puertos
-- Ģavg(altura) (puerto)
SELECT AVG(altura) FROM puerto;

-- (15) Indicar el código de etapa cuya altura media de sus puertos está por encima de 1500


-- numetapaĢnumetapa,avg(altura) (puerto) -> c1
SELECT numetapa, AVG(altura) alturamedia FROM puerto
  GROUP BY numetapa;
-- Πnumetapa (σalturamedia>1500 (c1))
SELECT DISTINCT c1.numetapa FROM (
    SELECT numetapa, AVG(altura) alturamedia FROM puerto
    GROUP BY numetapa
  )c1
  WHERE c1.alturamedia>1500;

SELECT DISTINCT numetapa FROM puerto
  GROUP BY numetapa
  HAVING AVG(altura)>1500;
 

-- (16) Indicar el número de etapas que cumplen la condición anterior

--Ģcount(*) (consulta anterior)

select count(*) from (select distinct numetapa from puerto group by numetapa having avg(altura)>1500)c2; 


-- numetapaĢnumetapa,avg(altura) (puerto) -> c1
-- Πnumetapa (σalturamedia>1500 (c1)) -> c2
-- Ģcount(*) (c2)
SELECT COUNT(*) FROM (
    SELECT DISTINCT numetapa FROM puerto
    GROUP BY numetapa
    HAVING AVG(altura)>1500
  )c2;

-- (17) Listar el dorsal del ciclista con el número de veces que ha llevado algún maillot

--π dorsal, (dorsalĢCOUNT(código)(lleva))
Select dorsal, count(código)from lleva group by dorsal;

--maria
-- dorsalĢdorsal,count(*) (lleva)
SELECT dorsal, COUNT(*) FROM lleva
  GROUP BY dorsal;
  
-- (18) Listar el dorsal del ciclista con el código de maillot y cuántas veces ese ciclista ha llevado ese maillot

-- dorsal,códigoĢdorsal,código,count(*) (lleva)
SELECT dorsal, código, COUNT(*) FROM lleva
  GROUP BY dorsal, código;

-- (19) Listar el dorsal, el código de etapa, el ciclista y el número de maillots que ese ciclista ha llevado en cada etapa

----dorsal,numetapa,códigoĢCOUNT(código)as numero_maillotsj(lleva))
Select dorsal,numetapa,código, count(*)as numero_maillots from lleva group by dorsal,numetapa;

