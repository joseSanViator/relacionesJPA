package main;

import java.util.ArrayList;
import java.util.List;

import Entidades1aMuchos.Gallina;
import Entidades1aMuchos.Granja;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main1aMuchos {

	public static void main(String[] args) {
		
		List<Gallina> gallinas1=new ArrayList<Gallina>();
		List<Gallina> gallinas2=new ArrayList<Gallina>();
		
		gallinas1.add(new Gallina(121,"Paca",4.5));
		gallinas1.add(new Gallina(122,"Rosita",2.7));
		gallinas1.add(new Gallina(123,"Antonia",3.1));
		gallinas1.add(new Gallina(124,"Pepa",3.2));
		gallinas1.add(new Gallina(125,"Juliana",3.4));
		
		gallinas2.add(new Gallina(221,"Davinia",3.2));
		gallinas2.add(new Gallina(222,"Mariana",3.9));
		gallinas2.add(new Gallina(223,"Herminia",4.2));
		
		Granja g1=new Granja(1,"Carretera de Fuensaldaña km 16",gallinas1);
		Granja g2=new Granja(2,"Carretera de Renedo km 25",gallinas2);
		
		//Vamos a meter estas dos granjas con las gallinas en la base de datos.
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("gestorGranja");
		EntityManager em=factory.createEntityManager();
		
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		//Entre begin() y commit() hacemos todas las modificaciones
		em.persist(g1);
		em.persist(g2);
			
		tx.commit();			
	}

}
