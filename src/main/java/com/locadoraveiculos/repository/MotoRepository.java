package com.locadoraveiculos.repository;

import org.springframework.data.repository.CrudRepository;
import com.locadoraveiculos.models.Moto;

public interface MotoRepository extends CrudRepository<Moto, String>{
	Moto findByCodigo(long codigo);
}
