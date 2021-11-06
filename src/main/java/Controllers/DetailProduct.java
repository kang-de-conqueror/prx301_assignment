/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import Repo.ProductRepo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author looby
 */
@WebServlet(name = "DetailProduct", urlPatterns = {"/DetailProduct"})
public class DetailProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

         String productId = request.getParameter("productId");

        try {
            // Đưa dữ liệu về trang details.jsp
            request.setAttribute("item", ProductRepo.detail(productId));
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/details.jsp");
            rd.forward(request, response);

        } catch (Exception ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}



