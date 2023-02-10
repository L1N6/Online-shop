/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAL.PaginationObject;
import DAL.Product;
import DAO.ProductDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEGION
 */
public class ShopViewController extends HttpServlet {

    private final PaginationObject pcp = new PaginationObject();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("asdadajdwijd");
        resp.sendRedirect("/shop");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String choice = req.getParameter("sort");
        int currentPage;
        int numberOfPage;
        String a = req.getParameter("currentPage");
                if ("".equals(a) || a == null) {
                    currentPage = 1;
                } else {
                    currentPage = Integer.parseInt(req.getParameter("curresntPage"));
                }
        switch (choice) {
            case "sort":
                List<Product> listProduct = new ProductDAO().getAllProduct();
                

                List<Product> getProduct = pcp.getPageOfResult(listProduct, currentPage, PaginationObject.getNumberOfRowEachPage());
                numberOfPage = pcp.getTotalPageOfResult(listProduct, PaginationObject.getNumberOfRowEachPage());
                req.getSession().setAttribute("currentPage", currentPage);
                req.setAttribute("numberOfPage", numberOfPage);
                req.setAttribute("shopListProduct", getProduct);
                break;
            default: {
                List<Product> listSortingProduct = new ProductDAO().getAllProduct();
                

                List<Product> sortProduct = pcp.getPageOfResult(listSortingProduct, currentPage, PaginationObject.getNumberOfRowEachPage());
                numberOfPage = pcp.getTotalPageOfResult(listSortingProduct, PaginationObject.getNumberOfRowEachPage());
                req.getSession().setAttribute("currentPage", currentPage);
                req.setAttribute("numberOfPage", numberOfPage);
                req.setAttribute("shopListProduct", sortProduct);
                break;
            }

        }

        req.getRequestDispatcher("shop.jsp").forward(req, resp);
    }

}
