package lab2;
import java.util.ArrayList;

public class LopHocPhan {
    private String maLHP, tenLHP, tenGV, thongTinLopHoc;
    private ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();

    public int getSoLuongSV(){
        return 0;
    }

    @Override
    public String toString() {
        return "LopHocPhan{" + "maLHP=" + maLHP + ", tenLHP=" + tenLHP + ", tenGV=" + tenGV + ", thongTinLopHoc=" + thongTinLopHoc + ", dsSV=" + dsSV + '}';
    }

    public LopHocPhan() {
    }
    
    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, ArrayList<SinhVien> dsSV) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
        this.dsSV = dsSV;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public ArrayList<SinhVien> getDsSV() {
        return dsSV;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    
}
