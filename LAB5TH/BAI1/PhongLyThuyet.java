package BAI1;

public class PhongLyThuyet extends Phong {
    private int soMayChieu;

    public PhongLyThuyet() {
    }

    public PhongLyThuyet(int soMayChieu, String maPhong, int dayNha, int soBongDen, double dienTich) {
        super(maPhong, dayNha, soBongDen, dienTich);
        this.soMayChieu = soMayChieu;
    }

    public int getSoMayChieu() {
        return soMayChieu;
    }

    public void setSoMayChieu(int soMayChieu) {
        this.soMayChieu = soMayChieu;
    }

    @Override
    public String toString() {
        return "PhongLyThuyet{" + "soMayChieu=" + soMayChieu + '}';
    }
    
    
}
