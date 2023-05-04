package bai1a;

import bai1a.Account;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AccountList {
    private Account[] accList;
    private int count, n;

    
    public AccountList(Account[] accList, int count) {
        this.accList = new Account[10];
        this.count = 0;
    }

    public AccountList(Account[] accList, int count, int n) {
        if (n > 0) {
            this.accList = new Account[n];
        } else {   
            this.accList = new Account[10];
            this.count = 0;
        }
    }
    
    Scanner scanner = new Scanner(System.in);
    
    public void nhapTaiKhoan(Account accList) {
        for (int i = 0; i < n; i++) {
            System.out.println("Khach hang so " + (i+1));
            System.out.println("Nhap so tai khoan: ");
            accList.setSoTK(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhap ten tai khoan: ");
            accList.setTenTK(scanner.nextLine());
            accList.setSoTien(50);
        }
    }
    
    void inTaiKhoan() {
        Locale local = new Locale("vi", "VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String soTienTaiKhoan = formatter.format(soTien);
        System.out.printf("%10s %20d %20s \n",tenTK, soTK,  soTienTaiKhoan);
    }
}
