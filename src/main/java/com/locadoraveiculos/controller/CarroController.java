package com.locadoraveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.locadoraveiculos.models.Carro;
import com.locadoraveiculos.repository.CarroRepository;

@Controller
public class CarroController {
	@Autowired
	private CarroRepository cr;

	@RequestMapping(value = "/cadastrarCarro", method = RequestMethod.GET)
	public String cadastrarCarro() {
		return "carro/formCadastrarCarro";
	}

	@RequestMapping(value = "/cadastrarCarro", method = RequestMethod.POST)
	public String cadastrarCarro(Carro carro) {
		cr.save(carro);
		return "redirect:/carros";
	}

//	@RequestMapping(value="/exibirCarros", method=RequestMethod.GET)
//	public String exibirCarros() {
//		return "carro/carros";
//	}

	@RequestMapping("/carros")
	public ModelAndView listaCarros() {
	ModelAndView mv = new ModelAndView("carro/carros");
	Iterable<Carro> carros = cr.findAll();
	mv.addObject("carros", carros);
	return mv;
	}

}
