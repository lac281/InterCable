/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parametros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Innosoft Solutions
 */
public final class Conexion {

    private static String ip_server = "162.243.12.226";
    private static String puerto_server = "5432";
    private static String db_server = "postgres";
    private static String usuario = "postgres";
    private static String password = "Holamund0";
    private static String str_conn = "jdbc:postgresql://" + ip_server + ":" + puerto_server + "/" + db_server;

    protected Connection conn;
    protected PreparedStatement ps;
    protected ResultSet rs;

    public Connection getConexion() {

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(str_conn, usuario, password);
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL no puede ejecutarse " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al conectarse en la base de Datos: " + ex.getMessage());
        }
        //System.out.println("La Conexion se realizó sin problemas!");
        return conn;
    }

    public void closeConexion() {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Excepcion: " + e.getMessage());
            }

        }
        if (ps != null) {
            try {
                ps.close();
            } catch (Exception e) {
                System.out.println("Excepcion: " + e.getMessage());
            }

        }
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                System.out.println("Excepcion: " + e.getMessage());
            }

        }
    }

}
