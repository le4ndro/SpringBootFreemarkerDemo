package br.com.leandro.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.leandro.model.Contato;

public interface ContatoRepository extends CrudRepository<Contato, Long>{
	List<Contato> findByNome(String nome);
}
