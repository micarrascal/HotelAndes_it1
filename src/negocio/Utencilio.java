package negocio;

public class Utencilio {

	public  final static String ESTADO_BUENO = "ESTADO_BUENO";
	public final static String ESTADO_MALO = "ESTADO_MALO";
	
	private boolean prestado;
	private  String estado;
	private double precio;
	private String id;

	
	public Utencilio(boolean pPrestado, String stado,double pPrecio, String pId) {
		prestado = pPrestado;
		estado = stado;
		precio = pPrecio;
		id = pId;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	
	
}
