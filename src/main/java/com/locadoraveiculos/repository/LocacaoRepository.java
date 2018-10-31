package com.locadoraveiculos.repository;


import org.springframework.data.repository.CrudRepository;
import com.locadoraveiculos.models.Locacao;

/**
 * Interface utilizada para fazer uma sobrescrita de método do CrudRepository para a classe Locacao.
 * 
 * @author Widson.
 * @version 1.0.
 */
public interface LocacaoRepository extends CrudRepository<Locacao, String>{
	Locacao findByCodigo(long codigo);
}
