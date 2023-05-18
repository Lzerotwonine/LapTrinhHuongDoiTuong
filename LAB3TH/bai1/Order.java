package bai1;

/**
 *
 * @author Tran Nguyen Gia Long
 * 105008059
 * CNTT2
 * 
 */

import java.time.LocalDate;

public class Order {
    
    private int orderID;
    private OrderDetail[] lineItems;
    private LocalDate orderDate;
    private int count;
    
    public void addLineItem(Product p, int x) {
        lineItems.add(new OrderDetail(p, x));
    }
    
    public double calcTotalCharge(int n) {
        for (int count = 0; count < n; count++)
            double thd += ;
    }
    
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public OrderDetail[] getLineItems() {
        return lineItems;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    
}
