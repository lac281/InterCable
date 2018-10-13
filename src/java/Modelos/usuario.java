/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author it
 */
public class usuario {
    private int idusuario;
    private String usuario;
    private String contrasena;
    private int tipo_usuario;
    private int idempleado;
    private int status_usuario;

    public usuario(int idusuario, String usuario, String contrasena, int tipo_usuario, int idempleado, int status_usuario) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipo_usuario = tipo_usuario;
        this.idempleado = idempleado;
        this.status_usuario = status_usuario;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public int getStatus_usuario() {
        return status_usuario;
    }

    public void setStatus_usuario(int status_usuario) {
        this.status_usuario = status_usuario;
    }
    
    
}
