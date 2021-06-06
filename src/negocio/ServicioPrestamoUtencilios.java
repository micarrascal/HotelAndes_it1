package negocio;

import java.util.Hashtable;

public class ServicioPrestamoUtencilios extends Servicio
{

	private Hashtable<String, Utencilio> utencilios;
	
	private Hashtable<String, Utencilio> utenciliosDisponibles;
	
	
	public ServicioPrestamoUtencilios(boolean pPresentaPagoAdicional, double pPrecio,String pIdentificador,String nombre) {
		super(pPresentaPagoAdicional, pPrecio, pIdentificador, nombre);
		
		utencilios = new <String, Utencilio> Hashtable();
		// TODO Auto-generated constructor stub
	}


	public Hashtable<String, Utencilio> getUtencilios() {
		return utencilios;
	}


	public void setUtencilios(Hashtable<String, Utencilio> utencilios) {
		this.utencilios = utencilios;
	}
	
	
	@Override
	public void adquirirServicio(String id, String nombre, double valor) {
		// TODO Auto-generated method stu
		if(utenciliosDisponibles.get(id) != null) {
		utenciliosDisponibles.remove(id);
		}
	}
	
	public void devolverItem(String id,  String estadoActual ) {
		
		Utencilio u = utencilios.get(id);
		u.setEstado(estadoActual);
		
		if(estadoActual == Utencilio.ESTADO_MALO) {
			super.adquirirServicio(id, u.getId(), u.getPrecio() );
		}
		utenciliosDisponibles.put(id, u);
	}
	
	
	

}
