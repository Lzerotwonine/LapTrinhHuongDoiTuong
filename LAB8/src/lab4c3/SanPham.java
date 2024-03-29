package lab4c3;

import java.util.Scanner;

public class SanPham {
    public String tenSp;
    public double donGia;
    public double giamGia;
    
    public SanPham() {
    }
    
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia){
        this(tenSp, donGia, 0);
    }
    
    private double getThueNhapKhau(double donGia){
        return donGia * 0.1; 
    }
    
    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nTen san pham: ");
        tenSp = in.nextLine();
        System.out.println("Don gia: ");
        donGia = in.nextDouble();
        System.out.println("Giam gia: ");
        giamGia = in.nextDouble();
    }
    
    public void xuat() {
        System.out.println("\nTen san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + donGia * 0.1);
    }
}
