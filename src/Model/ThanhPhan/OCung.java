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
public class OCung extends ThanhPhan{
    private String dungLuong;

    public OCung() {
    }

    public OCung(String dungLuong, String hangSX, double tocDoXuLy, String loai) {
        super(hangSX, tocDoXuLy, loai);
        this.dungLuong = dungLuong;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }
    
    public String inTTin(){
        return "Hang SX O Cung: " + getHangSX() + 
                ", Toc Do Xu Ly: " + getTocDoXuLy() + 
                ", Loai: " + getLoai() + 
                ", Dung Luong: " + getDungLuong();
                
    }
}
