package Entidades1a1Bidireccional;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bandera implements Serializable {
	
	@Id
	private int id;
	private String descripción;
	
	@OneToOne (mappedBy="bandera")
	private Pais pais;
	
	public String toString() {
		String cad="ID: "+this.id+"\nDescripcion:"+this.descripción+"\nPais:"+this.pais.getNombre()+"\nPoblacion:"+this.pais.getPoblacion();
		return cad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getDescripción() {
		return descripción;
	}


	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}


	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}


	public Bandera() {
		super();
	}

	public Bandera(int id, String descripción) {
		super();
		this.id = id;
		this.descripción = descripción;
	}
	

}
