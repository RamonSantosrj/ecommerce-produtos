package com.ecommerce.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domain.models.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {

	List<Categoria> findAllByOrderByNomeAsc();
	
	
	
	
}
