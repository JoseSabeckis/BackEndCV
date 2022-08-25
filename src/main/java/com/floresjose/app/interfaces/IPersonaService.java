package com.floresjose.app.interfaces;

import java.util.List;

import com.floresjose.app.entity.persona;

public interface IPersonaService {

	public List<persona> getPersona();
	
	public void savePersona(persona people);
	
	public void borrarPersona(Long id);
	
	public persona buscarPersona(Long id);
	
}
