package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import ar.edu.unlam.tallerweb1.modelo.Perfil;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioPerfil;

public class ServicioPerfilImpl implements ServicioPerfil {
	
	@Inject
	private RepositorioPerfil repositorioPerfil;

	@Override
	public void modificarPerfil(Perfil perfil) {
		repositorioPerfil.modificarPerfil(perfil);
		
	}

	@Override
	public Perfil consultarPerfilPorId(Long id) {
		return repositorioPerfil.consultarPerfilPorId(id);
		
	}

}
