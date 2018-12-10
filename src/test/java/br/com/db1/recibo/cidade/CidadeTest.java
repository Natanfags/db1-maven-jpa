package br.com.db1.recibo.cidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CidadeTest {
	
	EntityManager em;
	
	@Before
	public void setUp() {
		EntityManagerFactory efm = Persistence.createEntityManagerFactory("db1start");
		em = efm.createEntityManager();
		em.getTransaction().begin();
	}
		
	@After
	public void after() {
		em.getTransaction().commit();
		em.close();
	}
	
	@Test
	public void deveSalvarUmaNovaCidade() {
		Cidade cidade = new Cidade("Curitiba", Uf.PR);
		em.persist(cidade);
	}
	
	@Test
	public void deveAlterarCidade() {
		Query query = em.createQuery("select c from Cidade c where c.nome = :pNome");
		query.setParameter("pNome", "Curitiba");
		query.setMaxResults(1);
		Cidade cidade = (Cidade) query.getSingleResult();
		cidade.alteraNome("Campo Mourão");
		em.persist(cidade);
	}
}

