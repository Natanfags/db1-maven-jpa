package br.com.db1.recibo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recibo")
public class Recibo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "valor", precision = 14, scale = 2)
	private Double valor;

	@Column(name = "data emissao")
	private LocalDate dataEmissao;
}
