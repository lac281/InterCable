/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.OpTipoEmpleado;
import Modelos.TipoEmpleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Innosoft Solution
 */
public class tipo_empleado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private ServletOutputStream resp;

    TipoEmpleado emp = new TipoEmpleado();
    OpTipoEmpleado OpEmp = new OpTipoEmpleado();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String Operacion = request.getParameter("Operacion");
        String TipoEm = request.getParameter("tipoEmp");
        String TipoRol = request.getParameter("tipoRol");
        String Obser = request.getParameter("Obser");

        switch (Operacion) {
            case "Ingreso":

                resp = response.getOutputStream();

                if (TipoEm.equals("") || TipoRol.equals("") || Obser.equals("")) {
                    resp.print("Error: Debe de llenar cada uno de los campos ");
                } else {
                    emp.setTipo_empleado(TipoEm);
                    emp.setTipo_rol(TipoRol);
                    emp.setObservaciones(Obser);
                    boolean res_ = OpEmp.Ingreso(emp);
                    if (!res_) {
                        resp.print("Ocurrio un error con el ingreso de los datos, Intente nuevamente!");

                    } else {
                        resp.print("Registro Ingresado Correctamente!");

                    }
                }
                break;

            case "Busqueda":

                break;

            case "Listar":
                ArrayList<TipoEmpleado> Lista = new ArrayList<TipoEmpleado>();

                Lista = OpEmp.listarTipos();
                if (Lista == null) {
                    resp.print("La lista viene Vacia");
                } else {
                    request.setAttribute("ListaEmpleado", Lista);
                }

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
