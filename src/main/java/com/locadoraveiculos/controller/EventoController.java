package com.locadoraveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.locadoraveiculos.models.Evento;
import com.locadoraveiculos.repository.EventoRepository;

@Controller
public class EventoController {
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String formEvento() {
		return "evento/formEvento";
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String formEvento(Evento evento) {
		er.save(evento);
		return "redirect:/cadastrarEvento";
	}

}
