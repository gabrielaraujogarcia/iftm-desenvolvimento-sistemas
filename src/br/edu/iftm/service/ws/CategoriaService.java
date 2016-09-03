package br.edu.iftm.service.ws;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.domain.Categoria;
import br.edu.iftm.model.dao.CategoriaDao;

@WebService(serviceName="ws/categoria")
public class CategoriaService implements ICategoriaService {
	
	@Inject
	private CategoriaDao categoriaDao;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="categoria") Categoria categoria) {
		categoriaDao.salvar(categoria);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="categoria") Categoria categoria) {
		categoriaDao.atualizar(categoria);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="categoria") Categoria categoria) {
		categoriaDao.excluir(categoria);
	}
	
	@Override
	@WebMethod
	public void buscar(@WebParam(name="categoria") Categoria categoria) {
		categoriaDao.buscar(categoria);
	}
}
