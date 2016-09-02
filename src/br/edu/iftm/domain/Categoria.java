package br.edu.iftm.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_CATEGORIA")
public class Categoria implements Serializable  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_CATEGORIA")
	private Integer codigo;
	
	@Column(name="NM_CATEGORIA")
	private String nome;
	
	@Column(name="DS_CATEGORIA")
	private String descricao;
	
	@OneToMany(mappedBy="categoria")
	private List<Produto> produtos;
	
}
