/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Innosoft Solutions
 */
public class OpTipoDocumento {

    estructuras.Conexion es = new estructuras.Conexion();
    Connection con = es.getConexion();

    public boolean ingreso(TipoDocumento tipo) {
        boolean resp = false;
        PreparedStatement ps = null;
        String resp_ = "";

        try {
            ps = con.prepareStatement("INSERT INTO intercabledb.tipo_id (tipo_identificacion, observaciones) VALUES(?,?)");
            ps.setString(1, tipo.getTipo_identifiacion());
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
            ps.setString(1, tipo.getTipo_identifiacion());
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

        return tipo;
    }// Fin Clase buscar

}
