package persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;


import negocio.Salon;

public class SQLH_Productos_Instalaciones {
	
	
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
	 public SQLH_Productos_Instalaciones(PersistenciaHoteleria pPp) {
		 this.pp = pPp;
	 }
	 
	 
	 public long adicionarProducto (PersistenceManager pm, String pId, double pcosto ) 
		{
	        Query q = pm.newQuery( SQL, "INSERT INTO " + pp.PRODUCTOS + "(Id, Precio) values (?, ?)");
	        q.setParameters( pId,   pcosto );
	        return (long) q.executeUnique();            
		}
		
		/**
		 * Elimina un salon de la base de datos
		 * @param pm
		 * @param idSalon
		 * @return
		 */
	 	public long eliminarSalonPorId (PersistenceManager pm, String idProdcto)
		{
	        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.PRODUCTOS + " WHERE Id = ?");
	        q.setParameters(idProdcto);
	        return (long) q.executeUnique();            
		}
	 	
	 /**
	  * Retorna una lista con todos los salones del hotel
	  * @param pm
	  * @return
	  */
		public List darProductos (PersistenceManager pm)
		{
			Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.PRODUCTOS);
			return  q.executeResultList();
		}
		
		
	
		

}
