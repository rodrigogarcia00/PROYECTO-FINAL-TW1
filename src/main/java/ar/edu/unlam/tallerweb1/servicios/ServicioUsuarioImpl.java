package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Perfil;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioPerfil;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioUsuario;

@Service
@Transactional
public class ServicioUsuarioImpl implements ServicioUsuario {
	
	@Inject
	private RepositorioUsuario repositorioUsuario;
	
	@Inject
	private RepositorioPerfil repositorioPerfil;

	@Override
	public Usuario registrarUsuario(Usuario usuario) {
		if(repositorioUsuario.consultarUsuarioPorEmail(usuario.getEmail())!=null) {
			throw new UsuarioYaRegistradoException();
		}
			Perfil perfil = new Perfil();
			perfil.setUsuario(usuario);
			
			repositorioPerfil.guardarPerfil(perfil);
			
			return repositorioUsuario.registrarUsuario(usuario);
			
	}

	@Override
	public Usuario consultarUsuarioPorEmail(String email) {
		return repositorioUsuario.consultarUsuarioPorEmail(email);
		
	}

	@Override
	public Usuario consultarUsuarioPorEmailYPassword(String email, String password) {
		return repositorioUsuario.consultarUsuarioPorEmailYPassword(email,password);
		
	}

	@Override
	public void modificarUsuario(Usuario usuario) {
		repositorioUsuario.modificarUsuario(usuario);
		
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		repositorioUsuario.eliminarUsuario(usuario);
		
	}

	@Override
	public List<Usuario> consultarUsuarios() {
		return repositorioUsuario.consultarUsuarios();
	}

	@Override
	public Usuario consultarUsuarioPorId(Long id) {
		return repositorioUsuario.consultarUsuarioPorId(id);
	}

}
