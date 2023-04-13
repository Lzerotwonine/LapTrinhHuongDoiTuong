package lab4c4;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;
    
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

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    private double getThueNhapKhau(double donGia){
        return donGia * 0.1; 
    }
    
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
