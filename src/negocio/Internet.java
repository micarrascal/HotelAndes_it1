package negocio;

public class Internet extends Servicio{

	
	
	
	
	//Atributos
	private int capacidad;
	
	public Internet(boolean pPresentaPagoAdicional, double pPrecio,int pCapacidad, String pIdentificador,String nombre) {
		super(pPresentaPagoAdicional, pPrecio, pIdentificador, nombre);
		capacidad = pCapacidad;
		// TODO Auto-generated constructor stub
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	
	
	
}
