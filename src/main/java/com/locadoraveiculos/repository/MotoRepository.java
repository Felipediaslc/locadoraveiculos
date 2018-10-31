package com.locadoraveiculos.repository;

import org.springframework.data.repository.CrudRepository;
import com.locadoraveiculos.models.Moto;

/**
 * Interface utilizada para fazer uma sobrescrita de método do CrudRepository para a classe Moto.
 * 
 * @author Widson.
 * @version 1.0.
 */
public interface MotoRepository extends CrudRepository<Moto, String>{
	Moto findByCodigo(long codigo);
}
