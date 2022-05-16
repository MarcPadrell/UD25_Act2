DROP TABLE IF EXISTS `departamentos`;
DROP table IF EXISTS empleados;


CREATE TABLE `departamentos` (
  `codigo` int NOT NULL,
  `nombre` varchar(250) DEFAULT NULL,
  `presupuesto` int DEFAULT NULL,
  PRIMARY KEY (`codigo`)
);

CREATE TABLE `empleados` (
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(250) DEFAULT NULL,
  `apellidos` varchar(250) DEFAULT NULL,
  `dep_cod` int DEFAULT NULL,
  PRIMARY KEY (`dni`),
  CONSTRAINT `empleados_fk` FOREIGN KEY (`dep_cod`) REFERENCES `departamentos` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
);


insert into departamentos (codigo ,nombre, presupuesto)values(2,'IT',5000);
insert into departamentos (codigo ,nombre, presupuesto)values(3,'RRHH',1500);
insert into departamentos (codigo ,nombre, presupuesto)values(5,'Director', 22);
insert into departamentos (codigo ,nombre, presupuesto)values(1,'Reuniones',990);
insert into departamentos (codigo ,nombre, presupuesto)values(15,'Seguridad',36000);

insert into empleados (dni, nombre, apellidos, dep_cod) values ('25845632','Jose','Sentis',1);
insert into empleados (dni, nombre, apellidos, dep_cod) values ('75314862','Arnau','Marin',5);
insert into empleados (dni, nombre, apellidos, dep_cod) values ('15263258','Ester','Esplai',15);
insert into empleados (dni, nombre, apellidos, dep_cod) values ('74123659','Eduardo','Pala',2);
