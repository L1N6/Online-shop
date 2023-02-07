/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import DAL.DBContext;
import DAL.Products;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author blabl
 */
public class ProductDAO extends DBContext{
   public ArrayList<Products> getProduct(String sql) {
        ArrayList<Products> list = new ArrayList<>();
        try {
            
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int productID = rs.getInt("ProductID");
                float unitPrice = rs.getFloat("UnitPrice");
                String productName = rs.getString("ProductName");
                int categoryID = rs.getInt("CategoryID");
                String quantityPerUnit = rs.getString("QuantityPerUnit");
                int unitsInStock = rs.getInt("UnitsInStock");
                int unitsOnOrder = rs.getInt("UnitsOnOrder");
                int reorderLevel = rs.getInt("ReorderLevel");
                boolean discontinued = rs.getBoolean("Discontinued");
                int brandID = rs.getInt("BrandID");
                String chip = rs.getString("Chip");
                int ram = rs.getInt("Ram");
                String pin = rs.getString("Pin");
                String PhoneScreen = rs.getString("PhoneScreen");
                String picture = rs.getString("Picture");
                Products product = new Products(productID, productName, brandID, chip, ram, pin, PhoneScreen, picture);
                list.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
