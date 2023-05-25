package BAI1;

public class PhongMayTinh extends Phong {
    private int soMayTinh;

    public PhongMayTinh() {
    }

    public PhongMayTinh(int soMayTinh, String maPhong, int dayNha, int soBongDen, double dienTich) {
        super(maPhong, dayNha, soBongDen, dienTich);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public String toString() {
        return "PhongMayTinh{" + "soMayTinh=" + soMayTinh + '}';
    }
    
    
}
