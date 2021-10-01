package ar.edu.unlam.tallerweb1.repositorios;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;



import ar.edu.unlam.tallerweb1.modelo.Perfil;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Repository
public class RepositorioPerfilImpl implements RepositorioPerfil{
	
	@Inject
	private SessionFactory sessionFactory;

	@Override
	public void guardarPerfil(Perfil perfil) {
		sessionFactory.getCurrentSession().save(perfil);
		
	}


	@Override
	public Perfil consultarPerfilPorId(Long id) {
		Perfil perfilBuscado = sessionFactory.getCurrentSession().get(Perfil.class, id);
		return perfilBuscado;
	}

	@Override
	public void modificarPerfil(Perfil perfil) {
		sessionFactory.getCurrentSession().update(perfil);
		
	}

}
