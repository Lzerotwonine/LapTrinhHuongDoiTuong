package Bai2;

import java.util.Date;

public class HangThucPham {
	String maHang;
	String tenHang;
	int soLuongTon;
	double donGia;
	Date ngaySanXuat;
	Date ngayHetHan;
	String nhaCungCap;
	public HangThucPham() {
		
	}
	public HangThucPham(String maHang, String tenHang, int soLuongTon,double donGia,Date ngaySanXuat,Date ngayHetHan,String nhaCungCap){
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuongTon = soLuongTon;
		this.donGia = donGia;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		this.nhaCungCap = nhaCungCap;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public String getMaHang() {
		return maHang;
	}
	public Date getNgayHetHan() {
		return ngayHetHan;
	}
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public String getTenHang() {
		return tenHang;
	}
	
	
}
