/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author acer
 */
public class Brands {
    private int BrandID;
    private String BrandName;
    private String PictureString;

    public Brands() {
    }

    public Brands(int BrandID, String BrandName, String PictureString) {
        this.BrandID = BrandID;
        this.BrandName = BrandName;
        this.PictureString = PictureString;
    }

    public int getBrandID() {
        return BrandID;
    }

    public void setBrandID(int BrandID) {
        this.BrandID = BrandID;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getPictureString() {
        return PictureString;
    }

    public void setPictureString(String PictureString) {
        this.PictureString = PictureString;
    }
    
}
