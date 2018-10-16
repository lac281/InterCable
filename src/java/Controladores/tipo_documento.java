/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.OpTipoDocumento;
import Modelos.TipoDocumento;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Innosoft Solutions
 */
public class tipo_documento extends HttpServlet {

    TipoDocumento Doc = new TipoDocumento();
    OpTipoDocumento OpTipo = new OpTipoDocumento();

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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String tipo = request.getParameter("tipoDoc");
        String Obs = request.getParameter("Obser");
        resp = response.getOutputStream();
        if (tipo.equals("") || Obs.equals("")) {
            resp.print("Error: Debe de llenar cada uno de los campos");
        } else {

            Doc.setTipo_identifiacion(tipo);
            Doc.setObservaciones(Obs);
            boolean res_ = OpTipo.ingreso(Doc);
            if (!res_) {
                resp.print("Ocurrio un error con el ingreso de los datos, Intente nuevamente!");

            } else {
                resp.print("Registro Ingresado Correctamente!");

            }

            //resp.print(tipo.toString() + "    " + Obs.toString());
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
