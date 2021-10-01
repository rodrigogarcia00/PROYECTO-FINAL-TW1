package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

import java.util.List;

// Interface que define los metodos del Repositorio de Usuarios.
public interface RepositorioUsuario {
	
	Usuario consultarUsuarioPorEmailYPassword(String email, String password);
	
	Usuario registrarUsuario(Usuario usuario);
	
    Usuario consultarUsuarioPorEmail(String email);
    
	void modificarUsuario(Usuario usuario);
	
	void eliminarUsuario(Usuario usuario);
	
	List<Usuario> consultarUsuarios();

	Usuario consultarUsuarioPorId(Long id);
	
}
