package Entidades1aMuchos;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Gallina implements Serializable {
	@Id
	private int idChip;
	private String nombre;
	private double peso;
	
	public Gallina() {
	}
	
	public Gallina(int idChip, String nombre, double peso) {
		this.idChip = idChip;
		this.nombre = nombre;
		this.peso = peso;
	}

	public int getIdChip() {
		return idChip;
	}

	public void setIdChip(int idChip) {
		this.idChip = idChip;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
