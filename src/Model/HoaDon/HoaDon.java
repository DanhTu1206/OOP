/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.HoaDon;

import Model.Nguoi.KhachHang;
import Model.SanPham.SanPham;

import java.util.Date;
import java.util.List;

/**
 *
 * @author SUN_LIFE
 */
public class HoaDon {
    private List<SanPham> cacSanPham;
    private double tongThanhToan;
    private Date ngayXuatHoaDon;
    private KhachHang nguoiMuaHang;

    private String maHoaDon;


    public HoaDon(List<SanPham> cacSanPham, double tongThanhToan, Date ngayXuatHoaDon, KhachHang nguoiMuaHang, String maHoaDon) {
        this.cacSanPham = cacSanPham;
        this.tongThanhToan = tongThanhToan;
        this.ngayXuatHoaDon = ngayXuatHoaDon;
        this.nguoiMuaHang = nguoiMuaHang;
        this.maHoaDon = maHoaDon;

    }

    public List<SanPham>  getSanPham() {
        return cacSanPham;
    }

    public void setSanPham(List<SanPham> cacSanPham) {
        this.cacSanPham = cacSanPham;
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
