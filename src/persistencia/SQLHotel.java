package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Bar;
import uniandes.isis2304.parranderos.negocio.Hotel;



	
	/**
	 * Clase que encapsula los métodos que hacen acceso a la base de datos para el concepto BAR de Parranderos
	 * Nótese que es una clase que es sólo conocida en el paquete de persistencia
	 * 
	 * @author Germán Bravo
	 */
	class SQLHotel
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
		public SQLHotel (PersistenciaParranderos pp)
		{
			this.pp = pp;
		}
		
		/**
		 * Crea y ejecuta la sentencia SQL para adicionar un BAR a la base de datos de Parranderos
		 * @param pm - El manejador de persistencia
		 * @param idHotel - El identificador del bar
		 * @param nombre - El nombre del bar
		 * @param ubicacion - La ciudad del bar
		 * @param cateogria - 
		 * @param telefono - El número de sedes del bar
		 * @return El número de tuplas insertadas
		 */
		public long adicionarHotel (PersistenceManager pm, long idHotel, String nombre, String ubicacion, String cateogria, int telefono) 
		{
	        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaHotel () + "(id, nombre,ubicacion, categoria, telefono) values (?, ?, ?, ?, ?)");
	        q.setParameters(idHotel, nombre, ubicacion, cateogria, telefono);
	        return (long) q.executeUnique();
		}

		/**
		 * Crea y ejecuta la sentencia SQL para eliminar BARES de la base de datos de Parranderos, por su nombre
		 * @param pm - El manejador de persistencia
		 * @param nombreHotel - El nombre del bar
		 * @return EL número de tuplas eliminadas
		 */
		public long eliminarHotelesPorNombre (PersistenceManager pm, String nombreHotel)
		{
	        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaHotel () + " WHERE nombre = ?");
	        q.setParameters(nombreHotel);
	        return (long) q.executeUnique();
		}

		/**
		 * Crea y ejecuta la sentencia SQL para eliminar UN BAR de la base de datos de Parranderos, por su identificador
		 * @param pm - El manejador de persistencia
		 * @param idHotel - El identificador del hotel
		 * @return EL número de tuplas eliminadas
		 */
		public long eliminarHotelPorId (PersistenceManager pm, long idHotel)
		{
	        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaHotel () + " WHERE id = ?");
	        q.setParameters(idHotel);
	        return (long) q.executeUnique();
		}

		/**
		 * Crea y ejecuta la sentencia SQL para encontrar la información de UN BAR de la 
		 * base de datos de Parranderos, por su identificador
		 * @param pm - El manejador de persistencia
		 * @param idHotel - El identificador del bar
		 * @return El objeto BAR que tiene el identificador dado
		 */
		public Hotel darHotelPorId (PersistenceManager pm, long idHotel) 
		{
			Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaHotel () + " WHERE id = ?");
			q.setResultClass(Bar.class);
			q.setParameters(idHotel);
			return (Hotel) q.executeUnique();
		}

		/**
		 * Crea y ejecuta la sentencia SQL para encontrar la información de LOS BARES de la 
		 * base de datos de Parranderos, por su nombre
		 * @param pm - El manejador de persistencia
		 * @param nombreBar - El nombre de bar buscado
		 * @return Una lista de objetos BAR que tienen el nombre dado
		 */
		public List<Hotel> darHotelesPorNombre (PersistenceManager pm, String nombreBar) 
		{
			Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaHotel () + " WHERE nombre = ?");
			q.setResultClass(Hotel.class);
			q.setParameters(nombreBar);
			return (List<Hotel>) q.executeList();
		}

		/**
		 * Crea y ejecuta la sentencia SQL para encontrar la información de LOS BARES de la 
		 * base de datos de Parranderos
		 * @param pm - El manejador de persistencia
		 * @return Una lista de objetos BAR
		 */
		public List<Hotel> darHoteles (PersistenceManager pm)
		{
			Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaHotel ());
			q.setResultClass(Bar.class);
			return (List<Hotel>) q.executeList();
		}

		/**
		 * Crea y ejecuta la sentencia SQL para aumentar en uno el número de sedes de los bares de la 
		 * base de datos de Parranderos
		 * @param pm - El manejador de persistencia
		 * @param ciudad - La ciudad a la cual se le quiere realizar el proceso
		 * @return El número de tuplas modificadas
		 */
		public long aumentarSedesBaresCiudad (PersistenceManager pm, String ciudad)
		{
	        Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaHotel () + " SET cantsedes = cantsedes + 1 WHERE ciudad = ?");
	        q.setParameters(ciudad);
	        return (long) q.executeUnique();
		}
		
	}

	

