package com.floresjose.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floresjose.app.entity.Experiencia;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>
{
	
	public Optional<Experiencia> findByNombre(String nombreExperiencia);
	
	public boolean existByNombreExperiencia(String nombreExperiencia);

}
