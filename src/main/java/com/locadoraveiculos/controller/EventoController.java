package com.locadoraveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		return "redirect:/eventos";
	}
	
	
	@RequestMapping("/eventos")
	public ModelAndView listaEventos() {
		ModelAndView mv = new ModelAndView("evento/eventos");
		Iterable<Evento> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		return mv;
		
	}
	
	@RequestMapping("/deletarEvento")
	public String deletarEvento(@RequestParam("codigo") long codigo) {
		Evento evento = er.findByCodigo(codigo);
		er.delete(evento);
		return "redirect:/eventos";		
	}
	
	@RequestMapping(value = "/editarEvento", method = RequestMethod.GET)
	public ModelAndView editarEvento(@ModelAttribute("codigo") long codigo) {
		Evento evento = er.findByCodigo(codigo);		
		ModelAndView m = new ModelAndView();
		m.setViewName("/evento/formEditarEvento");
		m.addObject("evento", evento);
		return m;	
	}

}
