package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Perfil;

public interface ServicioPerfil {
	
	void modificarPerfil(Perfil perfil);
	
	Perfil consultarPerfilPorId(Long id);
	
}
