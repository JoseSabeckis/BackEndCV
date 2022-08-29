package com.floresjose.app.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floresjose.app.security.entity.rol;
import com.floresjose.app.security.enums.rolnombre;

@Repository
public interface irolrepository extends JpaRepository<rol, Integer>{
	Optional<rol> findByRolNombre(rolnombre rolNombre);
}
