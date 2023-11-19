
1
CREATE DATABASE P8;
USE P8;


CREATE TABLE usuarios(
id Smallint (5) unsigned not NULL AUTO_INCREMENT,
Nombre varchar (30) NOT NULL,
curso Smallint (5) UNSIGNED DEFAULT NULL,
PRIMARY KEY (id)
) ENGINE = InnoDB;

INSERT INTO USUARIOS(ID,NOMBRE,CURSO)
VALUES(1,'PAULA',1);
INSERT INTO USUARIOS(ID,NOMBRE,CURSO)
VALUES(2,'SILVIA',1);
INSERT INTO USUARIOS(ID,NOMBRE,CURSO)
VALUES(3,'CARLOS',2);
INSERT INTO USUARIOS(ID,NOMBRE,CURSO)
VALUES(4,'RUTH',5);
INSERT INTO USUARIOS(ID,NOMBRE,CURSO)
VALUES(5,'JOSÉ ANTONIO',NULL);



2

CREATE TABLE cursos (
id smallint(5) unsigned NOT NULL AUTO_INCREMENT,
nombre varchar(50) NOT NULL,
PRIMARY KEY (id)
) ENGINE=InnoDB;

INSERT INTO CURSOS(NOMBRE)
VALUES('HTML5');
INSERT INTO CURSOS(NOMBRE)
VALUES('CSS3');
INSERT INTO CURSOS(NOMBRE)
VALUES('JAVASCRIPT');
INSERT INTO CURSOS(NOMBRE)
VALUES('PHP');
INSERT INTO CURSOS(NOMBRE)
VALUES('MYSQL');

3

ALTER TABLE usuarios
ADD FOREIGN KEY (curso) REFERENCES cursos (id)
ON UPDATE CASCADE ON DELETE CASCADE;

//Comprueba que todo está correcto con show create table USUARIOS;

4

SELECT usuarios.nombre, cursos.nombre
FROM usuarios INNER JOIN cursos on usuarios.curso = cursos.id;
-------
SELECT USUARIOS.NOMBRE AS USUARIO,CURSOS.NOMBRE CURSO
FROM usuarios INNER JOIN cursos on usuarios.curso = cursos.id;

5
SELECT usuarios.nombre, cursos.nombre
FROM usuarios LEFT JOIN cursos on usuarios.curso = cursos.id;

6

SELECT usuarios.nombre, cursos.nombre
FROM usuarios RIGHT JOIN cursos on usuarios.curso = cursos.id;

RIGHT JOIN rara vez se utilizan ya que se puede expresar el mismo resultado utilizando un LEFT
JOIN. Esto puede ser más eficiente y más rápido para la base de datos para analizar:

(ERROR)

SELECT usuarios.nombre, cursos.nombre
FROM usuarios LEFT JOIN usuarios on usuarios.curso = cursos.id; 

7

SELECT usuarios.nombre, cursos.nombre
FROM usuarios
LEFT JOIN cursos on usuarios.curso = cursos.id;

SELECT usuarios.nombre, cursos.nombre
FROM usuarios
RIGHT JOIN cursos on usuarios.curso = cursos.id;



8

mysqldump -u root -p P8>copiaP8.sql

mysql>source 'c:/BD/COPIAp8.SQL'



