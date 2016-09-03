package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.domain.Categoria;

public interface ICategoriaDao {

	void salvar(Categoria categoria);
	void atualizar(Categoria categoria);
	void excluir(Categoria categoria);
	List<Categoria> buscar(Categoria categoria);

}