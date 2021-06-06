package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Gustan;

/**
 * Clase que encapsula los métodos que hacen acceso a la base de datos para el concepto GUSTAN de Parranderos
 * Nótese que es una clase que es sólo conocida en el paquete de persistencia
 * 
 *
 */
class SQLServiciosHotel
{
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaParranderos.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaParranderos pp;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicación
	 */
	public SQLServiciosHotel (PersistenciaParranderos pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un GUSTAN a la base de datos de Parranderos
	 * @param pm - El manejador de persistencia
	 * @param idBebedor - El identificador del bebedor
	 * @param idBebida - El identificador de la bebida
	 * @return EL número de tuplas insertadas
	 */
	public long adicionarServicios(PersistenceManager pm, long idHotel, long idServicio, String nombreServicio) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaGustan () + "(id_hotel, id_servicio, nombre) values (?, ?,?)");
        q.setParameters(idHotel, idServicio,nombreServicio);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN GUSTAN de la base de datos de Parranderos, por sus identificador
	 * @param pm - El manejador de persistencia
	 * @param idBebedor - El identificador del bebedor
	 * @param idBebida - El identificador de la bebida
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarGustan (PersistenceManager pm, long idBebedor, long idBebida)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaGustan () + " WHERE idbebedor = ? AND idbebida = ?");
        q.setParameters(idBebedor, idBebida);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de los GUSTAN de la 
	 * base de datos de Parranderos
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos GUSTAN
	 */
	public List<Gustan> darGustan (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaGustan ());
		q.setResultClass(Gustan.class);
		List<Gustan> resp = (List<Gustan>) q.execute();
		return resp;
	}

}

