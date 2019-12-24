/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.BangCongKhoiVanChuyenDAL;
import javax.swing.JComboBox;

/**
 *
 * @author DangKhoa
 */
public class BangCongKhoiVanChuyenBUS {
    public static void getCBboxMaNV(JComboBox maNhanVien) {
        BangCongKhoiVanChuyenDAL.getCBboxMaNV(maNhanVien);
    }
    
    public static void Them(String maNhanVien, String luongCoBan, String phuCap, String phuCapKhac, String thang, String nam, String soNgayCong, String soNgayNghi, String soGioLam, String ghiChu) {
        BangCongKhoiVanChuyenDAL.Them(maNhanVien, luongCoBan, phuCap, phuCapKhac, thang, nam, soNgayCong, soNgayNghi, soGioLam, ghiChu);
    }
    
    public static void Xoa(String maNhanVien) {
        BangCongKhoiVanChuyenDAL.Xoa(maNhanVien);
    }
    
    public static void Sua(String luongCoBan, String phuCap, String phuCapKhac, String thang, String nam, String soNgayCong, String soNgayNghi, String soGioLam, String ghiChu, String maNhanVien) {
        BangCongKhoiVanChuyenDAL.Sua(luongCoBan, phuCap, phuCapKhac, thang, nam, soNgayCong, soNgayNghi, soGioLam, ghiChu, maNhanVien);
    }
}
