package negocio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Gimnasio extends Servicio{

	

	
	//Atributos
	private int capacidad;
	private ArrayList<String> maquinas;
	private LocalDateTime horainicio;
	private LocalDateTime horafin;
	
	//Constructor
	
	public Gimnasio(boolean pPresentaPagoAdicional, double pPrecio, String pIdentificador,
			int pCapacidad, LocalDateTime pInicio, LocalDateTime pFinal,String pNombre) {
		super(pPresentaPagoAdicional, pPrecio, pIdentificador, pNombre);
		// TODO Auto-generated constructor stub
		capacidad = pCapacidad;
		horafin = pFinal;
		horainicio = pInicio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public ArrayList<String> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<String> maquinas) {
		this.maquinas = maquinas;
	}

	public LocalDateTime getHorainicio() {
		return horainicio;
	}

	public void setHorainicio(LocalDateTime horainicio) {
		this.horainicio = horainicio;
	}

	public LocalDateTime getHorafin() {
		return horafin;
	}

	public void setHorafin(LocalDateTime horafin) {
		this.horafin = horafin;
	}
	
	
	
}
