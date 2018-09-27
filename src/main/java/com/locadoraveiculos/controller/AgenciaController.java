package com.locadoraveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.locadoraveiculos.models.Agencia;
import com.locadoraveiculos.repository.AgenciaRepository;

@Controller
public class AgenciaController {
	@Autowired
	private AgenciaRepository ar;

	@RequestMapping(value = "/cadastrarAgencia", method = RequestMethod.GET)
	public String cadastrarAgencia() {
		return "agencia/formCadastrarAgencia";
	}

	@RequestMapping(value = "/cadastrarAgencia", method = RequestMethod.POST)
	public String cadastrarAgencia(Agencia agencia) {
		ar.save(agencia);
		return "redirect:/cadastrarAgencia";
	}

}
