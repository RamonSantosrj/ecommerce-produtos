package com.ecommerce.domain.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column(length = 150,nullable = false)
	private String nome;
	
	@Column (nullable = false, precision = 18,scale = 2)
	private BigDecimal preco;
	
	@Column( nullable = false)
	private Integer quantidade;
	
	@Column ( length = 150, nullable = false)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "categoriaId", nullable = false)
	private Categoria categoria;
	
	
	
}
