/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Repository.ProductRepository;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "IndexController", urlPatterns = {"/IndexController"})
public class IndexController extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(IndexController.class.getName());
    private static final String HOME = "home.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductRepository.initialData();
        String url = HOME;
        try {
            request.setAttribute("products", ProductRepository.read());
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "[IndexController] Error: " + ex.getMessage(), ex);
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }
}
