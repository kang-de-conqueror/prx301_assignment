/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import Repository.ProductRepository;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CreateProductController", urlPatterns = {"/create_product"})
public class CreateProductController extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(CreateProductController.class.getName());
    private static final String HOME = "home";
    private static final String CREATE_PRODUCT_PAGE = "create_product.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = HOME;
        try {
            boolean isValid = true;

            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String brand = request.getParameter("brand");
            String color = request.getParameter("color");
            Integer price = Integer.parseInt(request.getParameter("price"));
            Integer quantity = Integer.parseInt(request.getParameter("quantity"));
            String imgUrl = "";

            if (isValid) {
                Product product = new Product(id, name, brand, price, color, quantity, imgUrl);
                if (!ProductRepository.create(product)) {
                    url = CREATE_PRODUCT_PAGE;
                    request.setAttribute("errorMessage", "Cannot create new product. Please try again!");
                }
                LOGGER.log(Level.SEVERE, "Products size: " + ProductRepository.read().size());
            } else {
                request.setAttribute("errorMessage", "Please fill full of information!");
                url = CREATE_PRODUCT_PAGE;
            }

        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "[CreateProductController] Error: " + ex.getMessage(), ex);
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
