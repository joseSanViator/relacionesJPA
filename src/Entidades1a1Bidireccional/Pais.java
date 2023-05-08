package Entidades1a1Bidireccional;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Pais implements Serializable {
	@Id
	private String nombre;
	private Long poblacion;
	
	@OneToOne (cascade=CascadeType.PERSIST)
	private Bandera bandera;
	
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(Long poblacion) {
		this.poblacion = poblacion;
	}

	public Bandera getBandera() {
		return bandera;
	}

	public void setBandera(Bandera bandera) {
		this.bandera = bandera;
	}

	public Pais() {
		super();
	}

	public Pais(String nombre, Long poblacion, Bandera bandera) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.bandera = bandera;
	}
	
}
