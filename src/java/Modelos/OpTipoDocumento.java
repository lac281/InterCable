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
public class OpTipoDocumento {

    Parametros.Conexion es = new Parametros.Conexion();
    Connection con = es.getConexion();

    public boolean ingreso(TipoDocumento tipo) {
        boolean resp = false;
        PreparedStatement ps = null;
        String resp_ = "";

        try {
            ps = con.prepareStatement("INSERT INTO intercabledb.tipo_id (tipo_identificacion, observaciones) VALUES(?,?)");
            ps.setString(1, tipo.getTipo_identificacion());
            ps.setString(2, tipo.getObservaciones());
            int res_ = ps.executeUpdate();
            if (res_ == 0) {
                resp = false;
            } else {
                resp = true;
            }

        } catch (SQLException e) {
            resp = false;
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException ex) {
//                System.out.println(ex);
//                resp_ = ex.getMessage() + resp;
//            }
        }

        return resp;
    } // FIn Ingreso tipo documento

    public boolean modificar(TipoDocumento tipo) {
        boolean resp = false;
        PreparedStatement ps = null;
        String resp_ = "";

        try {
            ps = con.prepareStatement("UPDATE intercabledb.tipo_id SET tipo_identificacion = ?, observaciones = ? WHERE idtipo = ?)");
            ps.setString(1, tipo.getTipo_identificacion());
            ps.setString(2, tipo.getObservaciones());
            ps.setLong(3, tipo.getIdtipo());
            int res_ = ps.executeUpdate();
            if (res_ == 0) {
                resp = false;
            } else {
                resp = true;
            }

        } catch (SQLException e) {
            resp = false;

        }
        return resp;

    } // Fin Clase modificar

    public TipoDocumento buscar(TipoDocumento tip) {
        TipoDocumento tipo = new TipoDocumento();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM intercabledb.tipo_id WHERE idtipo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tip.getIdtipo());
            rs = ps.executeQuery();
            if (rs.next()) {
                tipo.setObservaciones(rs.getString("observaciones"));
                tipo.setTipo_identificacion(rs.getString("tipo_identificacion"));
                return tipo;
            }
        } catch (SQLException e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
        return null;
    }// Fin Clase buscar

    public ArrayList listarTipos() {

        ArrayList<TipoDocumento> Lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM intercabledb.tipo_id";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                TipoDocumento tipo = new TipoDocumento();
                tipo.setIdtipo(rs.getInt("idtipo"));
                tipo.setTipo_identificacion(rs.getString("tipo_identificacion"));
                tipo.setObservaciones(rs.getString("observaciones"));
                Lista.add(tipo);
            }

        } catch (SQLException e) {
            Lista = null;
            System.out.println("Excepcion: " + e.getMessage());
        }
        return Lista;
    }// Fin Clase listar

}
