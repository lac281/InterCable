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
public class OpEmpleados {

    Parametros.Conexion es = new Parametros.Conexion();
    Connection con = es.getConexion();

    public boolean Ingreso(Empleados emp) {
        boolean res = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO intercabledb.empleados ("
                    + "codigo_empleado,identifacacion,nit_empleado,nombre_empleado,apellido_empleado,"
                    + "direccion_empleado,telefono_empleado,tipo_identificacion,tipo_empleado,fecha_nac,"
                    + "fecha_ingreso,igss,irtra,tipo_sangre,contacto_emergencia,telefonos_emergencia,"
                    + "salario,bonificaion,descuento_igss) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, emp.getCodigo_empleado());
            ps.setString(2, emp.getIdentificacion_empleado());
            ps.setString(3, emp.getNit_empleado());
            ps.setString(4, emp.getNombre_empleado());
            ps.setString(5, emp.getApellido_empleado());
            ps.setString(6, emp.getDireccion_empleado());
            ps.setString(7, emp.getTelefono_empleado());
            ps.setInt(8, emp.getTipo_identificacion());
            ps.setInt(9, emp.getTipo_empleado());
            ps.setDate(10, emp.getFecha_nac());
            ps.setDate(11, emp.getFecha_ingreso());
            ps.setString(12, emp.getIgss());
            ps.setString(13, emp.getIrtra());
            ps.setString(14, emp.getTipo_sangre());
            ps.setString(15, emp.getContacto_emergencia());
            ps.setString(16, emp.getTelefono_emergencia());
            ps.setDouble(17, emp.getSalario());
            ps.setDouble(18, emp.getBonificacion());
            ps.setDouble(19, emp.getDescuento_igss());
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

    public ArrayList<Empleados> listarTipos() {

        ArrayList<Empleados> Lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM intercabledb.empleados";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleados emp = new Empleados();
                emp.setIdempleado(rs.getLong("idempleado"));
                emp.setCodigo_empleado(rs.getString("codigo_empleado"));
                emp.setIdentificacion_empleado(rs.getString("identificacion_empleado"));
                emp.setNit_empleado(rs.getString("nit_empleado"));
                emp.setNombre_empleado(rs.getString("nombre_empleado"));
                emp.setApellido_empleado(rs.getString("apellido_empleado"));
                emp.setDireccion_empleado(rs.getString("direccion_empleado"));
                emp.setTelefono_empleado(rs.getString("telefono_empleado"));
                emp.setTipo_identificacion(rs.getInt("tipo_identificacion"));
                emp.setTipo_empleado(rs.getInt("tipo_empleado"));
                emp.setFecha_nac(rs.getDate("fecha_nac"));
                emp.setStatus_empleado(rs.getInt("status_empleado"));
                emp.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                emp.setIgss(rs.getString("igss"));
                emp.setIrtra(rs.getString("irtra"));
                emp.setTipo_sangre(rs.getString("tipo_sangre"));
                emp.setContacto_emergencia(rs.getString("contacto_emergencia"));
                emp.setTelefono_emergencia(rs.getString("telefonos_emergencia"));
                emp.setSalario(rs.getDouble("salario"));
                emp.setBonificacion(rs.getDouble("bonificacion"));
                emp.setDescuento_igss(rs.getDouble("descuento_igss"));
                emp.setFecha_despido(rs.getDate("fecha_despido"));
                emp.setMotivo_despido(rs.getString("motivo_despido"));
                Lista.add(emp);
            }
        } catch (SQLException e) {
            Lista = null;
            System.out.println("Excepcion: " + e.getMessage());
        }
        return Lista;
    }// Fin Clase Listar

}
