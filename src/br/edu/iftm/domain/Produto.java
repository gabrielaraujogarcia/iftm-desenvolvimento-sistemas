package br.edu.iftm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
public class Produto implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_PRODUTO")
	private Integer codigo;
	
	@Column(name="NM_PRODUTO")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="CD_CATEGORIA", referencedColumnName="CD_CATEGORIA")
	private Categoria categoria;
	
	@Column(name="VL_PRECO")
	private Double preco;
	
	@Column(name="QT_ESTOQUE")
	private Integer quantidadeEstoque;
	
	@Column(name="NM_IMAGEM")
	private String nomeImagem;
	
}
