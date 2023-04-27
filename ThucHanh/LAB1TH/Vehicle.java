package lab1th;

import java.util.Scanner;

public class Vehicle {
    private String tenChuXe, loaiXe;
    private int dungTich;
    private double triGia;

    public Vehicle() {
    }
    
    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }
    
    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nNhap ten chu xe: ");
        tenChuXe = in.nextLine();
        System.out.println("Nhap loai xe: ");
        loaiXe = in.nextLine();
        System.out.println("Nhap dung tich: ");
        dungTich = in.nextInt();
        System.out.println("Nhap tri gia: ");
        triGia = in.nextFloat();
    }
   
    public void xuat() {
        System.out.printf("%10s %10s %10d %15.2f %15.2f\n",tenChuXe ,loaiXe,dungTich,triGia,tinhThue());
    }
    
    public double tinhThue() {
        double thue;
        if (dungTich < 100)
            thue = triGia*0.01;
        else if (dungTich >= 100 && dungTich <= 200)
            thue = triGia * 0.03;
        else
            thue = triGia * 0.05;
        return thue;
    }
}
