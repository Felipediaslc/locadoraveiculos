package com.locadoraveiculos.repository;

import org.springframework.data.repository.CrudRepository;
import com.locadoraveiculos.models.Cliente;

/**
 * Interface utilizada para fazer uma sobrescrita de método do CrudRepository para a classe Cliente.
 * 
 * @author Widson.
 * @version 1.0.
 */
public interface ClienteRepository extends CrudRepository<Cliente, String>{
	Cliente findByCodigo(long codigo);
}
