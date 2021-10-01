package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioPerfil;

@Controller
public class ControladorPerfil {
	
	@Inject
	private ServicioPerfil servicioPerfil;
	
	@RequestMapping(path="/mi-perfil")
	public ModelAndView irAPerfil() {
		ModelMap modelo = new ModelMap();
		modelo.put("",22);
		return new ModelAndView("perfil",modelo);
	}

}
