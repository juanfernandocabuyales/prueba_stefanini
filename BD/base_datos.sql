-- prueba.pruebaestudiante definition

CREATE TABLE `pruebaestudiante` (
  `Eid` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(200) NOT NULL,
  `Especialidad` varchar(100) NOT NULL,
  `Grado` varchar(100) NOT NULL,
  PRIMARY KEY (`Eid`)
) ENGINE=InnoDB AUTO_INCREMENT=452 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- prueba.pruebainscripcion definition

CREATE TABLE `pruebainscripcion` (
  `Eid` int NOT NULL,
  `NombreClase` varchar(100) DEFAULT NULL,
  `Posicion` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- prueba.pruebaclase definition

CREATE TABLE `pruebaclase` (
  `Nombre` varchar(100) NOT NULL,
  `Horario` varchar(100) DEFAULT NULL,
  `Aula` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO pruebaestudiante (Nombre, Especialidad, Grado) VALUES('JONES', 'HISTORIA', 'GR');
INSERT INTO pruebaestudiante (Nombre, Especialidad, Grado) VALUES('PARKS', 'CONTABILIDAD', 'SO');
INSERT INTO pruebaestudiante (Nombre, Especialidad, Grado) VALUES('BAKER', 'MATEMATICAS', 'GR');
INSERT INTO pruebaestudiante (Nombre, Especialidad, Grado) VALUES('GLASS', 'HISTORIA', 'SN');
INSERT INTO pruebaestudiante (Nombre, Especialidad, Grado) VALUES('BAKER', 'CONTABILIDAD', 'SN');
INSERT INTO pruebaestudiante (Nombre, Especialidad, Grado) VALUES('RUSSELL', 'MATEMATICAS', 'JR');
INSERT INTO pruebaestudiante (Nombre, Especialidad, Grado) VALUES('REY', 'CONTABILIDAD', 'FR');
INSERT INTO pruebaestudiante (Nombre, Especialidad, Grado) VALUES('JONES', 'HISTORIA', 'SN');
INSERT INTO pruebaestudiante (Nombre, Especialidad, Grado) VALUES('prueba', 'DEMO', 'Doce');

INSERT INTO pruebainscripcion (Eid, NombreClase, Posicion) VALUES(100, 'BD445', 1);
INSERT INTO pruebainscripcion (Eid, NombreClase, Posicion) VALUES(150, 'BA200', 1);
INSERT INTO pruebainscripcion (Eid, NombreClase, Posicion) VALUES(200, 'BD445', 2);
INSERT INTO pruebainscripcion (Eid, NombreClase, Posicion) VALUES(200, 'CS250', 1);
INSERT INTO pruebainscripcion (Eid, NombreClase, Posicion) VALUES(300, 'CS150', 1);
INSERT INTO pruebainscripcion (Eid, NombreClase, Posicion) VALUES(400, 'BA200', 2);
INSERT INTO pruebainscripcion (Eid, NombreClase, Posicion) VALUES(400, 'BF410', 1);
INSERT INTO pruebainscripcion (Eid, NombreClase, Posicion) VALUES(400, 'CS250', 2);
INSERT INTO pruebainscripcion (Eid, NombreClase, Posicion) VALUES(450, 'BA200', 3);

INSERT INTO pruebaclase (Nombre, Horario, Aula) VALUES('BA200', 'M-F9', 'SC110');
INSERT INTO pruebaclase (Nombre, Horario, Aula) VALUES('BD445', 'MWF3', 'SC213');
INSERT INTO pruebaclase (Nombre, Horario, Aula) VALUES('BF410', 'MWF8', 'SC213');
INSERT INTO pruebaclase (Nombre, Horario, Aula) VALUES('CS150', 'MWF3', 'EA304');