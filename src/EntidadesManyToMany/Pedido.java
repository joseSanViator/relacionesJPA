package EntidadesManyToMany;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Pedido implements Serializable {
	
	@Id
	private int idPedido;
	@ManyToMany (cascade=CascadeType.PERSIST)
	private List<Producto> productos;
	
	public Pedido() {
	}
	public Pedido(int idPedido, List<Producto> productos) {		
		this.idPedido = idPedido;
		this.productos = productos;
	}	
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}
