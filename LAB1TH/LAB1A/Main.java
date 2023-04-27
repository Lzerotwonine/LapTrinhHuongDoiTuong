package lab1a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle vh1 = new Vehicle();
        Vehicle vh2 = new Vehicle();
        Vehicle vh3 = new Vehicle();
        int so = 3;
        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+-----------------------+");
        System.out.println("1. Nhap thong tin xe.");
        System.out.println("2. Xuat thong tin xe.");
        System.out.println("3. Thoat.");
        System.out.println("+-----------------------+");
        System.out.print("Chon chuc nang: ");

        so = scanner.nextInt();
        switch (so) {
            case 1:
                vh1.nhap();
                vh2.nhap();
                vh3.nhap();
                break;
            case 2:
                System.out.printf("%10s %10s %10s %15s %15s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri Gia", "Thue phai nop");
                System.out.println("=============================================================");
                vh1.xuat();
                vh2.xuat();
                vh3.nhap();
                break;
            default :
                break;
        }
        } while (so!=3);
    }
}
