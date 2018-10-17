/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Luis Arturo
 */
public class TipoDocumento {

    private int idtipo;
    private String tipo_identificacion;
    private String observaciones;

    public TipoDocumento() {

    }

    public TipoDocumento(String tipo_identifiacion, String observaciones) {
        this.tipo_identificacion = tipo_identifiacion;
        this.observaciones = observaciones;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getTipo_identifiacion() {
        return tipo_identificacion;
    }

    public void setTipo_identifiacion(String tipo_identifiacion) {
        this.tipo_identificacion = tipo_identifiacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
