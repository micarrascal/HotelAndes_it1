package uniandes.isis2304.parranderos.persistencia;

public class SQLGimnasio {

public long adicionarGimnasio (PersistenceManager pm, String pId ) 
	{
        Query q = pm.newQuery( SQL, "INSERT INTO " + pp.GIMNASIO + "(id,) values (?, )");
        q.setParameters( pId);
        return (long) q.executeUnique();            
	}
	
	/**
	 * Elimina un salon de la base de datos
	 * @param pm
	 * @param idSalon
	 * @return
	 */
 	public long eliminarPiscinaPorId (PersistenceManager pm, String idInternet)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.PISCINA + " WHERE id = ?");
        q.setParameters(idInternet);
        return (long) q.executeUnique();            
	}
 	
 /**
  * Retorna una lista con todos los salones del hotel
  * @param pm
  * @return
  */
	public List<Internet> darPiscina (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.PISCINA);
		q.setResultClass(Internet.class);
		return (List<Internet>) q.executeList();
	}

}

}
