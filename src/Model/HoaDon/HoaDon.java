/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.HoaDon;

import Model.Nguoi.KhachHang;
import Model.SanPham.SanPham;

import java.util.Date;

/**
 *
 * @author SUN_LIFE
 */
public class HoaDon {
    private SanPham sanPham;
    private double tongThanhToan;
    private Date ngayXuatHoaDon;
    private KhachHang nguoiMuaHang;

    private String maHoaDon;


    public HoaDon(SanPham sanPham, double tongThanhToan, Date ngayXuatHoaDon, KhachHang nguoiMuaHang, String maHoaDon) {
        this.sanPham = sanPham;
        this.tongThanhToan = tongThanhToan;
        this.ngayXuatHoaDon = ngayXuatHoaDon;
        this.nguoiMuaHang = nguoiMuaHang;
        this.maHoaDon = maHoaDon;

    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public double getTongThanhToan() {
        return tongThanhToan;
    }

    public void setTongThanhToan(double tongThanhToan) {
        this.tongThanhToan = tongThanhToan;
    }

    public Date getNgayXuatHoaDon() {
        return ngayXuatHoaDon;
    }

    public void setNgayXuatHoaDon(Date ngayXuatHoaDon) {
        this.ngayXuatHoaDon = ngayXuatHoaDon;
    }

    public KhachHang getNguoiMuaHang() {
        return nguoiMuaHang;
    }

    public void setNguoiMuaHang(KhachHang nguoiMuaHang) {
        this.nguoiMuaHang = nguoiMuaHang;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    
    
    
}
