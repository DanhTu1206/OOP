// Hàm Đối Tượng Điện Thoại (viết trực tiếp, ko thừa kế lớp sản phẩm nữa)
package Model.SanPham;

import java.io.Serializable;

public class DienThoai implements Serializable{
	
	private String tenSanPham, hangSanXuat, model, maSanPham;
    private int soLuong, thoiGianBaoHanh;
    protected double gia;
    private double kichThuocManHinh;
    private double thoiLuongPin;
    private double doPhanGiaiCamera;

    public DienThoai() {
    }

    public DienThoai(String tenSanPham, String hangSanXuat, String model,String maSanPham,int soLuong, double gia,
    		int thoiGianBaoHanh,double kichThuocManHinh, double thoiLuongPin, double doPhanGiaiCamera) {
    	this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.model = model;
        this.gia = gia;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.kichThuocManHinh = kichThuocManHinh;
        this.thoiLuongPin = thoiLuongPin;
        this.doPhanGiaiCamera = doPhanGiaiCamera;
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
    
    public int getSoLuong() {
    	return soLuong;
    }
    
    public void setSoLuong(int soLuong) {
    	this.soLuong = soLuong;
    }
    
    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
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
}
