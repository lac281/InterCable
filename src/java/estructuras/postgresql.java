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
    
    public void Connect() throws SQLException{
        
        
        String ip_server = "162.243.12.226";
        String puerto_server = "5432";
        String db_server = "postgres";
        String usuario = "postgres";
        String password = "Holamund0";


        String str_conn = "jdbc:postgresql://"+ ip_server + ":" + puerto_server + "/" + db_server;

        try { 
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al conectarse en la base de Datos: " + ex);
        }
        Connection conn = null;
        conn = DriverManager.getConnection(str_conn, usuario, password);
                     
        
    }
}
