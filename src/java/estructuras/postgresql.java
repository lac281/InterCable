/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis Arturo
 */
public class postgresql {
    
    private String ip_server = "162.243.12.226";
    private String puerto_server = "5432";
    private String db_server = "postgres";
    private String usuario = "postgres";
    private String password = "Holamund0";
    
    public Connection getConexion(){
            
        Connection conn = null;
        String str_conn = "jdbc:postgresql://"+ ip_server + ":" + puerto_server + "/" + db_server;

        try { 
            Class.forName("org.postgresql.Driver");
             conn = DriverManager.getConnection(str_conn, usuario, password);
        } catch (Exception ex) {
            System.out.println("Error al conectarse en la base de Datos: " + ex);
        }
        //System.out.println("La conexion se realizó sin problemas!");  
      return conn;
    }
    
 }
