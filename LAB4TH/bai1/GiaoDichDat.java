package lab4th;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    private int luaChon;

    public GiaoDichDat() {
    }

    public GiaoDichDat(String loaiDat, String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    public double thanhTien() {
        if (!"A".equals(loaiDat))
            return dienTich * donGia;
        else
            return dienTich * donGia * 1.5;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        do {
        System.out.println("Nhập loại đất: ");
        System.out.println("0. A.");
        System.out.println("1. B.");
        System.out.println("2. C.");
        luaChon = scanner.nextInt();
            switch (luaChon) {
                case 0:
                    loaiDat = "A";
                    break;
                case 1:
                    loaiDat = "B";
                    break;
                case 2:
                    loaiDat = "C";
                    break;
                default:
                    System.out.println("Loại đất không đúng!");
            }
        } while (luaChon != 3);
    }

    @Override
    public String toString() {
        return super.toString() + ", loại đất: " + loaiDat;
    }
}
