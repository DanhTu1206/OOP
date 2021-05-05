/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ThanhPhan;

/**
 *
 * @author SUN_LIFE
 */
public class Ram extends ThanhPhan{
    private int dungLuong;
    private int dungLuongMax;

    public Ram() {
    }

    public Ram(int dungLuong, int dungLuongMax, String hangSX, double tocDoXuLy, String loai) {
        super(hangSX, tocDoXuLy, loai);
        this.dungLuong = dungLuong;
        this.dungLuongMax = dungLuongMax;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public int getDungLuongMax() {
        return dungLuongMax;
    }

    public void setDungLuongMax(int dungLuongMax) {
        this.dungLuongMax = dungLuongMax;
    }

    @Override
    public String inTTin() {
        return "Hang SX Ram: " + getHangSX() + 
                ", Toc Do Xu Ly: " + getTocDoXuLy() + 
                ", Loai: " + getLoai() + 
                ", Dung Luong: " + getDungLuong() + 
                ", Dung Luong Max: " + getDungLuongMax();
    }

   
    
}
