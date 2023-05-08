package Entidades;
import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Persona implements Serializable {
	@Id
	private String dni;
	private String nombre;
	@OneToOne(cascade=CascadeType.PERSIST)
	private Mascota mascota;
	
	public String toString() {
		String cad="Nombre: "+this.nombre+" \nNombre Mascota: "+this.mascota.getNombre()+"\nEspecie: "+this.mascota.getEspecie();
		return cad;
	}
	public Persona() {
	}

	public Persona(String dni, String nombre, Entidades.Mascota mascota) {
		this.dni = dni;
		this.nombre = nombre;
		mascota = mascota;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		mascota = mascota;
	}

}
