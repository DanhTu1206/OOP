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
public class Admin extends Nguoi{
    private String taiKhoan;
    private String matKhau;

    public Admin() {
    }

    public Admin(String taiKhoan, String matKhau, String hoTen, String soDienThoai) {
        super(hoTen, soDienThoai);
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    
    
    @Override
    public String inTTin() {
        return "Ho Ten: " + getHoTen() + 
                ", So Dien Thoai: " + getSoDienThoai() + 
                ", Tai Khoan: " + getTaiKhoan();
    }
    
    
}
