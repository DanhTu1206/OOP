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
    private int idKhachHang;
    private int soSanPhamDaMua;
    private double diemTichLuy;

    public KhachHang() {
    }

    public KhachHang(int idKhachHang, int soSanPhamDaMua, double diemTichLuy, String hoTen, String soDienThoai) {
        super(hoTen, soDienThoai);
        this.idKhachHang = idKhachHang;
        this.soSanPhamDaMua = soSanPhamDaMua;
        this.diemTichLuy = diemTichLuy;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
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
                ", ID Khach Hang: " + getIdKhachHang() + 
                ", So San Pham Da Mua: " + getSoSanPhamDaMua() + 
                ", Diem Tich Luy: " + getDiemTichLuy();
    }
    
}
