package com.example.ead_practice.servlets;
import com.example.ead_practice.entity.Product;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;
import javax.ejb.*;
import javax.naming.*;

@WebServlet("/productServlet")
public class ProductServlet<ProductBean> extends HttpServlet {

    // Inject CMP beans using dependency injection (EJB annotations)
    @EJB
    private ProductBean productBean;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        try {
            // Retrieve all products from the database using CMP bean
            List<Product> products = productBean.getAllProducts();

            // Display product information
            out.println("<h2>Product List</h2>");
            out.println("<table border='1'><tr><th>Product ID</th><th>Product Name</th><th>Description</th><th>Price</th></tr>");
            for (Product product : products) {
                out.println("<tr><td>" + product.getProID() + "</td><td>" + product.getProdName() + "</td><td>"
                        + product.getDescription() + "</td><td>" + product.getPrice() + "</td></tr>");
            }
            out.println("</table>");
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }

        out.println("</body></html>");
    }
}
