package negocio;

import java.util.ArrayList;

public class ServiciosHotelActual {
	
	
	private ArrayList<Tienda> tiendas;
	private ArrayList<Salon> salones;
	private Spa spa;
	private ArrayList<Bar> bares;
	private ArrayList<Supermercado> supermercados;
	private ArrayList<Restaurante> restaurantes;
	private  ServicioPrestamoUtencilios servUtencilios;
	private Gimnasio gimnasio;
	private ArrayList<Limpieza> servLimpieza;
	private Internet internet;
	private Piscina piscina;
	
	//Constructor 
	public ServiciosHotelActual(ArrayList<Tienda> tiendas, ArrayList<Salon> salones, Spa spa, ArrayList<Bar> bares,
			ArrayList<Supermercado> supermercados, ArrayList<Restaurante> restaurantes,
			ServicioPrestamoUtencilios servUtencilios, Gimnasio gimnasio, ArrayList<Limpieza> servLimpieza,
			Internet internet, Piscina piscina) {
		super();
		this.tiendas = tiendas;
		this.salones = salones;
		this.spa = spa;
		this.bares = bares;
		this.supermercados = supermercados;
		this.restaurantes = restaurantes;
		this.servUtencilios = servUtencilios;
		this.gimnasio = gimnasio;
		this.servLimpieza =  servLimpieza;
		this.internet = internet;
		this.piscina = piscina;
	}
	
	//Metodos
	public ArrayList<Tienda> getTiendas() {
		return tiendas;
	}

	public void setTiendas(ArrayList<Tienda> tiendas) {
		this.tiendas = tiendas;
	}

	public ArrayList<Salon> getSalones() {
		return salones;
	}

	public void setSalones(ArrayList<Salon> salones) {
		this.salones = salones;
	}

	public Spa getSpa() {
		return spa;
	}

	public void setSpa(Spa spa) {
		this.spa = spa;
	}

	public ArrayList<Bar> getBares() {
		return bares;
	}

	public void setBares(ArrayList<Bar> bares) {
		this.bares = bares;
	}

	public ArrayList<Supermercado> getSupermercados() {
		return supermercados;
	}

	public void setSupermercados(ArrayList<Supermercado> supermercados) {
		this.supermercados = supermercados;
	}

	public ArrayList<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	public ServicioPrestamoUtencilios getServUtencilios() {
		return servUtencilios;
	}

	public void setServUtencilios(ServicioPrestamoUtencilios servUtencilios) {
		this.servUtencilios = servUtencilios;
	}

	public Gimnasio getGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}



	public Internet getInternet() {
		return internet;
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
	}

	public Piscina getPiscina() {
		return piscina;
	}

	public void setPiscina(Piscina piscina) {
		this.piscina = piscina;
	}

	public ArrayList<Limpieza> getServLimpieza() {
		return servLimpieza;
	}

	public void setServLimpieza(ArrayList<Limpieza> servLimpieza) {
		this.servLimpieza = servLimpieza;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
