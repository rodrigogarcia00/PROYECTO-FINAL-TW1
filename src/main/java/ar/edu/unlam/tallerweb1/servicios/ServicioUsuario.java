package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface ServicioUsuario {
	
	public Usuario registrarUsuario(Usuario usuario);
	
	public Usuario consultarUsuarioPorId(Long id);
	
	public Usuario consultarUsuarioPorEmail(String email);
	
	public Usuario consultarUsuarioPorEmailYPassword(String email, String password);
	
	public void modificarUsuario(Usuario usuario);
	
	public void eliminarUsuario(Usuario usuario);
	
	public List<Usuario> consultarUsuarios();
	

}
