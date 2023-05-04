import java.util.Scanner;
import java.util.Arrays;

public class AccountTest {
    public static void main(String[] args) {
        int n;
        int so = 7;
        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+--------------------------------+");
        System.out.println("1. Nhap tai khoan khach hang.");
        System.out.println("2. Hien so tai khoan hien co.");
        System.out.println("3. In tat ca thong tin tai khoan.");
        System.out.println("4. Nap tien vao tai khoan.");
        System.out.println("5. Rut tien khoi tai khoan.");
        System.out.println("6. Chuyen khoan.");
        System.out.println("0. Thoat.");
        System.out.println("+--------------------------------+");
        System.out.print("Chon chuc nang: ");

        so = scanner.nextInt();
        switch (so) {
            case 1:
                do {
                    System.out.println("Nhap so luong khach hang muon nhap: ");
                    n = scanner.nextInt();
                } while (n < 0);
       
                for (int i = 0; i < n; i++) {
                    System.out.println("Khách hàng số: " + (i+1));
                    list[i] = new Account();
                    nhapTK(list[i]);
                }
                break;
            case 2:
                System.out.printf("%20s %20s %20s\n", "Ten tai khoan", "So tai khoan", "So tien");
                for (int i = 0; i < n; i++) {
                    a[i].inTK();
                }
                break;
            default :
                break;
        }
        } while (so!=7);
    }
}
