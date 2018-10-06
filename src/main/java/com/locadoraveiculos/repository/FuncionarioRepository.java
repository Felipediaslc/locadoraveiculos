package com.locadoraveiculos.repository;

import org.springframework.data.repository.CrudRepository;
import com.locadoraveiculos.models.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, String>{
	Funcionario findByCodigo(long codigo);

}
