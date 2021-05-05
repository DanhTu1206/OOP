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
    private String ram;
    private String viXuLy;
    private String oCung;
    public Laptop() {
    }

    public Laptop(double khoiLuong, String tenSanPham, String hangSanXuat, String model, double gia, String maSanPham, int thoiGianBaoHanh,String ram,String viXuLy,String oCung) {
        super(tenSanPham, hangSanXuat, model, gia, maSanPham, thoiGianBaoHanh);
        this.khoiLuong = khoiLuong;
        this.ram = ram;
        this.viXuLy = viXuLy;
        this.oCung = oCung;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getViXuLy() {
        return viXuLy;
    }

    public void setViXuLy(String viXuLy) {
        this.viXuLy = viXuLy;
    }

    public String getoCung() {
        return oCung;
    }

    public void setoCung(String oCung) {
        this.oCung = oCung;
    }

    public String inTTin() {
        return "Ten Laptop: " + getTenSanPham() +
                ", Hang San Xuat: " + getHangSanXuat()+
                ", Model: " + getModel()+
                ", Gia: " + getGia() + 
                ", Ma San Pham: " + getMaSanPham() +
                ", Thoi Gian Bao Hanh: " + getThoiGianBaoHanh() + 
                ", Khoi Luong: " + getKhoiLuong() + 
                ", Ram: " + getRam() +
                ", Vi Xu Ly: " + getViXuLy() +
                ", O Cung: " + getoCung();
    }
}
