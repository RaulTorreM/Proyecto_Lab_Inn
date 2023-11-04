package ConexiónDB;

import java.sql.*;

public class PruebaConection {

    public static void main(String[] args) {
        
        //Crear un objeto de la clase de conexión
        CheckConnection conect = new CheckConnection();  
 
        //Obtener la conexión
        Connection con = conect.ObtenerConexion(); 
 
        if(con == null){ 
           //Error al establecer la conexión
        }
    }
}

