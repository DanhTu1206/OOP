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
public class ViXuLy extends ThanhPhan{
    private String congNgheCPU;
    private String tocDoMax;

    public ViXuLy() {
    }

    public ViXuLy(String conNgheCPU, String tocDoMax, String hangSX, double tocDoXuLy, String loai) {
        super(hangSX, tocDoXuLy, loai);
        this.congNgheCPU = conNgheCPU;
        this.tocDoMax = tocDoMax;
    }

    public String getConNgheCPU() {
        return congNgheCPU;
    }

    public void setConNgheCPU(String conNgheCPU) {
        this.congNgheCPU = conNgheCPU;
    }

    public String getTocDoMax() {
        return tocDoMax;
    }

    public void setTocDoMax(String tocDoMax) {
        this.tocDoMax = tocDoMax;
    }
    
    public String inTTin() {
        return  "Hang SX Vi Xu lý: " + getHangSX() + 
                ", Toc Do Xu Ly: " + getTocDoXuLy() + 
                ", Loai: " + getLoai() + 
                ", Cong Nghe CPU: " + getConNgheCPU()+ 
                ", Toc Do Xu Ly Toi Da: " + getTocDoMax();
    }
}
