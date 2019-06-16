package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UConexion {
	
private static Connection conn;
    
    private static String url;
    
    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private UConexion(){}
    
    public static synchronized Connection getInstance(){
            if(url.isEmpty()){
                throw new IllegalArgumentException("You have to initialize the url first.");
            }
            try {
                conn = DriverManager.getConnection(url);
                
            } catch (SQLException ex) {
                Logger.getLogger(UConexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        return conn;
    }
    
    public static void setUrl(String u){
        url = u;
    }
}
