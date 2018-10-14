/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;

/**
 *
 * @author Luis Arturo
 */
public class OpTipoEmpleado {

    estructuras.Conexion es = new estructuras.Conexion();
    Connection con = es.getConexion();

    public boolean Ingreso(TipoEmpleado tip) {
        boolean res = false;

        return res;
    }
}
