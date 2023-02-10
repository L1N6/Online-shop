/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author acer
 */
public class ProductStorages {
    private int ProductStorageID;
    private int ProductID;
    private int Storage;
    private double UnitPrice;

    public ProductStorages() {
    }

    public ProductStorages(int ProductStorageID, int ProductID, int Storage, double UnitPrice) {
        this.ProductStorageID = ProductStorageID;
        this.ProductID = ProductID;
        this.Storage = Storage;
        this.UnitPrice = UnitPrice;
    }

    public int getProductStorageID() {
        return ProductStorageID;
    }

    public void setProductStorageID(int ProductStorageID) {
        this.ProductStorageID = ProductStorageID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int Storage) {
        this.Storage = Storage;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }
    
}
