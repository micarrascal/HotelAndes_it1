package negocio;

import java.util.Hashtable;

public class Restaurante extends Servicio {

	//Atributos
	private int capacidad;
	private String estilo;
	private Hashtable<String, Integer> cartaProductos;
	//Constructor
	
	
	public Restaurante(boolean pPresentaPagoAdicional, double pPrecio, String pIdentificador, int pCapacidad, String pEstilo, String nombre) {
		
		super(pPresentaPagoAdicional, pPrecio, pIdentificador, nombre);
		capacidad = pCapacidad;
	    estilo = pEstilo;
	    cartaProductos = new<String, Integer> Hashtable(); 
		
		// TODO Auto-generated constructor stub
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public Hashtable<String, Integer> getCartaProductos() {
		return cartaProductos;
	}
	public void setCartaProductos(Hashtable<String, Integer> cartaProductos) {
		this.cartaProductos = cartaProductos;
	}
	
}
