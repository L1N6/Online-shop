/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAL.DBContext;
import DAL.ProductStorages;
import DAL.Products;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LEGION
 */
public class ProductDetail extends DBContext {

    public Products getProductsInfo(String nameProduct) {
        Products products = null;
        try {
            String sql = "SELECT [ProductID],[ProductName],[BrandID],[Chip],[Ram],[Pin],[OperatingSystem],[PhoneScreen],[Picture]\n"
                    + "FROM [SHOP_DB_TEST_8].[dbo].[Products] WHERE ProductName = '?'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nameProduct);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int ProductID = rs.getInt("ProductID");
                int ProductName = rs.getInt("ProductName");
                int BrandID = rs.getInt("BrandID");
                String Chip = rs.getString("Chip");
                String Ram = rs.getString("Ram");
                String Pin = rs.getString("Pin");
                String OperatingSystem = rs.getString("OperatingSystem");
                String PhoneScreen = rs.getString("PhoneScreen");
                String Picture = rs.getString("Picture");
                products = new Products(ProductID, ProductName, BrandID, Chip, Ram, Pin, OperatingSystem, PhoneScreen, Picture);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    
//    public ProductStorages getProductStoragThrowProductID(int productID){
//        ProductStorages pds = null;
//        try {
//            String 
//        } catch (Exception e) {
//        }
//    }
}
