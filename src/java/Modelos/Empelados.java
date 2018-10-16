/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Date;

/**
 *
 * @author Luis Arturo
 */
public class Empelados {

    private long idempleado;
    private String codigo_empleado;
    private String identificacion_empleado;
    private String nit_empleado;
    private String nombre_empleado;
    private String apellido_empleado;
    private String telefono_empleado;
    private int tipo_identificacion;
    private int tipo_empleado;
    private Date fecha_nac;
    private int status_empleado;
    private Date fecha_ingreso;
    private String igss;
    private String irtra;
    private String tipo_sangre;
    private String contacto_emergencia;
    private String telefono_emergencia;
    private Double salario;
    private Double bonificacion;
    private Double descuento_igss;
    private Date fecha_despido;
    private String motivo_despido;

    public Empelados() {
    }

    public long getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(long idempleado) {
        this.idempleado = idempleado;
    }

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getIdentificacion_empleado() {
        return identificacion_empleado;
    }

    public void setIdentificacion_empleado(String identificacion_empleado) {
        this.identificacion_empleado = identificacion_empleado;
    }

    public String getNit_empleado() {
        return nit_empleado;
    }

    public void setNit_empleado(String nit_empleado) {
        this.nit_empleado = nit_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellido_empleado() {
        return apellido_empleado;
    }

    public void setApellido_empleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
    }

    public String getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setTelefono_empleado(String telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }

    public int getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(int tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public int getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(int tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public int getStatus_empleado() {
        return status_empleado;
    }

    public void setStatus_empleado(int status_empleado) {
        this.status_empleado = status_empleado;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getIgss() {
        return igss;
    }

    public void setIgss(String igss) {
        this.igss = igss;
    }

    public String getIrtra() {
        return irtra;
    }

    public void setIrtra(String irtra) {
        this.irtra = irtra;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getContacto_emergencia() {
        return contacto_emergencia;
    }

    public void setContacto_emergencia(String contacto_emergencia) {
        this.contacto_emergencia = contacto_emergencia;
    }

    public String getTelefono_emergencia() {
        return telefono_emergencia;
    }

    public void setTelefono_emergencia(String telefono_emergencia) {
        this.telefono_emergencia = telefono_emergencia;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public Double getDescuento_igss() {
        return descuento_igss;
    }

    public void setDescuento_igss(Double descuento_igss) {
        this.descuento_igss = descuento_igss;
    }

    public Date getFecha_despido() {
        return fecha_despido;
    }

    public void setFecha_despido(Date fecha_despido) {
        this.fecha_despido = fecha_despido;
    }

    public String getMotivo_despido() {
        return motivo_despido;
    }

    public void setMotivo_despido(String motivo_despido) {
        this.motivo_despido = motivo_despido;
    }

}
