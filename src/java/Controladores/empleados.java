/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Empleados;
import Modelos.OpEmpleados;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luis Arturo
 */
public class empleados extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Empleados emp = new Empleados();
    OpEmpleados OpEmp = new OpEmpleados();
    private ServletOutputStream resp;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String Oper = request.getParameter("Operacion");
        String Ident = request.getParameter("txt_identificacion");
        String tipoId = request.getParameter("txt_tipoiden");
        String Nit = request.getParameter("txt_nit");
        String Telefono = request.getParameter("txt_telefono");
        String Nombre = request.getParameter("txt_nombre");
        String Apellido = request.getParameter("txt_apellido");
        String Direccion = request.getParameter("txt_direccion");
        String tipoEmpleado = request.getParameter("txt_tipoempleado");
        String fechaNac = request.getParameter("txt_fechanac");
        String Igss = request.getParameter("txt_igss");
        String Irtra = request.getParameter("txt_irtra");
        String TipoSangre = request.getParameter("txt_tiposangre");
        String Salario = request.getParameter("txt_salario");
        String Bonificacion = request.getParameter("txt_bonificacion");
        String Contacto = request.getParameter("txt_contacto");
        String telContacto = request.getParameter("txt_telcontacto");

        switch (Oper) {
            case "Ingreso":
                emp = null;
                emp.setIdentificacion_empleado(Ident);
                emp.setTipo_empleado(Integer.parseInt(tipoId));
                emp.setNit_empleado(Nit);
                emp.setTelefono_empleado(Telefono);
                emp.setNombre_empleado(Nombre);
                emp.setApellido_empleado(Apellido);
                emp.setDireccion_empleado(Direccion);
                emp.setTipo_empleado(Integer.parseInt(tipoEmpleado));
                emp.setFecha_nac(Date.valueOf(fechaNac));
                emp.setIgss(Igss);
                emp.setIrtra(Irtra);
                emp.setTipo_sangre(TipoSangre);
                emp.setSalario(Double.parseDouble(Salario));
                emp.setBonificacion(Double.parseDouble(Bonificacion));
                emp.setContacto_emergencia(Contacto);
                emp.setTelefono_emergencia(telContacto);
                boolean res = OpEmp.Ingreso(emp);
                if (!res) {
                    resp.print("Error: Los Datos no se lograron guardar, Intente de Nuevo!");
                } else {
                    resp.print("Registro guardado Exitosamente");
                }
                break;
            case "Listar":
                break;
            default:
                break;
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
