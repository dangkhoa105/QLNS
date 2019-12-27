/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.BangCongKhoiSanXuatDAL;
import javax.swing.JComboBox;

/**
 *
 * @author DangKhoa
 */
public class BangCongKhoiSanXuatBUS {
    public static void getCBboxMaNV(JComboBox maNhanVien) {
        BangCongKhoiSanXuatDAL.getCBboxMaNV(maNhanVien);
    }
    
    public static void getCBboxMaNVTb(JComboBox maNhanVien) {
        BangCongKhoiSanXuatDAL.getCBboxMaNVTb(maNhanVien);
    }
    
    public static void getCBboxMaPhong(JComboBox maPhong) {
        BangCongKhoiSanXuatDAL.getCBboxMaPhong(maPhong);
    }
    
    public static void Them(String maNhanVien, String luongCoBan, String phuCap, String thang, String nam, String soNgayCong, String soNgayNghi, String soGioLam, String ghiChu, String maPhong) {
        BangCongKhoiSanXuatDAL.Them(maNhanVien, luongCoBan, phuCap, thang, nam, soNgayCong, soNgayNghi, soGioLam, ghiChu, maPhong);
    }
    
    public static void Xoa(String maNhanVien) {
        BangCongKhoiSanXuatDAL.Xoa(maNhanVien);
    }
    
    public static void Sua(String luongCoBan, String phuCap, String thang, String nam, String soNgayCong, String soNgayNghi, String soGioLam, String ghiChu, String maPhong, String maNhanVien) {
        BangCongKhoiSanXuatDAL.Sua(luongCoBan, phuCap, thang, nam, soNgayCong, soNgayNghi, soGioLam, ghiChu, maPhong, maNhanVien);
    }
}
