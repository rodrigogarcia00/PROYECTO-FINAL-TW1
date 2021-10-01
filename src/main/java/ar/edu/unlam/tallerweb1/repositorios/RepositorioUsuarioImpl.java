package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


@Repository("repositorioUsuario")
public class RepositorioUsuarioImpl implements RepositorioUsuario {

	@Inject
	private SessionFactory sessionFactory;

	@Override
	public Usuario consultarUsuarioPorEmailYPassword(String email, String password) {

		// Se obtiene la sesion asociada a la transaccion iniciada en el servicio que invoca a este metodo y se crea un criterio
		// de busqueda de Usuario donde el email y password sean iguales a los del objeto recibido como parametro
		// uniqueResult da error si se encuentran mas de un resultado en la busqueda.
		final Session session = sessionFactory.getCurrentSession();
		return (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("email", email))
				.add(Restrictions.eq("password", password))
				.uniqueResult();
	}

	@Override
	public Usuario registrarUsuario(Usuario usuario) {
		return (Usuario) sessionFactory.getCurrentSession().save(usuario);
	}

	@Override
	public Usuario consultarUsuarioPorEmail(String email) {
		return (Usuario) sessionFactory.getCurrentSession().createCriteria(Usuario.class)
				.add(Restrictions.eq("email", email))
				.uniqueResult();
	}

	@Override
	public void modificarUsuario(Usuario usuario) {
		sessionFactory.getCurrentSession().update(usuario);
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		sessionFactory.getCurrentSession().delete(usuario);
		
	}

	@Override
	public List<Usuario> consultarUsuarios() {
		return sessionFactory.getCurrentSession().createCriteria(Usuario.class).list();
		
	}

	@Override
	public Usuario consultarUsuarioPorId(Long id) {
		return sessionFactory.getCurrentSession().get(Usuario.class, id);
	}

}
