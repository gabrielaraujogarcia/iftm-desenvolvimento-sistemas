package br.edu.iftm.service.rs;

import javax.inject.Inject;

import br.edu.iftm.domain.Categoria;
import br.edu.iftm.model.dao.CategoriaDao;
import br.edu.iftm.service.ws.ICategoriaService;

public class CategoriaService implements ICategoriaService {
	
	@Inject
	private CategoriaDao categoriaDao;
	
	public void salvar(Categoria categoria) {
		categoriaDao.salvar(categoria);
	}
	
	public void atualizar(Categoria categoria) {
		categoriaDao.atualizar(categoria);
	}
	
	public void excluir(Categoria categoria) {
		categoriaDao.excluir(categoria);
	}
	
	public void buscar(Categoria categoria) {
		categoriaDao.buscar(categoria);
	}
}
