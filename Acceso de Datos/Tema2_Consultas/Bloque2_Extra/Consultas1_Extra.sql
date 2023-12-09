-- BOLETÍN EXTRA Nº1 (sobre la base de datos de provincias)

-- (01) Listado de provincias

--Πprovincia(provincias)
Select distinct provincia from provincias;

-- (02) ¿Cuánto suman 2 y 3?
-- Ģ2+3
Select 2+3;

-- (03) ¿Cuánto vale la raíz cuadrada de 2?
--Ģsqrt(2)
select sqrt(2);

-- (04) Listado de autonomías
--Πautonomia(provincias)
select distinct autonomia from provincias;

-- (05) Provincias que empiezan por A

--Πprovincia(σprovincia like 'a%'(provincias))
select distinct provincia from provincias where provincia like 'a%';

-- (06) Densidades de población de las provincias
--Πprovincia,poblacion/superficie as densidad (provincias)
select distinct provincia, poblacion/superficie as densidad from provincias;

-- (07) ¿Cuántos caracteres tiene cada nombre de provincia?
--Πprovincia,char_length(provincia)as numCaracter(provincias)
select distinct provincia,char_length(provincia)as numCaracter from provincias;

-- (08) Provincias con el mismo nombre que su comunidad autónoma
--Πprovincia (σprovincia=autonomia(provincias))
select distinct provincia from provincias where autonomia=provincia;

-- (09) Provincias que contienen el diptongo 'ue'
--Πprovincia (σprovincia like '%ue%'(provincias))
select distinct provincia from provincias where provincia like '%ue%';

-- (10) ¿Qué provincias tienen nombre compuesto?
--Πprovincia (σprovincia like '% %'(provincias))
 select distinct provincia from provincias where provincia like'% %';

-- (11) ¿Qué provincias tienen nombre simple?
--Πprovincia (σprovincia not like '% %'(provincias))
 select distinct provincia from provincias where provincia not like'% %';

-- (12) Autonomías terminadas en 'ana'
--Πautonomia (σautonomia like '%ana'(provincias))
select distinct autonomia from provincias where autonomia like '%ana';

-- (13) ¿Cuántos caracteres tiene cada nombre de comunidad autónoma? Ordena el resultado por el nombre de la autonomía de forma descendente

--Πautonomia,char_length(autonomia)(provincias)   
select distinct autonomia, char_length(autonomia)as caracteres from provincias order by caracteres desc;

-- (14) ¿Qué autonomías tienen nombre compuesto? Ordena el resultado alfabéticamente en orden inverso
--Πautonomia (σautonomia like '% %'(provincias))
select distinct autonomia from provincias where autonomia like'% %' order by autonomia desc;

-- (15) ¿Qué autonomías tienen provincias con nombre compuesto? Ordenar el resultado alfabéticamente
--Πautonomia (σprovincia like '% %'(provincias))
select distinct autonomia from provincias where provincia like'% %' order by autonomia asc;