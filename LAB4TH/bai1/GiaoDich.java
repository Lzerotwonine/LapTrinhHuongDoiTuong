package lab4th;

import java.util.Scanner;

public class GiaoDich {
    private String maGiaoDich, ngayGiaoDich;
    public double donGia, dienTich;
    
    Scanner scanner = new Scanner(System.in);
    
    public GiaoDich() {
    }
    
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    
    public String getmaGiaoDich() {
        return maGiaoDich;
    }
    
    public String getngayGiaoDich() {
        return ngayGiaoDich;
    }
    
    public double getdonGia() {
        return donGia;
    }
    
    public double getdienTich() {
        return dienTich;
    }
    
    public void setmaGiaoDich (String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    
    public void setngayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    
    public void setdonGia (double donGia) {
        this.donGia = donGia;
    }
    
    public void setdienTich (double dienTich) {
        this.dienTich = dienTich;
    }
    
    public void nhap() {
        System.out.println("Nhập mã giao dịch:");
        maGiaoDich = scanner.nextLine();
        System.out.println("Nhập ngày giao dịch:");
        ngayGiaoDich = scanner.nextLine();
        System.out.println("Nhập đơn giá:");
        donGia = scanner.nextDouble();
        System.out.println("Nhập diện tích:");
        dienTich = scanner.nextDouble();
    }
    
    @Override
    public String toString() {
        return "Mã giao dịch: " + maGiaoDich + ", ngày giao dịch: " + ngayGiaoDich + ", đơn giá: " + donGia + ", diện tíhc: " + dienTich;
    }
}
