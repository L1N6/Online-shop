/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author acer
 */
public class ProductColors {
    private int ProductColerID;
    private int ProductStorageID;
    private String Picture;
    private String Coler;
    private int UnitInStock;
    private int UnitsOnOrder;

    public ProductColors() {
    }

    public ProductColors(int ProductColerID, int ProductStorageID, String Picture, String Coler, int UnitInStock, int UnitsOnOrder) {
        this.ProductColerID = ProductColerID;
        this.ProductStorageID = ProductStorageID;
        this.Picture = Picture;
        this.Coler = Coler;
        this.UnitInStock = UnitInStock;
        this.UnitsOnOrder = UnitsOnOrder;
    }
    
    
}
