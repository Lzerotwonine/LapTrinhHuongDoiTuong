package lab5c1;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSoThuc {
    private ArrayList<Double> list = new ArrayList<>();

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cac so thuc vao danh sach");
        while (true) {
            System.out.print("Nhap so: ");
            Double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            System.out.print("Nhap tiep du lieu (Y/N): ");
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void hienThi() {
        for (Double item : list) {
            System.out.print("\n" + item);
        }
    }

    public void tinhTong() {
        double tong = 0;
        for (Double item : list) {
            tong += item;
        }
        System.out.println();
        System.out.println("Tong: " + tong);
    }
}
