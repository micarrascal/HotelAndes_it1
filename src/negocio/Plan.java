package negocio;

import java.util.ArrayList;

public class Plan {

	
	//Constantes
	public final static String TIPO_SUITE = "TIPO_SUITE";
	public final static String TIPO_SUITE_PRESIDENCIAL = "TIPO_SUITE_PRESIDENCIAL";
	public final static String TIPO_FAMILIAR = "TIPO_FAMILIAR";
	public final static String TIPO_DOBLE = "TIPO_DOBLE";
	public final static String TIPO_SENCILLA = "TIPO_SENCILLA";
	
	//Atributos
	private String tipo;
	
	private double descuento;
	private int numeroNoches;
	private String id;
	
	
	public Plan(String tipo, double descuento, int numeroNoches, String id) {
		super();
		this.tipo = tipo;
		this.descuento = descuento;
		this.numeroNoches = numeroNoches;
		this.id = id;
	}
	
	//Metodos
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public int getNumeroNoches() {
		return numeroNoches;
	}
	public void setNumeroNoches(int numeroNoches) {
		this.numeroNoches = numeroNoches;
	}
	

	
}
