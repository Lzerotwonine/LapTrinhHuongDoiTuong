package BAI1;

public class PhongThiNghiem extends Phong {
    private String chuyenNganh, bonRua;
    private double sucChua;

    public PhongThiNghiem() {
    }

    public PhongThiNghiem(String chuyenNganh, String bonRua, double sucChua, String maPhong, int dayNha, int soBongDen, double dienTich) {
        super(maPhong, dayNha, soBongDen, dienTich);
        this.chuyenNganh = chuyenNganh;
        this.bonRua = bonRua;
        this.sucChua = sucChua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getBonRua() {
        return bonRua;
    }

    public void setBonRua(String bonRua) {
        this.bonRua = bonRua;
    }

    public double getSucChua() {
        return sucChua;
    }

    public void setSucChua(double sucChua) {
        this.sucChua = sucChua;
    }

    @Override
    public String toString() {
        return "PhongThiNghiem{" + "chuyenNganh=" + chuyenNganh + ", bonRua=" + bonRua + ", sucChua=" + sucChua + '}';
    }
    
}
