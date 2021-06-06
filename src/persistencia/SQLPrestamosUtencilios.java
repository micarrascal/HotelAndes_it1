package persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import negocio.Salon;

public class SQLPrestamosUtencilios {

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
	 public SQLPrestamosUtencilios(PersistenciaHoteleria pPp) {
		 this.pp = pPp;
	 }
	 
	 /**
	  * Permite adcionar una entrada de prestamo de utensilios a la base de datos
	  * @param pm
	  * @param pId
	  * @param pidUtensilio
	  * @param pNombre
	  * @param pBuenEstado
	  * @param precio
	  * @return
	  */
	 public long adicionarPrestamoUtensilios (PersistenceManager pm, String pId, String pidUtensilio,  String pNombre,
			 int pBuenEstado, double precio ) 
		{
	        Query q = pm.newQuery( SQL, "INSERT INTO " + pp.UTENCILIOS + "(id, IdUtensilio, nombre, devueltoBuenEstado, cargo) values (?, ?, ?, ?, ?)");
	        q.setParameters(  pId,  pidUtensilio,   pNombre, pBuenEstado,  precio );
	        return (long) q.executeUnique();            
		}
		
	 
		/**
		 * Elima un registro de prestamo de utensilios dado un id
		 * @param pm
		 * @param idProdcto
		 * @return
		 */
	 	public long eliminaPrestamoUtensilisioPorId (PersistenceManager pm, String idProdcto)
		{
	        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.UTENCILIOS  + " WHERE id = ?");
	        q.setParameters(idProdcto);
	        return (long) q.executeUnique();            
		}
	 	
	    /**
	     * Retorna todos los registros de utensilios de la base datos
	     * @param pm
	     * @return
	     */
		public List darPrestamoUtensilios (PersistenceManager pm)
		{
			Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.UTENCILIOS );	
			return q.executeResultList();
		}
		
		
		
	
	
	
	
}
