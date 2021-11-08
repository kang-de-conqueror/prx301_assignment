/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Repository.ProductRepository;
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
public class SortPriceOver200 extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (ProductRepository.read().isEmpty()) {
            ProductRepository.initialData();
        }
        try {
            request.setAttribute("listItem", ProductRepository.sortByPrice(200, 99999999));
            System.out.println(ProductRepository.read().size());
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
