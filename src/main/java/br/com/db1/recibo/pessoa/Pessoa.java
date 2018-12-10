package br.com.db1.recibo.pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome", length = 60, nullable = false)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "documento", length = 14, nullable = false)
	private String documento;
	
}
