package Dao;
import java.sql.PreparedStatement;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.TransactionalException;

import FabricaConecxao.FabricaJPA;
import entity.Filme;
import entity.Usuario;


public class GenericDao {

	public boolean salvar(Object objeto) {
		EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
		boolean resultado = true;
		try {
			entityManager.getTransaction().begin();
	
			entityManager.persist(objeto);
			
			entityManager.getTransaction().commit();
		} catch (EntityExistsException | TransactionalException  e) {
			FabricaJPA.shutdown();
			resultado = false;
		}
		
		return resultado;
	}
	
	public Usuario carregarUsuario(String cpf) {
		EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
		Usuario resultado;
		try {
			entityManager.getTransaction().begin();

			resultado = entityManager.find(Usuario.class, cpf);

			entityManager.getTransaction().commit();
		} catch (EntityExistsException | TransactionalException e) {
			resultado = null;
			FabricaJPA.shutdown();
		}

		return resultado;
	}
	
	public List<Filme> carregarFilme(String cpf) {
		EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
		List<Filme> resultado = null;
		Usuario usuario;
		try {
			entityManager.getTransaction().begin();

			usuario = entityManager.find(Usuario.class, cpf);

			entityManager.getTransaction().commit();
			if(usuario != null) {
			resultado =  usuario.getFilmes();
			}
		} catch (EntityExistsException | TransactionalException e) {
			resultado = null;
			FabricaJPA.shutdown();
		}

		return resultado;
	}
	
	public List<Filme> adicionarFilme(String cpf, Filme filme) {
		EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
		List<Filme> filmes;
		Usuario usuario;
		try {
			entityManager.getTransaction().begin();

			usuario = entityManager.find(Usuario.class, cpf);
			filmes = usuario.getFilmes();
			filmes.add(filme);
			usuario.setFilmes(filmes);
			entityManager.getTransaction().commit();
		} catch (EntityExistsException | TransactionalException e) {
			filmes = null;
			FabricaJPA.shutdown();
		}

		return filmes;
	}
	
	public boolean removerFilmePorNome(int idFilme){
		boolean resultado = true;
		EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
		try {
			entityManager.getTransaction().begin();
			Query query = entityManager.createQuery(
				      "delete from Filme where id = :i");
			query.setParameter("i", idFilme).executeUpdate();

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			resultado = false;
		}
		return resultado;
	}
	
	public boolean removerUsuarioFilmePorNome(int idFilme) {
		boolean resultado = true;
		EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
		try {
			entityManager.getTransaction().begin();
			Query query = entityManager.createQuery(
				      "delete from Usuario_Filme where filmes_id = :i");
			query.setParameter("i", idFilme).executeUpdate();

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			resultado = false;
		}
		return resultado;
	}
	
	public boolean removerFilme(String cpf, String nomeFilme) {
		EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
		List<Filme> filmes = null;
		Usuario usuario;
		
		boolean resultado = false;
		try {
			int idFilme = 0;
			entityManager.getTransaction().begin();

			usuario = entityManager.find(Usuario.class, cpf);

			entityManager.getTransaction().commit();
			if(usuario != null) {
				filmes =  usuario.getFilmes();
				filmes.forEach(filme ->{
					if(filme.getNomeFilme().equals(nomeFilme)) {
						if(removerUsuarioFilmePorNome(filme.getId())) {
							removerFilmePorNome(filme.getId());
						}
					}
				});
			}
			resultado = true;
		} catch (EntityExistsException | TransactionalException e) {
			filmes = null;
			FabricaJPA.shutdown();
		}

		return resultado;
	}
	
}
