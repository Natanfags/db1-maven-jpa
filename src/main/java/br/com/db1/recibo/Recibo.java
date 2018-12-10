package br.com.db1.recibo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.db1.recibo.pessoa.Pessoa;

@Entity
@Table(name = "recibo")
public class Recibo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "emitente", length = 50, nullable = false)
	private Pessoa emitente;
	
	
	@Column(name = "data Emissao")
	private LocalDate dataEmissao;
}
