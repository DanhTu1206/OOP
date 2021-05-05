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
public class DienThoai extends SanPham{
    private double kichThuocManHinh;
    private double thoiLuongPin;
    private double doPhanGiaiCamera;
    private boolean chongNuoc;

    public DienThoai() {
    }

    public DienThoai(double kichThuocManHinh, double thoiLuongPin, double doPhanGiaiCamera, boolean chongNuoc, String tenSanPham, String hanSanXuat, String model, double gia, String maSanPham, int thoiGianBaoHanh) {
        super(tenSanPham, hanSanXuat, model, gia, maSanPham, thoiGianBaoHanh);
        this.kichThuocManHinh = kichThuocManHinh;
        this.thoiLuongPin = thoiLuongPin;
        this.doPhanGiaiCamera = doPhanGiaiCamera;
        this.chongNuoc = chongNuoc;
    }

   

    public double getKichThuocManHinh() {
        return kichThuocManHinh;
    }

    public void setKichThuocManHinh(double kichThuocManHinh) {
        this.kichThuocManHinh = kichThuocManHinh;
    }

    public double getThoiLuongPin() {
        return thoiLuongPin;
    }

    public void setThoiLuongPin(double thoiLuongPin) {
        this.thoiLuongPin = thoiLuongPin;
    }

    public double getDoPhanGiaiCamera() {
        return doPhanGiaiCamera;
    }

    public void setDoPhanGiaiCamera(double doPhanGiaiCamera) {
        this.doPhanGiaiCamera = doPhanGiaiCamera;
    }

    public String isChongNuoc() {
        if(chongNuoc) {
            return "Yes";
        }
        return "No";
    }

    public void setChongNuoc(boolean chongNuoc) {
        this.chongNuoc = chongNuoc;
    }
    
    public String inTTin() {
        return "Ten Dien Thoai: " + getTenSanPham() +
                ", Hang San Xuat: " + getHangSanXuat()+
                ", Model: " + getModel()+
                ", Gia: " + getGia() + 
                ", Ma San Pham: " + getMaSanPham() +
                ", Thoi Gian Bao Hanh: " + getThoiGianBaoHanh() + 
                ", Kich Thuoc Man Hinh: " + getKichThuocManHinh() + 
                ", Thoi Luong Pin: " + getThoiLuongPin() + 
                ", Do Phan Giai Camera: " + getDoPhanGiaiCamera() + 
                ", Chong nuoc: " + isChongNuoc();
    }
}
