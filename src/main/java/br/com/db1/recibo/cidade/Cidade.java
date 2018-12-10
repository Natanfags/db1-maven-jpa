package br.com.db1.recibo.cidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome", length = 60, nullable = false)
	private String nome;

	@OneToMany	
	@Enumerated(EnumType.STRING)
	@JoinColumn(name = "uf_id", referencedColumnName = "id", nullable = false)
	private Uf uf;

}
