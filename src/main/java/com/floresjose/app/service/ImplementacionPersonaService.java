package com.floresjose.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floresjose.app.entity.persona;
import com.floresjose.app.interfaces.IPersonaService;
import com.floresjose.app.repository.IPersonaRepository;

@Service
public class ImplementacionPersonaService implements IPersonaService{

	@Autowired IPersonaRepository personaRepositorio;
	
	@Override
	public List<persona> getPersona() {
		List<persona> lista = personaRepositorio.findAll();
		return lista;
	}

	@Override
	public void savePersona(persona people) {
		
		personaRepositorio.save(people);
		
	}

	@Override
	public void borrarPersona(Long id) {
		personaRepositorio.deleteById(id);		
		
	}

	@Override
	public persona buscarPersona(Long id) {
		persona person = personaRepositorio.findById(id).orElse(null);
		
		return person;
	}

}
