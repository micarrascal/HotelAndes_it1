package persistencia;

import javax.jdo.Query;

import negocio.Salon;

import java.util.List;

import javax.jdo.PersistenceManager;

public class SQLPrestamo_Salones
{

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
	public SQLPrestamo_Salones (PersistenciaHoteleria pp)
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
	
	public long adicionarServPrestamoSalones (PersistenceManager pm, String pId, String pTipo, int pcapacidad, int preservada, String  pfecha, double pcosto ) 
	{
        Query q = pm.newQuery( SQL, "INSERT INTO " + pp.SALONES + "(id, tipo, capacidad,  reservada, horario_final, costo_Hora) values (?, ?, ?, ?, ?, ?, ?)");
        q.setParameters( pId,  pTipo, pcapacidad,  preservada,  pfecha, pcosto);
        return (long) q.executeUnique();            
	}
	
	/**
	 * Elimina un salon de la base de datos
	 * @param pm
	 * @param idSalon
	 * @return
	 */
 	public long eliminarSalonPorId (PersistenceManager pm, String idSalon)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.SALONES + " WHERE id = ?");
        q.setParameters(idSalon);
        return (long) q.executeUnique();            
	}
 	
 /**
  * Retorna una lista con todos los salones del hotel
  * @param pm
  * @return
  */
	public List<Salon> darSalones (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.SALONES);
		q.setResultClass(Salon.class);
		return (List<Salon>) q.executeList();
	}
	
	/**
	 * Se retorna una lista con todos los salones que no estan  reservados, es decir  que tengan su columna reservada en 0
	 * @param pm
	 * @return
	 */
	public List<Salon> darSalonesNoReservados(PersistenceManager pm){
		
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.SALONES + " WHERE reservada = 0 ");
		q.setResultClass(Salon.class);
		return (List<Salon>) q.executeList();
	}
	
	
	
	
	

	
}
