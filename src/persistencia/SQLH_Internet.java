package persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import negocio.Internet;
import negocio.Salon;

public class SQLH_Internet {


	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	 private final static String SQL = PersistenciaHoteleria.SQL;
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	 private PersistenciaHoteleria pp;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicación
	 */
	public SQLH_Internet(PersistenciaHoteleria pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Permite adicionar una nueva sala a lista de salas
	 * @param pm
	 * @param pId
	 * @param pTipo esta restringifo  unicamente a dos tipos diferentes:
	 * @param pcapacidad
	 * @param preservada entra un entero  cuyo valor puede ser unicamente 0 o uno
	 * @param pfecha
	 * @param pcosto
	 * @return
	 */
	
	public long adicionarInternet (PersistenceManager pm, String pId,  int pcapacidad, int pagoAdicional,  double pcosto ) 
	{
        Query q = pm.newQuery( SQL, "INSERT INTO " + pp.INTERNET + "(id, precio, pagoAdicional, capacidadMegas) values (?, ?, ?, ?)");
        q.setParameters( pId, pcosto, pagoAdicional, pcapacidad);
        return (long) q.executeUnique();            
	}
	
	/**
	 * Elimina un salon de la base de datos
	 * @param pm
	 * @param idSalon
	 * @return
	 */
 	public long eliminarInternetPorId (PersistenceManager pm, String idInternet)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.INTERNET + " WHERE id = ?");
        q.setParameters(idInternet);
        return (long) q.executeUnique();            
	}
 	
 /**
  * Retorna una lista con todos los salones del hotel
  * @param pm
  * @return
  */
	public List<Internet> darServiciosInternet (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.INTERNET);
		q.setResultClass(Internet.class);
		return (List<Internet>) q.executeList();
	}

	
	
	
}
