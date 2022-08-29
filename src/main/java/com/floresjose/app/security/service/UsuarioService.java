package com.floresjose.app.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floresjose.app.security.entity.usuario;
import com.floresjose.app.security.repository.iusuariorepository;

@Service
@Transactional
public class UsuarioService {
	
	@Autowired
	iusuariorepository IUsuarioRepository;
	
	//verificar q usuario es
	public Optional<usuario> getByNombreUsuario(String nombreUsuario){
		return IUsuarioRepository.findByNombreUsuario(nombreUsuario);
	}
	
	
	public boolean existsByNombreUsuario(String nombreUsuario) {
		return IUsuarioRepository.existByNombreUsuario(nombreUsuario);
	}
	
	public boolean existsByEmail(String email) {
		return IUsuarioRepository.existByEmail(email);
	}
	
	public void save(usuario user) {
		IUsuarioRepository.save(user);
	}

}
