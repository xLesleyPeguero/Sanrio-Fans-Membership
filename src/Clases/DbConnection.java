
package Clases;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lesley Peguero
 */
public class DbConnection {
    
    Connection connect = null;
    
    String user="root";
    String password="root";
    String database="SanrioFansMemberDb";
    String ip="localhost";
    String port="3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+port+"/"+database;
    
    public Connection establishConn(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(cadena, user, password);
            System.out.println("Connection successful ");
            
        } catch (Exception e) {
            System.out.println("Connection unsuccessful. Error: "+ e);
        }
        
        return connect;
    
    }
    //Método para ejecutar instrucciones que no requiera retorno de datos.
    public int executeSQL(String strExecuteSQL){
    
        try {
            PreparedStatement pstm= connect.prepareStatement(strExecuteSQL);
            pstm.execute();
            return 1;
            
            
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    //Método para recuperar información para consultas
    public ResultSet consultarRegistros(String strExecuteSQL){
        try {
            PreparedStatement pstm= connect.prepareStatement(strExecuteSQL);
            ResultSet respuesta= pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    
    }
}

