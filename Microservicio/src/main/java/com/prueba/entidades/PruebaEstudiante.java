package com.prueba.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pruebaestudiante")
public class PruebaEstudiante implements Serializable{
	
	private static final long serialVersionUID = 1218105749505579534L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Especialidad")
	private String especialidad;
	
	@Column(name = "Grado")
	private String grado;

}
