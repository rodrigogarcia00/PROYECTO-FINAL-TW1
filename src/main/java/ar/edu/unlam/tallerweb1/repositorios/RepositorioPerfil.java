package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Perfil;

public interface RepositorioPerfil {
	
	void guardarPerfil(Perfil perfil);
	
	Perfil consultarPerfilPorId(Long id);
	
	void modificarPerfil(Perfil perfil);
	
	

}
