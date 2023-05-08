package main;

import java.util.List;

import Entidades.Mascota;
import Entidades.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main {

	public static void main(String[] args) {
		
		Persona p1=new Persona("71150050Z","Jose",new Mascota("12","Pixel","Gato"));
		Persona p2=new Persona("76215147Z","Julia",new Mascota("13","Luna","Perro"));
		Persona p3=new Persona("79663321L","Maria",new Mascota("14","Ron","Gato"));
		Persona p4=new Persona("78458156P","David",new Mascota("15","Copito","Perro"));
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("gestorVeterinario");
		EntityManager em=factory.createEntityManager();
		
		//Como vamos a insertar información en la BD, tenemos que crear e iniciar una transacción.
		//Creamos la transacción
		EntityTransaction tran=em.getTransaction();
		//Iniciamos la transacción
		tran.begin();
		//Persistimos (guardamos) los objetos Persona en la base de datos
		/*em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);*/
		//hacemos commit para que la persistencia se ejecute.
		tran.commit();
		
		
		String jpql="Select p from Persona p";
		Query query=em.createQuery(jpql);
		List<Persona> personas=query.getResultList();
		for(Persona p:personas) {
			System.out.println(p);
			System.out.println("-----------------------");
		}	
	}
}
