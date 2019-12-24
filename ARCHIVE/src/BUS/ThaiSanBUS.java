/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.ThaiSanDAL;
import javax.swing.JComboBox;

/**
 *
 * @author DangKhoa
 */
public class ThaiSanBUS {
    public static void getCBboxMaNV(JComboBox maNV) {
        ThaiSanDAL.getCBboxMaNV(maNV);
    }
    
    public static void getCBboxBP(JComboBox maBoPhan) {
        ThaiSanDAL.getCBboxBP(maBoPhan);
    }
    
    public static void getCBboxPB(JComboBox maPhong) {
        ThaiSanDAL.getCBboxPB(maPhong);
    }
    
    public static void Them(String maBoPhan, String maPhong, String maNhanVien, String hoTen, String ngaySinh, String ngayVeSom, String ngayNghiSinh, String ngayLamTroLai, String troCapCongTy, String ghiChu) {
        ThaiSanDAL.Them(maBoPhan, maPhong, maNhanVien, hoTen, ngaySinh, ngayVeSom, ngayNghiSinh, ngayLamTroLai, troCapCongTy, ghiChu);
    }
    
    public static void Xoa(String maNhanVien) {
        ThaiSanDAL.Xoa(maNhanVien);
    }
    
    public static void Sua(String maBoPhan, String maPhong, String hoTen, String ngaySinh, String ngayVeSom, String ngayNghiSinh, String ngayLamTroLai, String troCapCongTy, String ghiChu, String maNhanVien) {
        ThaiSanDAL.Sua(maBoPhan, maPhong, hoTen, ngaySinh, ngayVeSom, ngayNghiSinh, ngayLamTroLai, troCapCongTy, ghiChu, maNhanVien);
    }
}
