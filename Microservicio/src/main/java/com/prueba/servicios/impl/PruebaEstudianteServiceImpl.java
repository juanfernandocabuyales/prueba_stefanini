package com.prueba.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.dto.PruebaEstudianteDto;
import com.prueba.entidades.PruebaEstudiante;
import com.prueba.repositorios.PruebaEstudianteRepositorio;
import com.prueba.servicios.IPruebaEstudianteService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class PruebaEstudianteServiceImpl implements IPruebaEstudianteService {

	private final PruebaEstudianteRepositorio pruebaEstudianteRepositorio;

	@Override
	public List<PruebaEstudianteDto> consultarPruebasEstudiantes() {
		List<PruebaEstudianteDto> listadoDto = new ArrayList<>();
		try {
			List<PruebaEstudiante> listado = pruebaEstudianteRepositorio.findAll();
			if(null != listado && !listado.isEmpty()) {
				listadoDto = listado.stream().map(item -> PruebaEstudianteDto.builder().eid(item.getEid()).nombre(item.getNombre()).especialidad(item.getEspecialidad()).grado(item.getGrado()).build()).toList();
			}
		}catch(Exception e) {
			log.error("No se ha podido realizar la consulta", e);
		}
		return listadoDto;
	}

	@Override
	public void crearPruebaEstudiante(PruebaEstudianteDto pruebaEstudianteDto) {
		try {
			PruebaEstudiante pruebaEstudiante =  new PruebaEstudiante();
			pruebaEstudiante.setNombre(pruebaEstudianteDto.getNombre());
			pruebaEstudiante.setEspecialidad(pruebaEstudianteDto.getEspecialidad());
			pruebaEstudiante.setGrado(pruebaEstudianteDto.getGrado());
			pruebaEstudianteRepositorio.save(pruebaEstudiante);
		}catch(Exception e) {
			log.error("No se ha podido realizar el registro", e);
		}	
	}

	@Override
	public void actualizarPruebaEstudiante(PruebaEstudianteDto pruebaEstudianteDto) {
		try {
			PruebaEstudiante pruebaEstudiante =  new PruebaEstudiante();
			pruebaEstudiante.setEid(pruebaEstudianteDto.getEid());
			pruebaEstudiante.setNombre(pruebaEstudianteDto.getNombre());
			pruebaEstudiante.setEspecialidad(pruebaEstudianteDto.getEspecialidad());
			pruebaEstudiante.setGrado(pruebaEstudianteDto.getGrado());
			pruebaEstudianteRepositorio.save(pruebaEstudiante);
		}catch(Exception e) {
			log.error("No se ha podido realizar la actualizacion", e);
		}	
	}

	@Override
	public void eliminarPruebaEstudiante(Integer eid) {
		try {
			pruebaEstudianteRepositorio.deleteById(eid);
		}catch(Exception e) {
			log.error("No se ha podido realizar el borrado del registro", e);
		}	
	}
}