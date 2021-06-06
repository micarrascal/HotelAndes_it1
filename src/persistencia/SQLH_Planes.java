package persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import negocio.Plan;
import negocio.Salon;

public class SQLH_Planes {

	
	
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
	public SQLH_Planes (PersistenciaHoteleria pp)
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
	
	public long adicionarServPrestamoSalones (PersistenceManager pm, String pId, String tipo, double pdescuento, int pcantidadNoches ) 
	{
        Query q = pm.newQuery( SQL, "INSERT INTO " + pp.PLANES + "(id, nombre , descuento, num_noches) values (?, ?, ?, ?)");
        q.setParameters( pId, tipo, pdescuento, pcantidadNoches);
        return (long) q.executeUnique();            
	}
	
	/**
	 * Elimina un salon de la base de datos
	 * @param pm
	 * @param idSalon
	 * @return
	 */
 	public long eliminarSalonPorId (PersistenceManager pm, String idPlan)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.PLANES + " WHERE id = ?");
        q.setParameters(idPlan);
        return (long) q.executeUnique();            
	}
 	
 /**
  * Retorna una lista con todos los salones del hotel
  * @param pm
  * @return
  */
	public List<Salon> darSalones (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.PLANES);
		q.setResultClass(Salon.class);
		return (List<Salon>) q.executeList();
	}
	

	
	
	
}
