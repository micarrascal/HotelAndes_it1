package negocio;

import java.time.LocalDateTime;

public class Piscina extends Servicio
{

	//Atributos
	private int capacidad;
	private double profundidad;
	private LocalDateTime horaIncio;
	private LocalDateTime horFinal;
	
	//Constructor
	public Piscina(boolean pPresentaPagoAdicional, double pPrecio, String pIdentificador,String nombre,
			int capacidad, double profundidad, LocalDateTime inicio, LocalDateTime fin) {
		super(pPresentaPagoAdicional, pPrecio, pIdentificador, nombre);
	}
	
	
	//Metodos

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}

	public LocalDateTime getHoraIncio() {
		return horaIncio;
	}

	public void setHoraIncio(LocalDateTime horaIncio) {
		this.horaIncio = horaIncio;
	}

	public LocalDateTime getHorFinal() {
		return horFinal;
	}

	public void setHorFinal(LocalDateTime horFinal) {
		this.horFinal = horFinal;
	}
	
	
	

	
	
}
