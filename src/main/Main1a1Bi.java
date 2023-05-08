package main;

import java.util.List;

import Entidades.Persona;
import Entidades1a1Bidireccional.Bandera;
import Entidades1a1Bidireccional.Pais;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main1a1Bi {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("gestorPaises");
		EntityManager em=factory.createEntityManager();		
		
		Pais p1=new Pais("España",(long)47000000,new Bandera(1,"lineas horizontales roja, amarilla y roja"));		
		Pais p2=new Pais("Portugal",(long)10000000,new Bandera(2,"lineas verticales verde y roja"));
		Pais p3=new Pais("Andorra",(long)75000,new Bandera(3,"lineas verticales azul, amarilla y roja"));
		
		//Creamos la transacción
		
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		
		/*em.persist(p1);
		em.persist(p2);
		em.persist(p3);*/
		
		tran.commit();
		
		//Vamos a buscar una bandera y a partir de ella, obtenemos el pais.
		
		String jpql="SELECT b FROM Bandera b";
		Query query=em.createQuery(jpql);
		List<Bandera> banderas=query.getResultList();
		for(Bandera b:banderas) {
				System.out.println(b);
				System.out.println("------------------");
		}	
	}

}
