/*creacion de la base de datos */

DROP DATABASE IF EXISTS ikigai;
CREATE DATABASE ikigai;

USE ikigai;

/* crear las tablas */

-- objetivos

CREATE OR REPLACE TABLE objetivos(
codobj INT AUTO_INCREMENT,
denominacion VARCHAR(100),
fechalimite DATE,
descripcion varchar(500),
completado TINYINT(1) DEFAULT 0,
PRIMARY KEY(codobj)

);


-- entradas
CREATE OR REPLACE TABLE entradas(
identrada int AUTO_INCREMENT,
titulo VARCHAR(100),
descripcion VARCHAR(500),
fechaentrada DATE,
PRIMARY KEY (identrada)
);


-- registranP
CREATE OR REPLACE TABLE registropensamientos(
regpen int AUTO_INCREMENT,
identrada int(10),
codpen int(10),
PRIMARY KEY (regpen)

);

-- pensamientos
CREATE OR REPLACE TABLE pensamientos(
codpen INT AUTO_INCREMENT,
intrusivo BOOLEAN,
recurrente BOOLEAN,
positivo BOOLEAN,
PRIMARY KEY(codpen)

);

-- registranE

CREATE OR REPLACE TABLE registroemociones(
regemo int AUTO_INCREMENT,
identrada int(10),
codemo int(10),
PRIMARY KEY(regemo)
);

-- emociones

CREATE OR REPLACE TABLE emociones(
codemo int AUTO_INCREMENT,
intensidad VARCHAR(100), --('Muy Baja', 'Baja', 'Moderada', 'Alta', 'Muy Alta'),
agradable BOOLEAN,
PRIMARY KEY (codemo)

);


-- tipos
CREATE OR REPLACE TABLE tiposemociones(
idtipos int AUTO_INCREMENT,
codemo int (10),
tipos varchar (100),
PRIMARY KEY (idtipos)

);

-- sensaciones

CREATE OR REPLACE TABLE sensaciones(
codsensa int AUTO_INCREMENT,
descripcion varchar (500),
denominacion VARCHAR(500),
localizacioncorporal VARCHAR(500), --('Cabeza','Cuello', 'Pecho', 'Estomago', 'Espalda', 'Manos', 'Pies', 'Otro'),
PRIMARY KEY (codsensa)
);


-- registranS
CREATE OR REPLACE TABLE registrosensaciones(
regsensa int AUTO_INCREMENT,
identrada int(10),
codsensa int(10),
PRIMARY KEY (regsensa)

);


/** Creación de las restricciones **/

-- Relación entre entradas y pensamientos
ALTER TABLE registropensamientos
  ADD CONSTRAINT fk_registropensamientos_entradas
  FOREIGN KEY (identrada)
  REFERENCES entradas(identrada),


  ADD CONSTRAINT fk_registropensamientos_pensamientos
  FOREIGN KEY (codpen)
  REFERENCES pensamientos(codpen),
  
  ADD CONSTRAINT uk_entradas_pensamientos
  UNIQUE KEY (identrada,codpen);
  

-- Relación entre entradas y emociones

ALTER TABLE registroemociones
  ADD CONSTRAINT fk_registroemociones_entradas
  FOREIGN KEY (identrada)
  REFERENCES entradas(identrada),


  ADD CONSTRAINT fk_registroemociones_emociones
  FOREIGN KEY (codemo)
  REFERENCES emociones(codemo),
  
  ADD CONSTRAINT uk_entradas_emociones
  UNIQUE KEY (identrada,codemo); 

-- Relación entre emociones y tipos de emociones (atributo multivaluado)

ALTER TABLE tiposemociones
  ADD CONSTRAINT fk_tiposemociones_emociones
  FOREIGN KEY (codemo)
  REFERENCES emociones(codemo),
  
  ADD CONSTRAINT uk_tiposemociones_emociones
  UNIQUE KEY (codemo,tipos); 

-- Relación entre entradas y sensaciones
ALTER TABLE registrosensaciones
  ADD CONSTRAINT fk_registrosensaciones_entradas
  FOREIGN KEY (identrada)
  REFERENCES entradas(identrada),


  ADD CONSTRAINT fk_registrosensaciones_sensaciones
  FOREIGN KEY (codsensa)
  REFERENCES sensaciones(codsensa),
  
  ADD CONSTRAINT uk_entrada_sensaciones
  UNIQUE KEY (identrada,codsensa);