package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioUsuario;
import ar.edu.unlam.tallerweb1.servicios.UsuarioYaRegistradoException;

@Controller
public class ControladorUsuario {
	
	@Inject
	private ServicioUsuario servicioUsuario;
	
	@RequestMapping("/login")
	public ModelAndView irALogin() {

		ModelMap modelo = new ModelMap();
		
		modelo.put("datosLogin", new DatosLogin());
	
		return new ModelAndView("login", modelo);
	}
	
	
	@RequestMapping(path = "/validar-login", method = RequestMethod.POST)
	public ModelAndView validarLogin(@ModelAttribute("datosLogin") DatosLogin datosLogin, HttpServletRequest request) {
		ModelMap model = new ModelMap();

		Usuario usuarioBuscado = servicioUsuario.consultarUsuarioPorEmailYPassword(datosLogin.getEmail(), datosLogin.getPassword());
		if (usuarioBuscado != null) {
			request.getSession().setAttribute("ROL", usuarioBuscado.getRol());
			return new ModelAndView("redirect:/home");
		} else {
		
			model.put("error", "Usuario o clave incorrecta");
		}
		return new ModelAndView("login", model);
	}
	

		
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView inicio() {
			return new ModelAndView("redirect:/login");
		}
	
	
	@RequestMapping(path="/registrar-usuario")
	public ModelAndView irARegistrarUsuario() {
		
		return new ModelAndView("registrar-usuario");
		
	}
	

	@RequestMapping(path="/registrar-usuario", method=RequestMethod.POST)
	public ModelAndView validarRegistarUsuario(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request) {
		ModelMap modelo = new ModelMap();
		
		try {
			servicioUsuario.registrarUsuario(usuario);
		}catch(UsuarioYaRegistradoException e) {
			modelo.put("error", "El usuario ya esta registrado");
			return new ModelAndView("registrar-usuario",modelo);
		}
		
		return new ModelAndView("registrar-usuario");
		
	}

}
