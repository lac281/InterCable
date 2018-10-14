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
 * @author Luis Arturo
 */
public class OpTipoDocumento {

    estructuras.Conexion es = new estructuras.Conexion();
    Connection con = es.getConexion();

    public boolean ingreso(TipoDocumento tipo) {
        boolean resp = false;
        PreparedStatement ps = null;
        String sql = "INSERT INTO intercabledb.tipo_id (tipo_identificacion, observaciones) VALUES(?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tipo.getTipo_identifiacion());
            ps.setString(2, tipo.getObservaciones());
            ps.executeQuery();
            resp = true;
        } catch (SQLException e) {
            resp = false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return resp;
    } // FIn Ingreso tipo documento

}
