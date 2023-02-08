/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author blabl
 */
public class Products {

    public Products(int productID, String productName, int brandID, String chip, int ram, String pin, String PhoneScreen, String picture, float discount) {
        this.productID = productID;
        this.productName = productName;
        this.brandID = brandID;
        this.chip = chip;
        this.ram = ram;
        this.pin = pin;
        this.PhoneScreen = PhoneScreen;
        this.picture = picture;
        this.discount = discount;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPhoneScreen() {
        return PhoneScreen;
    }

    public void setPhoneScreen(String PhoneScreen) {
        this.PhoneScreen = PhoneScreen;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    
    private int productID;
    private String productName;
    private int brandID;
    private String chip;
    private int ram;
    private String pin;
    private String PhoneScreen;
    private String picture;
    private float discount;
    
    
}
