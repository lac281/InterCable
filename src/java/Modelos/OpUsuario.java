/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Innosoft Solutions
 */
public class OpUsuario {

    Parametros.Conexion es = new Parametros.Conexion();
    Connection con = es.getConexion();

    public Usuarios valida(String user, String pass) {
        Usuarios resp = null;
        String sql = "SELECT * FROM intercabledb.tipo_id  ";

        return resp;
    }

    public boolean ingreso(Usuarios user) {
        boolean resp = false;
        PreparedStatement ps = null;
        String sql = "INSERT INTO intercabledb.usuario (usuario,"
                + "contrasena,tipo_usuario,idempleado,"
                + "status_usuario) VALUES (?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getContrasena());
            ps.setInt(3, user.getTipo_usuario());
            ps.setLong(4, user.getIdempleado());
            ps.setInt(5, user.getStatus_usuario());
            ps.execute();
            resp = true;
        } catch (SQLException ex) {
            resp = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return resp;
    }

    public boolean modificar(Usuarios user) {
        boolean resp = false;
        PreparedStatement ps = null;
        String sql = "UPDATE intercabledb.usuario SET usuario = ?,"
                + "contrasena = ?,"
                + "tipo_usuario = ?,"
                + "idempleado= ?,"
                + "status_usuario = ? WHERE idusuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getContrasena());
            ps.setInt(3, user.getTipo_usuario());
            ps.setLong(4, user.getIdempleado());
            ps.setInt(5, user.getStatus_usuario());
            ps.setLong(6, user.getIdempleado());
            ps.execute();
            resp = true;
        } catch (SQLException ex) {
            resp = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return resp;
    }

    public Usuarios buscar(Usuarios user) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM tipo_id WHERE idusuario = ?";
        Usuarios us = new Usuarios();
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, user.getIdempleado());
            rs = ps.executeQuery();
            if (rs.next()) {
                us.setIdusuario(Integer.parseInt(rs.getString("idusuario")));
                us.setUsuario(rs.getString("usuario"));
                us.setTipo_usuario(Integer.parseInt(rs.getString("tipo_usuario")));
                us.setIdempleado(Integer.parseInt(rs.getString("idempleado")));
                us.setStatus_usuario(Integer.parseInt(rs.getString("status_usuario")));
                return us;
            }
        } catch (SQLException ex) {

        }
        return us;
    }

}
