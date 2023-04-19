--ESTO ES PARA HACER METODOS EN BASES DE DATOS


Delimiter //

CREATE PROCEDURE LISTADOS()
BEGIN
	SELECT * FROM CLIENTES;
	SELECT * FROM AUTOMOVILES;
	
	END//
	DELIMITER ;
	
	CALL LISTADOS();
	


DELIMITER //
CREATE PROCEDURE numcontratos(m char(7),out c int)

BEGIN
	SELECT * FROM AUTOMOVILES WHERE MATRICULA=m;
	SELECT count(*)into c from contratos
	where matricula=m;
	
END //

DELIMITER ;

CALL numcontratos('3273BGH',@n);


--para borrar se usa :      DROP PROCEDURE NUMCONTRATOS;



VARIABLES

SET @X=5;
SET @Z=”HOLA”;
SELECT @X, @Z;

SET @X=@X-1;

SELECT @X;



Variables Locales:

DECLARE nombre tipo[DEFAULT valor];
Ej: Declare x int default 7;
	Declare z char(6) default ’lunes’;









DELIMITER //
CREATE PROCEDURE numcontratos(m char(7),out c int)

BEGIN DECLARE X INT;
	SELECT * FROM AUTOMOVILES WHERE MATRICULA=m;
	SELECT count(*)into c from contratos
	where matricula=m;
	SET X=C;
	SELECT 'CONTRATOS',X;
	
END //

DELIMITER ;

CALL numcontratos('3273BGH',@n);






DELIMITER //
CREATE PROCEDURE ejemplo1(p int)

BEGIN
	declare a int;
	set a=5;
	set a=p+5;
		select a;
	
END //

DELIMITER ;


Set @x=10;



call ejemplo1(8);
call ejemplo1(@x);

select @x;






DELIMITER //
CREATE PROCEDURE ejemplo2(p1 int,inout p2 int)

BEGIN

	declare a int default 5;
	set a=5;
	set p2=p1+a;
	select p1;
	
END //

DELIMITER ;

set @x=10;
call ejemplo2(@x,@x);
select @x;
call ejemplo2(4, @x);
select @x;







DELIMITER //
CREATE PROCEDURE ejem3(p1 int,inout p2 int)

BEGIN

	declare a int default 5;
	set a=5;
	set p2=p1+a+p2;
	select p1;
	
END //

DELIMITER ;


set @x=10;
call ejem3(@x,@x);

select @x;
call ejem3(4, @x);

select @x;










-- CREANDO FUNCIONES




DELIMITER //
CREATE FUNCTION SALUDO(a char(20))
Returns char(30)
Begin
Declare x char(30)default 'hola';
SET X =concat (x,a,'!!');
Return x;
END //

DELIMITER ;


SELECT SALUDO('CARACOLA');
SELECT SALUDO('DON PEPITO');