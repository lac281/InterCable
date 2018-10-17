/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Innosoft Solutions
 */
public class OpClientes {

    Parametros.Conexion es = new Parametros.Conexion();
    Connection con = es.getConexion();

    public boolean Ingreso(Clientes cl) {
        boolean res = false;
        PreparedStatement ps = null;

        String sql = "INSERT INTO intercabledb.clientes ("
                + "codigo_cliente,identificacion_cliente,nit_cliente,"
                + "nombre_cliente,apellido_cliente,direccion_cliente,"
                + "telefono_cliente,email_cliente,tipo_identificacion,"
                + "tipo_cliente,fecha_nacimiento,fecha_ingreso) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,current_date)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getCodigo_cliente());
            ps.setString(2, cl.getIdentificacion_cliente());
            ps.setString(3, cl.getNit_cliente());
            ps.setString(4, cl.getNombre_cliente());
            ps.setString(5, cl.getApellido_cliente());
            ps.setString(6, cl.getDireccion_cliente());
            ps.setString(7, cl.getTelefono_cliente());
            ps.setString(8, cl.getEmail_cliente());
            ps.setInt(9, cl.getTipo_identificacaion());
            ps.setString(10, cl.getTipo_cliente());
            ps.setDate(11, cl.getFecha_nacimiento());

            int res_ = ps.executeUpdate();
            if (res_ == 0) {
                res = false;
            } else {
                res = true;
            }
        } catch (SQLException e) {
            res = false;
        }
        return res;
    }// FIn Clase Ingreso

    public ArrayList<Clientes> Listar() {

        ArrayList<Clientes> Lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM intercabledb.clientes";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Clientes cli = new Clientes();
                cli.setIdcliente(rs.getLong("idcliente"));
                cli.setCodigo_cliente(rs.getString("codigo_cliente"));
                cli.setIdentificacion_cliente(rs.getString("identificacion_cliente"));
                cli.setNit_cliente(rs.getString("nit_cliente"));
                cli.setNombre_cliente(rs.getString("nombre_cliente"));
                cli.setApellido_cliente(rs.getString("apellido_cliente"));
                cli.setDireccion_cliente(rs.getString("direccion_cliente"));
                cli.setTelefono_cliente(rs.getString("telefono_cliente"));
                cli.setEmail_cliente(rs.getString("email_cliente"));
                cli.setTipo_identificacaion(rs.getInt("tipo_identificacion"));
                cli.setTipo_cliente(rs.getString("tipo_cliente"));
                cli.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                cli.setStatus_cliente(rs.getInt("status_cliente"));
                cli.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                Lista.add(cli);
            }
        } catch (SQLException e) {
            Lista = null;
            System.out.println("Excepcion: " + e.getMessage());
        }
        return Lista;
    }// Fin Clase Listar

    public ArrayList<Clientes> Buscar(Clientes cl) {
        ArrayList<Clientes> Lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM intercabledb.clientes WHERE idcliente = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, cl.getIdcliente());
            rs = ps.executeQuery();
            if (rs.next()) {
                Clientes cli = new Clientes();
                cli.setIdcliente(rs.getLong("idcliente"));
                cli.setCodigo_cliente(rs.getString("codigo_cliente"));
                cli.setIdentificacion_cliente(rs.getString("identificacion_cliente"));
                cli.setNit_cliente(rs.getString("nit_cliente"));
                cli.setNombre_cliente(rs.getString("nombre_cliente"));
                cli.setApellido_cliente(rs.getString("apellido_cliente"));
                cli.setDireccion_cliente(rs.getString("direccion_cliente"));
                cli.setTelefono_cliente(rs.getString("telefono_cliente"));
                cli.setEmail_cliente(rs.getString("email_cliente"));
                cli.setTipo_identificacaion(rs.getInt("tipo_identificacion"));
                cli.setTipo_cliente(rs.getString("tipo_cliente"));
                cli.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                cli.setStatus_cliente(rs.getInt("status_cliente"));
                cli.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                Lista.add(cli);
            }
        } catch (SQLException e) {
            Lista = null;
            System.out.println("Excepcion: " + e.getMessage());
        }
        return Lista;
    }// Fin Clase Buscar

    public boolean Modificar(Clientes cl) {
        boolean res = false;
        PreparedStatement ps = null;

        String sql = "UPDATE intercabledb.clientes SET "
                + "codigo_cliente = ?,identificacion_cliente = ?,nit_cliente = ?,"
                + "nombre_cliente = ?,apellido_cliente = ?,direccion_cliente = ?,"
                + "telefono_cliente = ?,email_cliente = ?,tipo_identificacion = ?,"
                + "tipo_cliente = ?,fecha_nacimiento = ?,fecha_ingreso = ?) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,current_date)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getCodigo_cliente());
            ps.setString(2, cl.getIdentificacion_cliente());
            ps.setString(3, cl.getNit_cliente());
            ps.setString(4, cl.getNombre_cliente());
            ps.setString(5, cl.getApellido_cliente());
            ps.setString(6, cl.getDireccion_cliente());
            ps.setString(7, cl.getTelefono_cliente());
            ps.setString(8, cl.getEmail_cliente());
            ps.setInt(9, cl.getTipo_identificacaion());
            ps.setString(10, cl.getTipo_cliente());
            ps.setDate(11, cl.getFecha_nacimiento());
            int res_ = ps.executeUpdate();
            if (res_ == 0) {
                res = false;
            } else {
                res = true;
            }
        } catch (SQLException e) {
            res = false;
        }
        return res;
    }// FIn Clase Modificar

}
