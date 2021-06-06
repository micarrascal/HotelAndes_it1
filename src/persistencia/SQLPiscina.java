package uniandes.isis2304.parranderos.persistencia;

public class SQLPiscina {

	public long adicionarPiscina (PersistenceManager pm, String pId,  int pcapacidad ) 
	{
        Query q = pm.newQuery( SQL, "INSERT INTO " + pp.EMPLEADOS + "(id, capacidadMegas) values (?, ?,)");
        q.setParameters( pId, pcapacidad);
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
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.EMPLEADOS + " WHERE id = ?");
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
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.EMPLEADOS);
		q.setResultClass(Internet.class);
		return (List<Internet>) q.executeList();
	}

}

}
