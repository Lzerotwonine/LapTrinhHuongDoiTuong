package lab4th;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<GiaoDichNha> listGiaoDichNha = new ArrayList<>();
        ArrayList<GiaoDichDat> listGiaoDichDat = new ArrayList<>();

        int soGiaoDichDat = 0, soGiaoDichNha = 0;
        double tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng giao dịch đất: ");
        soGiaoDichDat = scanner.nextInt();
        System.out.println("Nhập số lượng giao dịch nhà: ");
        soGiaoDichNha = scanner.nextInt();


        for (int i = 0; i < soGiaoDichDat; i++) {
            System.out.println("Nhập giao dịch đất thứ " + (i + 1) + ":");
            GiaoDichDat giaoDichDat = new GiaoDichDat();
            giaoDichDat.nhap();
            listGiaoDichDat.add(giaoDichDat);
        }
        
        for (int i = 0; i < soGiaoDichNha; i++) {
            System.out.println("Nhập giao dịch nhà thứ " + (i + 1) + ":");
            GiaoDichNha giaoDichNha = new GiaoDichNha();
            giaoDichNha.nhap();
            listGiaoDichNha.add(giaoDichNha);
        }
        
        System.out.println("---Danh sách các giao dịch đất---");
        for (int i = 0; i < listGiaoDichDat.size(); i++) {
            System.out.println(listGiaoDichDat.get(i).toString());
        }
        
        System.out.println("---Danh sách các giao dịch nhà---");
        for (int i = 0; i < listGiaoDichNha.size(); i++) {
            System.out.println(listGiaoDichNha.get(i).toString());
        }
        
        for (int i = 0; i < listGiaoDichDat.size(); i++) {
            if (listGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")) {
                tongTienGiaoDichDat += listGiaoDichDat.get(i).getdienTich() * listGiaoDichDat.get(i).getdonGia() * 1.5;
            } else if (listGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("B") || listGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("C")) {
                tongTienGiaoDichDat += listGiaoDichDat.get(i).getdienTich() * listGiaoDichDat.get(i).getdonGia();
            }
        }
        trungBinhThanhTien = tongTienGiaoDichDat / (listGiaoDichDat.size());
        System.out.println("Trung bình thành tiền của giao dịch đất = " + trungBinhThanhTien);
        
        System.out.println("Các giao dịch đất của tháng 9 năm 2023: ");
        for (int i = 0; i < listGiaoDichDat.size(); i++) {
            String[] dateGiaoDichDat = listGiaoDichDat.get(i).getngayGiaoDich().split("/");
            if (dateGiaoDichDat[1].equals("9") && dateGiaoDichDat[2].equals("2023")) {
                System.out.println(listGiaoDichNha.get(i).toString());
            }
        }
        
        System.out.println("Các giao dịch nhà của tháng 9 năm 2023: ");
        for (int i = 0; i < listGiaoDichNha.size(); i++) {
            String[] dateGiaoDichNha = listGiaoDichNha.get(i).getngayGiaoDich().split("/");
            if (dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2023")) {
                System.out.println(listGiaoDichNha.get(i).toString());
            }
        }
    }
}
