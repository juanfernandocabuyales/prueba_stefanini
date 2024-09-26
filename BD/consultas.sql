
/**
	Consulta para el punto 6 de la prueba Tecnica
*/
SELECT Especialidad, count(Especialidad) AS cantidad FROM pruebaestudiante p 
GROUP BY Especialidad
HAVING COUNT(Especialidad) > 1
ORDER BY Especialidad


/**
	Consulta para el punto 7 de la prueba Tecnica
*/
SELECT pi.NombreClase FROM pruebainscripcion pi
INNER JOIN pruebaclase pc ON pc.Nombre = pi.NombreClase 
WHERE pc.Horario = 'M-F9'