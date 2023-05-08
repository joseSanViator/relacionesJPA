package main;

import java.util.ArrayList;
import java.util.List;

import EntidadesManyToMany.Pedido;
import EntidadesManyToMany.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainManyToMany {

	public static void main(String[] args) {
		
		Producto consolaXbox=new Producto(1,"xbox series x");
		Producto consolaSony=new Producto(2,"Playstation 5");
		Producto raton=new Producto(3,"Logitech g502");
		Producto teclado=new Producto(4,"Razer Huntsman");
		Producto monitor=new Producto(5,"Dell superview");
		Producto portatil=new Producto(6,"Asus rog");
		Producto tarjetaNvidia=new Producto(7,"nVidia 4070");
		Producto tarjetaAMD=new Producto(8,"RX 7600xt");
		Producto telefono=new Producto(9,"iPhone 14");
		Producto telefonoAndroid=new Producto(10,"Oneplus 11");
		
		List<Producto> productosP1=new ArrayList<Producto>();
		List<Producto> productosP2=new ArrayList<Producto>();
		List<Producto> productosP3=new ArrayList<Producto>();
		List<Producto> productosP4=new ArrayList<Producto>();
		
		productosP1.add(consolaXbox);
		productosP1.add(raton);
		productosP1.add(portatil);
		
		productosP2.add(consolaSony);
		productosP2.add(tarjetaNvidia);
		productosP2.add(telefono);
		productosP2.add(monitor);
		
		productosP3.add(tarjetaNvidia);
		productosP3.add(telefonoAndroid);
		productosP3.add(portatil);
		productosP3.add(consolaXbox);
		productosP3.add(raton);

		productosP4.add(tarjetaAMD);
		productosP4.add(raton);
		productosP4.add(teclado);
		productosP4.add(monitor);
		productosP4.add(telefonoAndroid);
		productosP4.add(telefono);
		productosP4.add(consolaSony);
		
		Pedido p1=new Pedido(1,productosP1);
		Pedido p2=new Pedido(2,productosP2);
		Pedido p3=new Pedido(3,productosP3);
		Pedido p4=new Pedido(4,productosP4);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("gestorPedidos");
		EntityManager em=factory.createEntityManager();
		
		//Dado que vamos a insertar datos en la base de datos, tenemos que usar una transacción.
		//Creamos la transacción:
		EntityTransaction tran=em.getTransaction();
		//Iniciamos la transacción:
		tran.begin();
		//realizamos la persistencia de los objetos Pedido:
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		//Ejecutamos los cambios de manera efectiva en la base de datos
		tran.commit();
	}

}
