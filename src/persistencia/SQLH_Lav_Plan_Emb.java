package persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import negocio.Limpieza;
import negocio.Salon;

public class SQLH_Lav_Plan_Emb {

	
	
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
	 * 
	 */
	 public SQLH_Lav_Plan_Emb (PersistenciaHoteleria pPp) {
		 this.pp = pPp;
	 }
	 
	 /**
	  * Adiciona un servicio de limpieza a la tabla de servicios de limpieza
	  * @param pm
	  * @param pId
	  * @param tipo
	  * @param cantItem
	  * @param pcosto
	  * @return
	  */
	 public long adicionarSerLimplieza(PersistenceManager pm, String pId, int tipo, int cantItem, double pcosto ) 
		{
	        Query q = pm.newQuery( SQL, "INSERT INTO " + pp.LAVANDERIA + "(id, tipo, cantItem, precio) values (?, ?, ?, ?)");
	        q.setParameters( pId, tipo, cantItem, pcosto );
	        return (long) q.executeUnique();            
		}
	 /**
	  * Busca un servicio de limpieza dado un id
	  * @param pm
	  * @param pId
	  * @return
	  */
	 
	 public List buscarSerLimpliezaPorId(PersistenceManager pm, String pId)
	 {
	        Query q = pm.newQuery( SQL, "SELECT * FROM " + pp.LAVANDERIA + " WHERE id = ?");
	        q.setParameters( pId );
	        return  q.executeList();           
		}
		
		/**
		 * Elimina un salon de la base de datos
		 * @param pm
		 * @param idSalon
		 * @return
		 */
	 	public long eliminarServicioLimpPorId (PersistenceManager pm, String idServicio)
		{
	 		
	        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.LAVANDERIA + " WHERE id = ?");
	        q.setParameters(idServicio);
	        return (long) q.executeUnique();            
		}
	 	
	 /**
	  * Retorna una lista con todos los salones del hotel
	  * @param pm
	  * @return
	  */
		public List<Limpieza> darServiciosLimp (PersistenceManager pm)
		{
			Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.LAVANDERIA);
			q.setResultClass(Limpieza.class);
			return (List<Limpieza>) q.executeList();
		}
	
}
