/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Repository.ProductRepo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author looby
 */
public class SortPrice100to200 extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (ProductRepo.read().isEmpty()) {
            ProductRepo.initialData();
        }
        try {
            request.setAttribute("listItem", ProductRepo.sortByPrice(100, 199));
            System.out.println(ProductRepo.read().size());
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
