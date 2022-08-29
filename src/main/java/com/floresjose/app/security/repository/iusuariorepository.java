package com.floresjose.app.security.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iusuariorepository extends JpaRepository<com.floresjose.app.security.entity.usuario, Integer>{
	Optional<com.floresjose.app.security.entity.usuario> findByNombreUsuario(String nombreUsuario);
	
	boolean existByNombreUsuario(String nombreUsuario);
	boolean existByEmail(String email);
}
