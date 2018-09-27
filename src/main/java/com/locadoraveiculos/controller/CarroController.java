package com.locadoraveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		return "redirect:/cadastrarCarro";
	}

}
