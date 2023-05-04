package bai1a;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    
    private double soTien;
    private int soTK;
    private String tenTK, trangThai;

    public Account() {
    }

    public Account(double soTien, int soTK, String tenTK) {
        this.soTien = 50;
        this.soTK = 999999;
        this.tenTK = null;
    }

    public double getSoTien() {
        return soTien;
    }

    public int getSoTK() {
        return soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setSoTien(double soTien) {
        if (soTien >= 50)
            this.soTien = soTien;
        else {
            this.soTien = 50;
            System.out.println("So tien khong hop le!");
        }    
    }

    public void setSoTK(int soTK) {
        if (soTK > 0 && soTK != 9999999)
            this.soTK = soTK;
        else {
            this.soTK = 999999;
            System.out.println("So tai khoan khong hop le!");
        }
    }

    public void setTenTK(String tenTK) {
        if (tenTK != null)
            this.tenTK = tenTK;
        else {
            this.tenTK = null;
            System.out.println("Ten khong hop le!");
        }
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        Locale local = new Locale("vi", "VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String soTienTaiKhoan = formatter.format(soTien);
        return "Account{" + "soTien=" + soTienTaiKhoan + ", soTK=" + soTien + ", tenTK=" + tenTK + '}';
    }
    
    Scanner scanner = new Scanner(System.in);
    
    public double napTien() {
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = scanner.nextDouble();
        
        if (nap >= 0) {
            soTien = nap + soTien;
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String soTienTaiKhoan = formatter.format(nap);
            System.out.println("bạn vừa nạp " + soTienTaiKhoan + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }

    public double rutTien() {
        double phi = 5;
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = scanner.nextDouble();
        
        if (rut <= (soTien - phi)) {
            soTien = soTien - (rut + phi);
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String soTienTaiKhoan = formatter.format(rut);
            System.out.println("Bạn vừa rút " + soTienTaiKhoan + " từ tài khoản. Phí là $5.");
        } else {
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rutTien();
        }
        return rut;
    }
 
    public double daoHan() {
        double laiSuat = 0.035;
        soTien = soTien + soTien * laiSuat;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String soTienTaiKhoan = formatter.format(soTien);
        System.out.println("Bạn vừa được " + soTienTaiKhoan + " từ đáo hạn 1 tháng");
        return soTien;
    }
 
    void inTK() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String soTienTaiKhoan = formatter.format(soTien);
        System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, soTienTaiKhoan);
    }
}
