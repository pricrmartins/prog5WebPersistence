package Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.TransactionalException;

import FabricaConecxao.FabricaJPA;
import entity.Contato;
import entity.Nome;
import entity.Telefone;

public class GenericDao {

	public boolean salvar(Object objeto) {
		EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
		boolean resultado = true;
		try {
			entityManager.getTransaction().begin();
	
			entityManager.persist(objeto);
			
			entityManager.getTransaction().commit();
		} catch (EntityExistsException | TransactionalException  e) {
			resultado = false;
		}finally {
			FabricaJPA.shutdown();
		}
		
		return resultado;
	}
	
	@SuppressWarnings("unchecked")
	public List<Contato> buscarTodosContatos(){
		List<Contato> contatos = null;
		EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
		Query query = entityManager.createQuery("select * from contato");
		contatos  = (List<Contato>)query.getResultList();
		return contatos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Contato> buscarContatosPorNome(String nome){
		List<Contato> contatos = null;
		EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
		Query query = entityManager.createQuery("select * from contato where primeiro like '%:nome%' or segundo like '%:nome%'");
		contatos  = (List<Contato>)query
				.setParameter("nome", nome)
				.getResultList();
		return contatos;
	}
	
	
	
}
