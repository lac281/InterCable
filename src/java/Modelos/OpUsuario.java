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
import java.util.ArrayList;

/**
 *
 * @author Innosoft Solutions
 */
public class OpUsuario {

    Parametros.Conexion es = new Parametros.Conexion();
    Connection con = es.getConexion();

    public ArrayList<Usuarios> valida(Usuarios us) {
        Usuarios user = new Usuarios();
        ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
        String sql = "SELECT * FROM intercabledb.valida_usuario(?,?)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getUsuario());
            ps.setString(2, us.getContrasena());
            rs = ps.executeQuery();
            while (rs.next()) {
                user.setIdusuario(rs.getLong("id"));
                user.setUsuario(rs.getString("us"));
                user.setTipo_usuario(rs.getInt("tipo"));
                user.setIdempleado(rs.getLong("codigo"));
                user.setStatus_usuario(rs.getInt("sta"));
                user.setNombre(rs.getString("nombre"));
                lista.add(user);
            }
        } catch (SQLException e) {
            user = null;
            System.out.println("Excepcion: " + e.getMessage());
        }
        return lista;
    }

    public boolean ingreso(Usuarios user) {
        boolean resp = false;
        PreparedStatement ps = null;
        String sql = "INSERT INTO intercabledb.usuario (usuario,"
                + "contrasena,tipo_usuario,idempleado,"
                + "status_usuario) VALUES (?,md5(md5(?)),?,?,?)";

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
