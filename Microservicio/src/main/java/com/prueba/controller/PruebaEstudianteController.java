package com.prueba.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dto.PruebaEstudianteDto;
import com.prueba.servicios.IPruebaEstudianteService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/pruebaEstudiante")
@AllArgsConstructor
public class PruebaEstudianteController {

	private final IPruebaEstudianteService pruebaEstudianteService;
	
	@GetMapping("/consultar")
    public ResponseEntity<List<PruebaEstudianteDto>> consultar() {
    	return ResponseEntity.ok(pruebaEstudianteService.consultarPruebasEstudiantes());
    }
	
	@PostMapping("/crear")
    public ResponseEntity<Void> crear(@RequestBody PruebaEstudianteDto request) {
    	pruebaEstudianteService.crearPruebaEstudiante(request);
    	return ResponseEntity.ok().build();
    }
	
	@PutMapping("/actualizar")
    public ResponseEntity<Void> actualizar(@RequestBody PruebaEstudianteDto request) {
    	pruebaEstudianteService.actualizarPruebaEstudiante(request);
    	return ResponseEntity.ok().build();
    }
	
	@DeleteMapping("/eliminar/{eid}")
    public ResponseEntity<Void> eliminar(@PathVariable(name = "eid") Integer eid) {
    	pruebaEstudianteService.eliminarPruebaEstudiante(eid);
    	return ResponseEntity.ok().build();
    }
}
