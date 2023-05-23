package lab4th;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha, diaChi;
    private int luaChon;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String loaiNha, String diaChi, String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public double thanhTien() {
        if (!"thường".equals(loaiNha))
            return dienTich * donGia;
        else
            return dienTich * donGia * 0.09;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        do {
        System.out.println("Nhập loại nhà: ");
        System.out.println("0. Cao cấp.");
        System.out.println("1. Thường.");
        luaChon = scanner.nextInt();
            switch (luaChon) {
                case 0:
                    loaiNha = "cao cấp";
                    break;
                case 1:
                    loaiNha = "thường";
                    break;
                default:
                    System.out.println("Số không đúng!");
            }
        } while (luaChon != 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", loại nhà: " + loaiNha + ", địa chỉ: " + diaChi;
    }
}
