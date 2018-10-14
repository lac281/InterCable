/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Innosoft Solution
 */
public class TipoEmpleado {

    private int idtipo;
    private String tipo_empleado;
    private String tipo_rol;
    private String observaciones;

    public TipoEmpleado() {
    }

    public TipoEmpleado(String tipo_empleado, String tipo_rol, String observaciones) {
        this.tipo_empleado = tipo_empleado;
        this.tipo_rol = tipo_rol;
        this.observaciones = observaciones;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
