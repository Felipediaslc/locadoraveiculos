package com.locadoraveiculos.repository;

import org.springframework.data.repository.CrudRepository;
import com.locadoraveiculos.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String>{

}
