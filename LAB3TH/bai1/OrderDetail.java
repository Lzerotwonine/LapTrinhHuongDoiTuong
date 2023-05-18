package bai1;

/**
 *
 * @author Tran Nguyen Gia Long
 * 105008059
 * CNTT2
 * 
 */

public class OrderDetail {
    private int quantity;
    private Product product;
    
    public double calcTotalPrice(double price) {
        return quantity * price;
    }
    
    @Override
    public String toString() {
        return "Product{" + "S Luong" + quantity + '}';
    }
    
    public int getquantity() {
        return quantity;
    }
    
    public void setquantity(int quantity) {
        this.quantity = quantity;
    }
    
    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
