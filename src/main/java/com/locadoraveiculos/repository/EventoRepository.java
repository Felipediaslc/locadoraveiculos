package com.locadoraveiculos.repository;

import org.springframework.data.repository.CrudRepository;

import com.locadoraveiculos.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
