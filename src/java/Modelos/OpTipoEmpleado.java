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
 * @author Luis Arturo
 */
public class OpTipoEmpleado {

    Parametros.Conexion es = new Parametros.Conexion();
    Connection con = es.getConexion();

    public boolean Ingreso(TipoEmpleado tip) {
        boolean res = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO intercabledb.tipo_em (tipo_empleado, tipo_rol, observaciones) VALUES(?,?,?)");
            ps.setString(1, tip.getTipo_empleado());
            ps.setString(2, tip.getTipo_rol());
            ps.setString(3, tip.getObservaciones());
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

    public ArrayList<TipoEmpleado> listarTipos() {

        ArrayList<TipoEmpleado> Lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM intercabledb.tipo_em";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                TipoEmpleado tipo = new TipoEmpleado();
                tipo.setIdtipo(rs.getInt("idtipo"));
                tipo.setTipo_empleado(rs.getString("tipo_empleado"));
                tipo.setTipo_rol(rs.getString("tipo_rol"));
                tipo.setObservaciones(rs.getString("observaciones"));
                Lista.add(tipo);
            }
        } catch (SQLException e) {
            Lista = null;
            System.out.println("Excepcion: " + e.getMessage());
        }
        return Lista;
    }// Fin Clase Listar
}
