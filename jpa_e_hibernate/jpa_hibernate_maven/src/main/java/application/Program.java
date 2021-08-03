package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Person;

public class Program {

	public static void main(String[] args) {

		  // Adicionar ao banco de dados
//        Person p1 = new Person(null, "Jose Meurer", "jose@gmail.com");
//        Person p2 = new Person(null, "Joao Limeira", "joao@gmail.com");
//        Person p3 = new Person(null, "Leticia da Silva", "leticia@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test-jpa");
		EntityManager em = emf.createEntityManager();

	      // Adicionar ao banco de dados
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit();
		
		//Buscar no banco de dados
//		Person p = em.find(Person.class, 3);
//		
//		System.out.println(p);
		
		//Remover do banco de dados
		Person p = em.find(Person.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Ready!!");
		em.close();
		emf.close();
	}
}
