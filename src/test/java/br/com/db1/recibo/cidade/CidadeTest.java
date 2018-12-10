package br.com.db1.recibo.cidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class CidadeTest {
	
	@Test
	public void deveSalvarUmaNovaCidade() {
		Cidade cidade = new Cidade("Maringa", Uf.PR);
		
		EntityManagerFactory efm = Persistence.createEntityManagerFactory("db1start");
		EntityManager em = efm.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(cidade);
		
		em.getTransaction().commit();
		em.close();
		                  
	}
	
}
