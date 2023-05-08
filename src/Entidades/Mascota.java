package Entidades;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mascota implements Serializable {
	@Id
	private String id;
	private String nombre;
	private String especie;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String raza) {
		this.especie = raza;
	}

	public Mascota() {
		super();
	}

	public Mascota(String id, String nombre, String raza) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especie = raza;
	}

}
