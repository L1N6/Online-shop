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
import java.util.List;

/**
 *
 * @author LEGION
 */
public class SearchingController extends HttpServlet {
private final PaginationObject pcp = new PaginationObject();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String searchingInf = req.getParameter("txtSearch");
        List<Product> searchingList = new ProductDAO().searchProducts(searchingInf);
        System.out.println(searchingList.size());
        int currentPage;
            String a = req.getParameter("currentPage");
            if ("".equals(a) || a == null) {
                currentPage = 1;
            } else {
                currentPage = Integer.parseInt(req.getParameter("currentPage"));
            }
        int numberOfPage;
        List<Product> getProduct = pcp.getPageOfResult(searchingList, currentPage, PaginationObject.getNumberOfRowEachPage());
        numberOfPage = pcp.getTotalPageOfResult(searchingList, PaginationObject.getNumberOfRowEachPage());
        req.getSession().setAttribute("currentPage", currentPage);
        req.setAttribute("numberOfPage", numberOfPage);
        req.setAttribute("shopListProduct", getProduct);
        req.getRequestDispatcher("shop.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}