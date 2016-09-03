package br.edu.iftm.model.dao;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.domain.Categoria;

@Model
public class CategoriaDao implements ICategoriaDao {
	
	@PersistenceContext(unitName="SistemaEcommercePU")
	private EntityManager entityManager;
	
	@Transactional
	public void salvar(Categoria categoria) {
		entityManager.persist(categoria);
	}
	
	/* (non-Javadoc)
	 * @see br.edu.iftm.model.dao.ICategoriaDao#atualizar(br.edu.iftm.domain.Categoria)
	 */
	@Override
	@Transactional
	public void atualizar(Categoria categoria) {
		Categoria merge = entityManager.merge(categoria);
		entityManager.persist(merge);
	}
	
	/* (non-Javadoc)
	 * @see br.edu.iftm.model.dao.ICategoriaDao#excluir(br.edu.iftm.domain.Categoria)
	 */
	@Override
	@Transactional
	public void excluir(Categoria categoria) {
		Categoria merge = entityManager.merge(categoria);
		entityManager.remove(merge);
	}
	
	/* (non-Javadoc)
	 * @see br.edu.iftm.model.dao.ICategoriaDao#buscar(br.edu.iftm.domain.Categoria)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Categoria> buscar(Categoria categoria) {
		Query query = entityManager.createQuery("from Categoria");
		return query.getResultList();
	}
	
}
