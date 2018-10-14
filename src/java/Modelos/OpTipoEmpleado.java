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
public class OpTipoEmpleado {

    estructuras.Conexion es = new estructuras.Conexion();
    Connection con = es.getConexion();

    public boolean Ingreso(TipoEmpleado tip) {
        boolean res = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO intercabledb.tipo_em (tipo_identificacion, observaciones) VALUES(?,?,?)");
            ps.setString(1, tip.getTipo_empleado());
            ps.setString(2, tip.getTipo_rol());
            ps.setString(3, tip.getObservaciones());
            boolean res_ = ps.execute();
            if (!res_) {
                res = false;
            } else {
                res = true;
            }
        } catch (SQLException e) {
            res = false;
        }
        return res;
    }
}
