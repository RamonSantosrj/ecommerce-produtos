package com.ecommerce.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domain.models.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer>{

	List<Produto> findAllByCategoriaIdOrderByNomeAsc(Integer id);
	
	
}
