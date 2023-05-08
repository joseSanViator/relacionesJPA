package EntidadesManyToMany;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Producto implements Serializable {
	@Id
	private int codigoProducto;
	private String nombre;
	@ManyToMany (mappedBy="productos")
	private List<Pedido> pedidos;
	
	public Producto() {
	}
	public Producto(int codigoProducto, String nombre) {
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
	}
	
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}
