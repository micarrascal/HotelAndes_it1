package persistencia;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;
import org.apache.log4j.Logger;

public class PersistenciaHoteleria {

	
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Logger para escribir la traza de la ejecución
	 */
	private static Logger log = Logger.getLogger(PersistenciaHoteleria.class.getName());
	/**
	 * Nombre de la tabla que guarda los servicios de internet
	 */
	public final static String INTERNET = "H_INTERNET";
	/**
	 * Nombre de la tabla que guarda los servicios de Lavanderia
	 */
	public final static String LAVANDERIA = "H_LAV_PLAN_EMB";
	/**
	 * Nombre de la tabla que guarda los productos
	 */
	public final static String PRODUCTOS = "H_PRODUCTOS";
	/**
	 * Nombre de la tabla que guarda los servicios de prestamo de utensilios
	 */
	public final static String UTENCILIOS = "H_PRESTAMOS_UTENSILIOS";
	/**
	 * Nombre de la tabla que guarda los servicios de prestamo de salones
	 */
	public final static String SALONES = "H_PRESTAMOS_SALONES";
	/**
	 * Nombre de la tabla que guarda los servicios de prestamo de salones
	 */
	public final static String PLANES = "H_PLANES";
	/**
	 * Nombre de la tabla que guarda los servicios de prestamo de habitaciones
	 */
	public final static String HABITACIONES = "H_HABITACIONES";
	/**
	 * Nombre de la tabla que guarda los servicios de prestamo de habitaciones
	 */
	public final static String EMPLEADOS = "H_EMPLEADOS";
	
	
	
	/**
	 * Cadena para indicar el tipo de sentencias que se va a utilizar en una consulta
	 */
	public final static String SQL = "javax.jdo.query.SQL";

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * Atributo privado que es el único objeto de la clase - Patrón SINGLETON
	 */
	private static PersistenciaHoteleria instance;
	
	/**
	 * Fábrica de Manejadores de persistencia, para el manejo correcto de las transacciones
	 */
	private PersistenceManagerFactory pmf;
	
	/**
	 * Arreglo de cadenas con los nombres de las tablas de la base de datos, en su orden:
	 * Secuenciador, tipoBebida, bebida, bar, bebedor, gustan, sirven y visitan
	 */
	private List <String> tablas;
	
	
	//Fala el java util
	
	private SQLH_Internet sqlInternet;
	private SQLH_Lav_Plan_Emb sqlLav_Plan_Emb;
	private SQLH_Productos_Instalaciones sqlProductos;
	private SQLPrestamo_Salones sqlPrestamoSalones;
	private SQLPrestamosUtencilios sqlPrestamoUtensilios;
	
	public PersistenciaHoteleria() {
		
		pmf = JDOHelper.getPersistenceManagerFactory("");		
		crearClasesSQL ();
	}
	
	private void crearClasesSQL() {
		sqlInternet = new SQLH_Internet(this);
		sqlLav_Plan_Emb = new SQLH_Lav_Plan_Emb(this);
		sqlPrestamoSalones = new SQLPrestamo_Salones(this);
		sqlPrestamoUtensilios = new SQLPrestamosUtencilios(this);
		sqlProductos = new SQLH_Productos_Instalaciones(this);
		
	
}
	
}
