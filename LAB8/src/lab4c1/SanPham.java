package lab4c1;

import java.util.Scanner;

public class SanPham {
    public String tenSp;
    public double donGia;
    public double giamGia;
    
    public void nhap() {
        System.out.println("\nTen san pham: ");
        tenSp = new Scanner(System.in).nextLine();
        System.out.println("Don gia: ");
        donGia = new Scanner(System.in).nextDouble();
        System.out.println("Giam gia: ");
        giamGia = new Scanner(System.in).nextDouble();
    }
    
    public void xuat() {
        System.out.println("\nTen san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + donGia * 0.1);
    }
}
