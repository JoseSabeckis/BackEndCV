
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floresjose.app.security.entity.usuario;

@Service
@Transactional
public class usuarioservice {
	@Autowired
	iusuariorepository IUsuarioRepository;
	
	public Optional<com.floresjose.app.security.entity.usuario> getByNombreUsuario(String nombreUsuario){
		return IUsuarioRepository.findByNombreUsuario(nombreUsuario);
	}	
	
	public boolean existByNombreUsuario(String nombreUsuario) {
		return IUsuarioRepository.existByNombreUsuario(nombreUsuario);
	}
	
	public boolean existByEmail(String email) {
		return IUsuarioRepository.existByEmail(email);
	}
	
	public void save(usuario user) {
		IUsuarioRepository.save(user);
	}
	
}
