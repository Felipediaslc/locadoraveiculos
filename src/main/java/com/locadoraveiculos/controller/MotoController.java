package com.locadoraveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.locadoraveiculos.models.Funcionario;
import com.locadoraveiculos.models.Moto;
import com.locadoraveiculos.repository.MotoRepository;

@Controller
public class MotoController {
	@Autowired
	private MotoRepository mr;

	@RequestMapping(value = "/cadastrarMoto", method = RequestMethod.GET)
	public String cadastrarCarro() {
		return "moto/formCadastrarMoto";
	}

	@RequestMapping(value = "/cadastrarMoto", method = RequestMethod.POST)
	public String cadastrarMoto(Moto moto) {
		mr.save(moto);
		return "redirect:/motos";
	}
	
//	@RequestMapping(value="/exibirMotos", method=RequestMethod.GET)
//	public String exibirMotos() {
//		return "moto/motos";
//	}
	
	@RequestMapping("/motos")
	public ModelAndView listaMotos() {
		ModelAndView mv = new ModelAndView("moto/motos");
		Iterable<Moto> motos = mr.findAll();
		mv.addObject("motos", motos);
		return mv;
		
	}

}
