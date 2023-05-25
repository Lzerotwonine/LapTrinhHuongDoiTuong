package BAI1;

public class Phong {
    private String maPhong;
    private int dayNha, soBongDen;
    private double dienTich;

    public Phong() {
    }

    public Phong(String maPhong, int dayNha, int soBongDen, double dienTich) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.soBongDen = soBongDen;
        this.dienTich = dienTich;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public int getDayNha() {
        return dayNha;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setDayNha(int dayNha) {
        this.dayNha = dayNha;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    
    
    
    @Override
    public String toString() {
        return "Phong{" + "maPhong=" + maPhong + ", dayNha=" + dayNha + ", soBongDen=" + soBongDen + ", dienTich=" + dienTich + '}';
    }
   
    
}
