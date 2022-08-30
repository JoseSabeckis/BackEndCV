package com.floresjose.app.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floresjose.app.entity.Experiencia;
import com.floresjose.app.repository.RExperiencia;

@Service
@Transactional
public class ImpExperienciaService {
	@Autowired
	RExperiencia rExperiencia;
	
	public java.util.List<Experiencia> list(){
		
		return rExperiencia.findAll();
		
	}
	
	public Optional<Experiencia>getOne(int id){
		return rExperiencia.findById(id);
	}
	
	public Optional<Experiencia>getByNombreExperiencia(String nombre){
		return rExperiencia.findByNombre(nombre);
	}
	
	public void save(Experiencia expe) {
		rExperiencia.save(expe);
	}
	
	public void delete(int id) {
		rExperiencia.deleteById(id);
	}
	
	public boolean existById(int id) {
		return rExperiencia.existsById(id);
	}
	
	public boolean existByNombreExperiencia(String nombre) {
		return rExperiencia.existByNombreExperiencia(nombre);
	}
	
	
	
}
