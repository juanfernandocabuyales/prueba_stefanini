package com.prueba.servicios;

import java.util.List;

import com.prueba.dto.PruebaEstudianteDto;

public interface IPruebaEstudianteService {

	List<PruebaEstudianteDto> consultarPruebasEstudiantes();
	
	void crearPruebaEstudiante(PruebaEstudianteDto pruebaEstudianteDto);
	
	void actualizarPruebaEstudiante(PruebaEstudianteDto pruebaEstudianteDto);
	
	void eliminarPruebaEstudiante(Integer eid);
}
