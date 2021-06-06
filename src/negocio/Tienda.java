package negocio;

import java.util.Hashtable;

public class Tienda extends Servicio
{

	private Hashtable<String, Integer> productos;
	
	public Tienda(boolean pPresentaPagoAdicional, double pPrecio, String pIdentificador, String nombre) {
		super(pPresentaPagoAdicional, pPrecio, pIdentificador, nombre);
		productos = new <String, Integer>Hashtable();
		// TODO Auto-generated constructor stub
	}

	public Hashtable<String, Integer> getProductos() {
		return productos;
	}

	public void setProductos(Hashtable<String, Integer> productos) {
		this.productos = productos;
	}
	
	
	
	
	
	
}
