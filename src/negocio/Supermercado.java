package negocio;

import java.util.Hashtable;

public class Supermercado extends Servicio{

	
	private Hashtable<String, Integer> productos;
	
	public Supermercado(boolean pPresentaPagoAdicional, double pPrecio, String pIdentificador, String pNombre) {
		
		super(pPresentaPagoAdicional, pPrecio, pIdentificador, pNombre);
		// TODO Auto-generated constructor stub
		productos = new Hashtable<String, Integer>();
	}

	public Hashtable<String, Integer> getProductos() {
		return productos;
	}

	public void setProductos(Hashtable<String, Integer> productos) {
		this.productos = productos;
	}
	
	
	
	
	

}
