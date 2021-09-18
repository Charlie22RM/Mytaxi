
package mytaxi.ClienteDAL;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Charlie22
 */

public class Conexion {
    
    String conexionDB="jdbc:oracle:thin:@localhost:1521:xe";
    Connection conn = null;

    public Conexion() {
       
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(conexionDB, "USER_BD", "PASSWORD_BD");
            System.out.println("Conexión exitosa");
           
        }catch(Exception e){
            
            System.out.println("Error de conexión" + e);
          
        }
        
    }
    
    public int ejecutarSentencia(String SentenciaSQL){
    
        try{
            
            PreparedStatement pstm = conn.prepareStatement(SentenciaSQL);
            pstm.execute();
            return 1;
        
        }catch(SQLException e){
            
            System.out.println(e);
            return 0;
        
        }
    
    }
    
    public ResultSet consultarRegistros(String SentenciaSQL){
    
        try{
            
            PreparedStatement pstm = conn.prepareStatement(SentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        
        }catch(Exception e){
            
            System.out.println(e);
            return null;
        
        }
    
    }
    
}

