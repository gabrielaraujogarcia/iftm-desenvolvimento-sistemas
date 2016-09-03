package br.edu.iftm.service.ws;

import br.edu.iftm.domain.Categoria;

public interface ICategoriaService {

	void salvar(Categoria categoria);

	void atualizar(Categoria categoria);

	void excluir(Categoria categoria);

	void buscar(Categoria categoria);

}