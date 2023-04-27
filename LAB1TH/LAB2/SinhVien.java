package lab2;

public class SinhVien {
    private String maSV, hoTen;

    @Override
    public String toString() {
        return "\t" + maSV + "|" + hoTen;
    }
    
    public SinhVien() {
    }
    
    public SinhVien(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
}
