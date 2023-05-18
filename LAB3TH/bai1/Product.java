package bai1;

/**
 *
 * @author Tran Nguyen Gia Long
 * 105008059
 * CNTT2
 * 
 */

public class Product {
    private String description;
    private String productID;
    private double price;

    public Product() {
    }
    
    public Product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }
    
    public String getdescription() {
        return description;
    }
    
    public String getproductID() {
        return productID;
    }
    
    public double getprice() {
        return price;
    }
    
    public void setdescription(String description) {
        this.description = description;
    }
    
    public void setproductID(String productID) {
        this.productID = productID;
    }
    
    public void setprice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product{" + "Ma SP" + productID + "Mo ta" + description + "Don gia" + price + '}';
    }
}
