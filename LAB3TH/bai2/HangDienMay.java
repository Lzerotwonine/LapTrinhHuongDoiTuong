package Bai2;

public class HangDienMay {
	String maHang;
	String tenHang;
	int soLuongTon;
	double donGia;
	int ThoiGianBH;
	double congSuat;
	public HangDienMay() {
		
	}
	public HangDienMay(String maHang, String tenHang, int soLuongTon,double donGia,int ThoiGianBH ,double congSuat) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuongTon = soLuongTon;
		this.donGia = donGia;
		this.congSuat = congSuat;
		this.ThoiGianBH = ThoiGianBH;
	}
	public double getCongSuat() {
		return congSuat;
	}
	public double getDonGia() {
		return donGia;
	}
	public String getMaHang() {
		return maHang;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public String getTenHang() {
		return tenHang;
	}
	public int getThoiGianBH() {
		return ThoiGianBH;
	}
	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public void setThoiGianBH(int thoiGianBH) {
		ThoiGianBH = thoiGianBH;
	}
}
