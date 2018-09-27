package com.locadoraveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.locadoraveiculos.models.Funcionario;
import com.locadoraveiculos.repository.FuncionarioRepository;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository fr;

	@RequestMapping(value = "/cadastrarFuncionario", method = RequestMethod.GET)
	public String cadastrarFuncionario() {
		return "funcionario/formCadastrarFuncionario";
	}

	@RequestMapping(value = "/cadastrarFuncionario", method = RequestMethod.POST)
	public String cadastrarFuncionario(Funcionario funcionario) {
		fr.save(funcionario);
		return "redirect:/cadastrarFuncionario";
	}

}
