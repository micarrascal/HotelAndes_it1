package negocio;

import java.util.ArrayList;

public class Hotel {

	
	private String categoria;
	private String nombre;
	private String telefono;
	private String ubicacionPais;
	private String ubicacionCiudad;
	private String direccion;
    private ServiciosHotelActual ser;
    
	public Hotel(String categoria, String nombre, String telefono, String ubicacionPais, String ubicacionCiudad,
			String direccion, ServiciosHotelActual ser) {
		super();
		this.categoria = categoria;
		this.nombre = nombre;
		this.telefono = telefono;
		this.ubicacionPais = ubicacionPais;
		this.ubicacionCiudad = ubicacionCiudad;
		this.direccion = direccion;
		this.ser = ser;
	}


	

	public ServiciosHotelActual getSer() {
		return ser;
	}




	public void setSer(ServiciosHotelActual ser) {
		this.ser = ser;
	}




	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getUbicacionPais() {
		return ubicacionPais;
	}



	public void setUbicacionPais(String ubicacionPais) {
		this.ubicacionPais = ubicacionPais;
	}



	public String getUbicacionCiudad() {
		return ubicacionCiudad;
	}



	public void setUbicacionCiudad(String ubicacionCiudad) {
		this.ubicacionCiudad = ubicacionCiudad;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	
	
	
	
	
	
}
