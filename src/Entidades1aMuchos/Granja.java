package Entidades1aMuchos;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Granja implements Serializable{
	@Id
	private int codigo;
	private String direccion;
	@OneToMany (cascade=CascadeType.PERSIST)
	private List<Gallina> gallinas;
	
	public Granja() {
	}

	public Granja(int codigo, String direccion, List<Gallina> gallinas) {

		
		this.codigo = codigo;
		this.direccion = direccion;
		this.gallinas = gallinas;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public List<Gallina> getGallinas() {
		return gallinas;
	}

	public void setGallinas(List<Gallina> gallinas) {
		this.gallinas = gallinas;
	}
	

}
