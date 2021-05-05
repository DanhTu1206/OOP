/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Nguoi;

/**
 *
 * @author SUN_LIFE
 */
public class KhachHang extends Nguoi{
    private int maKhachHang;
    private int soSanPhamDaMua;
    private double diemTichLuy;

    public KhachHang() {
    }

    public KhachHang(int maKhachHang, int soSanPhamDaMua, double diemTichLuy, String hoTen, String soDienThoai) {
        super(hoTen, soDienThoai);
        this.maKhachHang = maKhachHang;
        this.soSanPhamDaMua = soSanPhamDaMua;
        this.diemTichLuy = diemTichLuy;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int idKhachHang) {
        this.maKhachHang = idKhachHang;
    }

    public int getSoSanPhamDaMua() {
        return soSanPhamDaMua;
    }

    public void setSoSanPhamDaMua(int soSanPhamDaMua) {
        this.soSanPhamDaMua = soSanPhamDaMua;
    }

    public double getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(double diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }
    
    public String inTTin() {
        return "Ho Ten Khach Hang: " + getHoTen() + 
                ", So Dien Thoai: " + getSoDienThoai() + 
                ", ID Khach Hang: " + getMaKhachHang() +
                ", So San Pham Da Mua: " + getSoSanPhamDaMua() + 
                ", Diem Tich Luy: " + getDiemTichLuy();
    }
    
}
