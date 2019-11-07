package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;




public class Program {

	public static void main(String[] args) {
		
		System.out.println("INICIO");
	
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 15);		
		
		System.out.println(p);
		
		
		System.out.println("OK!");
		
		em.close();
		emf.close();
	}
}

