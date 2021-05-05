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
public abstract class Nguoi {
    private String hoTen;
    private String soDienThoai;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String soDienThoai) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
    }
    
    
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
    public abstract String inTTin();
}
