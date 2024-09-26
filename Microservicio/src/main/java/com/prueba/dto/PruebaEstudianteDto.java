package com.prueba.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PruebaEstudianteDto {

	private Integer eid;
	
	private String nombre;
	
	private String especialidad;
	
	private String grado;
}
