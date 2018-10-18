/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Luis Arturo
 * Created: 18/10/2018
 */

CREATE SCHEMA intercabledb;

CREATE TABLE tipo_id(
idtipo serial PRIMARY KEY,
tipo_identificacion varchar(5),
observaciones varchar(100)
);
-- ALTER TABLE phonebook ALTER COLUMN "ID" SET DEFAULT nextval('"tipo_id_idtipo_seq"'::regclass);
--ALTER TABLE tipo_id ALTER COLUMN tipo_identificacion TYPE varchar(5);

--INSERT INTO intercabledb.tipo_id (tipo_identificacion, observaciones) VALUES('Proof','Proof');
SELECT * FROM intercabledb.tipo_id;
SELECT * FROM intercabledb.tipo_em;
SELECT * FROM intercabledb.tipo_id;
--INSERT INTO intercabledb.tipo_id(tipo_identificacion, obsevaciones) VALUES(?,?)
SELECT * FROM intercabledb.empleados;

CREATE TABLE intercabledb.tipo_em(
idtipo serial PRIMARY KEY,
tipo_empleado varchar(50),
tipo_rol varchar(50),
observaciones varchar(100)
);


CREATE TABLE clientes (
idcliente bigserial PRIMARY KEY,
codigo_cliente varchar(25),
identificacion_cliente varchar(25),
nit_cliente varchar(10),
nombre_cliente varchar(200),
apellido_cliente varchar(200),
direccion_cliente varchar(250),
telefono_cliente varchar(20),
email_cliente varchar(150),
tipo_identificacion integer REFERENCES tipo_id(idtipo),
tipo_cliente varchar(5),
fecha_nacimiento date,
status_cliente SMALLINT DEFAULT 1,
fecha_ingreso date
);
SELECT * FROM intercabledb.empleados;
CREATE TABLE empleados (
idempleado bigserial PRIMARY KEY,
codigo_empleado varchar(25),
identifacion_empleado varchar(25),
nit_empleado varchar(10),
nombre_empleado varchar(200),
apellido_empleado varchar(200),
direccion_empleado varchar(250),
telefono_empleado varchar(25),
tipo_identifacion integer REFERENCES tipo_id(idtipo),
tipo_empleado integer REFERENCES tipo_em(idtipo),
fecha_nac date,
status_empleado SMALLINT DEFAULT 1,
fecha_ingreso date,
igss varchar(25),
irtra varchar(25),
tipo_sangre varchar(10),
contacto_emergencia varchar(250),
telefonos_emergencia varchar(25),
salario decimal(12,4),
bonifiacion decimal(10,4),
descuento_igss decimal(10,6),
fecha_despido date,
motivo_despido varchar(300)
);

SELECT * FROM intercabledb.usuario;
SELECT * FROM intercabledb.empleados;

CREATE TABLE usuario(
idusuario bigserial PRIMARY KEY,
usuario varchar(50),
contrasena varchar(256),
tipo_usuario integer REFERENCES tipo_em(idtipo),
idempleado bigint REFERENCES empleados(idempleado),
status_usuario SMALLINT
);
SELECT current_date;
SELECT * FROM intercabledb.valida_usuario('dadas','asdasd');

CREATE OR REPLACE FUNCTION intercabledb.valida_usuario(usr VARCHAR, pass VARCHAR)
RETURNS TABLE (id bigint, us varchar, tipo integer, codigo bigint, sta int, nombre text)
LANGUAGE plpgsql
AS $$
BEGIN
	RETURN QUERY SELECT u.idusuario,u.usuario,u.tipo_usuario,u.idempleado,u.status_usuario, e.nombre_empleado ||' '|| e.apellido_empleado AS nom  FROM usuario u
	INNER JOIN empleados e ON e.idempleado = u.idempleado
	WHERE u.usuario = usr AND u.contrasena = md5(md5(pass));
END;
$$

SELECT to_char(1544334,'0000000000');
SELECT to_char(EXTRACT(YEAR FROM timestamp '2018-10-10'),'0000');

CREATE OR REPLACE FUNCTION intercabledb.ingreso_empleado(iden varchar,nit varchar,nombre varchar,apellido varchar,direccion varchar,
telefono varchar,tipoid int,tipoem int,fecha date,igs varchar,irt varchar,blood varchar,contact varchar, telcon varchar, salario NUMERIC,
boni NUMERIC)
RETURNS void
LANGUAGE plpgsql
AS $$
BEGIN
	DECLARE code TEXT;
			num bigint;

	 SELECT max(idempleado) INTO num FROM intercabledb.empleados;
	 code := 'Usr' || to_char(num,'000000');

	INSERT INTO intercabledb.empleados (identifacacion,nit_empleado,nombre_empleado,apellido_empleado,
                    direccion_empleado,telefono_empleado,tipo_identificacion,tipo_empleado,fecha_nac,
                    fecha_ingreso,igss,irtra,tipo_sangre,contacto_emergencia,telefonos_emergencia,
                    salario,bonificaion,descuento_igss)
   VALUES(code,iden,nit,)

END;
$$


CREATE EXTENSION pgcrypto;
SELECT md5(md5('Hola Mundo'));
SELECT encode(digest('admin','sha256'),'base64');
SELECT crypt('test', tipo_empleado);

CREATE TABLE servicios(
numero_servicio bigserial PRIMARY KEY,
fecha_servicio timestamp,
idcliente bigint REFERENCES clientes(idcliente),
cuota decimal(12,4),
cantidad_tv integer,
idusuario bigint REFERENCES usuario(idusuario),
fecha_instalacion date
);

CREATE TABLE pagos(
idpago bigserial PRIMARY KEY,
fecha_pago timestamp,
numero_servicio bigint REFERENCES servicios(numero_servicio),
idcliente bigint,
nombre_completo varchar(300),
direccion varchar(300),
fecha_instalacion date
);


SELECT substring('11645083',1,7)||'-'||substring('11645083',8,1) AS NIT;
