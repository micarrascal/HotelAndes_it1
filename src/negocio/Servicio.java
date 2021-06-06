package negocio;

import java.util.Hashtable;

public class Servicio {

	
	//Atributos
	private boolean presentaPagoAdicional;
	private double precio;
	private String identificador;
	private Hashtable<String, Cliente> clientes;
	private String nombre;
	
	
	//Construtor
	public Servicio(boolean pPresentaPagoAdicional, double pPrecio, String pIdentificador, String pNombre) {
		presentaPagoAdicional = pPresentaPagoAdicional;
		precio = pPrecio;
		identificador = pIdentificador;
		nombre = pNombre;
		//clientes = new Hashtable<String, Cliente>();
	}
	
	//Metodos - 
	/**
	 * Metodo para adquirir un servicio
	 * @param id
	 * @param servicio
	 */
	public void  adquirirServicio(String id, String nombre, double valor) 
	{
		Cliente cliente = clientes.get(id);		
		cliente.getServicios().put(nombre, valor);
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//public Hashtable<String, Cliente > getClientes(){
	//return clientes;
	//}
	
	//public void setClientes(Hashtable<String, Cliente> pClientes) {
		
	//	clientes = pClientes;
	//}


	public boolean getPresentaPagoAdicional() {
		return presentaPagoAdicional;
	}

	public void setPresentaPagoAdicional(boolean presentaPagoAdicional) {
		this.presentaPagoAdicional = presentaPagoAdicional;
	}

	public double getPrecio() {
		return precio;
	}
	

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	

}