package com.locadoraveiculos.repository;

import org.springframework.data.repository.CrudRepository;

import com.locadoraveiculos.models.Carro;

public interface CarroRepository extends CrudRepository<Carro, String>{

}