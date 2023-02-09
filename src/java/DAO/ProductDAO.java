/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAL.DBContext;
import DAL.Products;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author blabl
 */
public class ProductDAO extends DBContext {

    public ArrayList<Products> getProductBestSale() {
        ArrayList<Products> list = new ArrayList<>();
        try {
            Date date = java.util.Calendar.getInstance().getTime();
            String sql = "select * from SalesDuring as a inner join Discounts as b on a.SaleID=b.SaleID  "
                    + "inner join Products as c on b.ProductID=c.ProductID";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Date dateS = rs.getDate("StartSale");
                Date dateE = rs.getDate("EndSale");
                System.out.println(dateE);
                if (dateS.before(date) && date.before(dateE)) {
                    int productID = rs.getInt("ProductID");
                    String productName = rs.getString("ProductName");
                    int brandID = rs.getInt("BrandID");
                    String chip = rs.getString("Chip");
                    int ram = rs.getInt("Ram");
                    String pin = rs.getString("Pin");
                    String PhoneScreen = rs.getString("PhoneScreen");
                    String picture = rs.getString("Picture");
                    float discount = rs.getFloat("Discount");
                    Products product = new Products(productID, productName, brandID, chip, ram, pin, PhoneScreen, picture, discount);
                    list.add(product);
                }
                Collections.sort(list, new Comparator<Products>() {
                    @Override
                    public int compare(Products s1, Products s2) {
                        return Float.compare(s2.getDiscount(), s1.getDiscount());
                    }
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) throws ParseException {

    }
}
