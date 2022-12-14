package com.floresjose.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreExperiencia;
	private String descripcionExperiencia;
	
	public Experiencia() {

	}

	public Experiencia(String nombreExperiencia, String descripcionExperiencia) {
		super();
		this.nombreExperiencia = nombreExperiencia;
		this.descripcionExperiencia = descripcionExperiencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreExperiencia() {
		return nombreExperiencia;
	}

	public void setNombreExperiencia(String nombreExperiencia) {
		this.nombreExperiencia = nombreExperiencia;
	}

	public String getDescripcionExperiencia() {
		return descripcionExperiencia;
	}

	public void setDescripcionExperiencia(String descripcionExperiencia) {
		this.descripcionExperiencia = descripcionExperiencia;
	}
	
	
	
}
