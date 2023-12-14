--BOLETÍN EXTRA 2

--PROVINCIAS:

-- Provincia más poblada de las inferiores a 1 millón de habitantes

select provincia from provincias where poblacion < 1000000 order by poblacion desc limit 1;


--Ģmax(poblacion)(σprovincia<1000000)(provincias) -->c1
--Πprovincia(σprovincias)=c1;

select distinct provincia from provincias where poblacion = (select max(poblacion) from provincias where poblacion<1000000);


-- ¿En qué autonomía está la provincia más extensa?

--selecciono el maximo de las superficies de la tabla provincias. (1registro)
--Ģmax(poblacion)(provincias)
 select max(superficie)from provincias; -->c1
 
--Πprovincia(σsuperficie=(c1))
 select distinct autonomia from provincias where superficie = (select max(superficie)from provincias);
 

-- ¿Qué provincias tienen una población por encima de la media nacional?

--cual es la media de poblacion nacional
--ĢAVG(poblacion)(provincias)-->c1
select avg(poblacion)from provincias;
--Πprovincia(σpoblacion>(c1))
select distinct provincia from provincias where poblacion>(select avg(poblacion)from provincias);

-- ¿Qué porcentaje del total nacional representa Cantabria en población?

-- ¿En qué posición del ranking autonómico por población de mayor a menor está Cantabria?

--CICLISTAS: 

-- Obtener el nombre de los puertos de montaña que tienen una altura superior a la altura media de todos los puertos

-- Obtener el nombre y el equipo de los ciclistas que han llevado alg un maillot o que han ganado algun puerto. Muestra la lista ordenada. Recuerda la diferencia entre UNION y UNION ALL

-- ¿Qué codigos de maillots ha llevado Alfonso Guti errez en los puertos que haya ganado

-- ¿Qué equipos no han ganado ningún puerto de montaña?

-- Obtener el nombre de los ciclistas, ordenados alfabéticamente, que pertenecen a un equipo de más de cinco ciclistas y que han ganado alguna etapa, indicando también cuántas etapas han ganado