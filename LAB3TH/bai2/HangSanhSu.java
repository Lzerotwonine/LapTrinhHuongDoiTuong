package Bai2;

import java.util.Date;

public class HangSanhSu {
	String maHang;
	String tenHang;
	int soLuongTon;
	double donGia;
	String nhaSX;
	Date ngayNhapKho;
	public HangSanhSu() {
		
	}
	public HangSanhSu(String maHang, String tenHang, int soLuongTon,double donGia, String nhaSX, Date ngayNhapKho) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuongTon = soLuongTon;
		this.donGia = donGia;
		this.nhaSX = nhaSX;
		this.ngayNhapKho = ngayNhapKho;
	}
	public double getDonGia() {
		return donGia;
	}
	public String getMaHang() {
		return maHang;
	}
	public Date getNgayNhapKho() {
		return ngayNhapKho;
	}
	public String getNhaSX() {
		return nhaSX;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public void setNgayNhapKho(Date ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}
	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	
}
