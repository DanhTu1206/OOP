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
public abstract class ThanhPhan {
    private String hangSX;
    private double tocDoXuLy;
    private String loai;

    public ThanhPhan() {
    }

    public ThanhPhan(String hangSX, double tocDoXuLy, String loai) {
        this.hangSX = hangSX;
        this.tocDoXuLy = tocDoXuLy;
        this.loai = loai;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public double getTocDoXuLy() {
        return tocDoXuLy;
    }

    public void setTocDoXuLy(double tocDoXuLy) {
        this.tocDoXuLy = tocDoXuLy;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    public abstract String inTTin();
}
