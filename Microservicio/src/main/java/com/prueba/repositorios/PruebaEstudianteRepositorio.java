package com.prueba.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.entidades.PruebaEstudiante;

@Repository
public interface PruebaEstudianteRepositorio extends JpaRepository<PruebaEstudiante, Integer>{

}
