package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Program {

	public static void main(String[] args) {
		
		System.out.println("INICIO");
	
		Pessoa p1 = new Pessoa(null,"Wagner Augusto de Andrade", "wagner@gmail.com");
		Pessoa p2 = new Pessoa(null,"Marina Amorim Moura", "marina@gmail.com");
		Pessoa p3 = new Pessoa(null,"Bruna da Silva", "bruna@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();  	
		System.out.println("OK!");
		
		em.close();
		emf.close();
	}
}

