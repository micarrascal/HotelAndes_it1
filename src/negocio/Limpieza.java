package negocio;

public class Limpieza extends Servicio {

	
	



	public final static String TIPO_LAVADO = "LAVADO";
	public final static String TIPO_PLANCHADO = "PLANCHADO";
	public final static String TIPO_EMBOLADO = "EMBOLADO";
	
	//Atributos
    private String tipo;
    private String identificador;
    private int numeroPrendas;

 /**
  * 
  * @param pPresentaPagoAdicional
  * @param pPrecio Hace referencia al  precio del servicio
  * @param pIdentificador
  * @param pNombre
  * @param pNumero
  * @param ptipo
  */
	public Limpieza(boolean pPresentaPagoAdicional, double pPrecio, String pIdentificador, String pNombre, int pNumero,
			String ptipo) {
		super(pPresentaPagoAdicional, pNumero * pPrecio , pIdentificador, pNombre);
		// TODO Auto-generated constructor stub
		this.tipo = ptipo;
		numeroPrendas = pNumero;
	}
    
    
    
	//Metodos
    public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getIdentificador() {
		return identificador;
	}



	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getNumeroPrendas() {
		return numeroPrendas;
	}
	public void setNumeroPrendas(int numeroPrendas) {
		this.numeroPrendas = numeroPrendas;
	}
	
    
	
	
	
	
}
