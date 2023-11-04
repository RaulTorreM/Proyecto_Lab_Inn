package ConexiónDB;
import java.sql.*; 

public class CheckConnection {
    
    private String url = "jdbc:ucanaccess://F:\\tts\\JAVA\\ProyectoLabInn\\DB_v6.accdb"; 
    private String usr = ""; 
    private String pswd = ""; 
    private Connection con=null; 
 
    public CheckConnection(){  /*Constructor, carga puente JDBC-ODBC*/ 
        loadDriver(); 
    } 
 
    private void loadDriver(){ // Carga el driver de la conexión a la base de datos 
       try{
            Class.forName( "net.ucanaccess.jdbc.UcanaccessDriver" ); 
        } 
        catch(ClassNotFoundException e) { 
            System.out.println("Error al crear el puente JDBC-Access");  
        } 
    } 
   
    public Connection ObtenerConexion(){ // Obtiene una conexión con el nombre del driver especificado 
        System.out.println("Estableciendo conexión con " + url); 
        try{ //Obtiene la conexión 
            con = DriverManager.getConnection( url,usr,pswd); 
        } 
        catch(SQLException sqle) {
            System.out.println("No se pudo establecer la conexión"); 
            return null; 
        } 
        System.out.println("Conexión establecida -> " + url); 
        return con; //Regresa la conexión
    } 
   
    public boolean closeConecction() {// Cerrar la conexión.
       try{ 
           con.close(); 
        } 
        catch(SQLException sqle){ 
           System.out.println("No se cerro la conexión"); 
            return false; 
        } 
        System.out.println("Conexión cerrada. "); 
        return true; 
    } 
}

