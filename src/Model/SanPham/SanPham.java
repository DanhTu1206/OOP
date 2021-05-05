/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.SanPham;

/**
 *
 * @author SUN_LIFE
 */
public abstract class SanPham {
    private String tenSanPham;
    private String hangSanXuat;
    private String model;
    private double gia;
    private String maSanPham;
    private int thoiGianBaoHanh;

    public SanPham() {
    }

    public SanPham(String tenSanPham, String hangSanXuat, String model, double gia, String maSanPham, int thoiGianBaoHanh) {
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.model = model;
        this.gia = gia;
        this.maSanPham = maSanPham;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    
    

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHanSanXuat(String hanSanXuat) {
        this.hangSanXuat = hanSanXuat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    
    public abstract String inTTin();
}
