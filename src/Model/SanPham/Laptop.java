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
public class Laptop extends SanPham{
    private double khoiLuong;
    private boolean cardManHinh;

    public Laptop() {
    }

    public Laptop(double khoiLuong, boolean cardManHinh, String tenSanPham, String hangSanXuat, String model, double gia, String maSanPham, int thoiGianBaoHanh) {
        super(tenSanPham, hangSanXuat, model, gia, maSanPham, thoiGianBaoHanh);
        this.khoiLuong = khoiLuong;
        this.cardManHinh = cardManHinh;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public boolean isCardManHinh() {
        return cardManHinh;
    }

    public void setCardManHinh(boolean cardManHinh) {
        this.cardManHinh = cardManHinh;
    }
    
    public String inTTin() {
        return "Ten Laptop: " + getTenSanPham() +
                ", Hang San Xuat: " + getHangSanXuat()+
                ", Model: " + getModel()+
                ", Gia: " + getGia() + 
                ", Ma San Pham: " + getMaSanPham() +
                ", Thoi Gian Bao Hanh: " + getThoiGianBaoHanh() + 
                ", Khoi Luong: " + getKhoiLuong() + 
                ", Card Man Hinh: " + isCardManHinh();
    }
}
