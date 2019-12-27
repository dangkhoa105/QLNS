/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.BaoHiemDAL;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author DangKhoa
 */
public class BaoHiemBUS {
    public static void getCBboxMaNV(JComboBox maNV) {
        BaoHiemDAL.getCBboxMaNV(maNV);
    }
    
    public static void getCBboxMaNVTb(JComboBox maNV) {
        BaoHiemDAL.getCBboxMaNVTb(maNV);
    }
    
    public static void getCBboxMaLuong(JComboBox maLuong) {
        BaoHiemDAL.getCBboxMaLuong(maLuong);
    }
    
    public static void Moi(JComboBox maNhanVien, JComboBox maLuong, JTextField maSoBaoHiem, JDateChooser ngayCapSo, JTextField noiCapSo, JTextField ghiChu) {
        BaoHiemDAL.Moi(maNhanVien, maLuong, maSoBaoHiem, ngayCapSo, noiCapSo, ghiChu);
    }
    
    public static void Them(String maNhanVien, String maLuong, String maSoBaoHiem, String ngayCapSo, String noiCapSo, String ghiChu) {
        BaoHiemDAL.Them(maNhanVien, maLuong, maSoBaoHiem, ngayCapSo, noiCapSo, ghiChu);
    }
    
    public static void Xoa(String maSoBaoHiem) {
        BaoHiemDAL.Xoa(maSoBaoHiem);
    }
    
    public static void Sua(String maNhanVien, String maLuong, String ngayCapSo, String noiCapSo, String ghiChu, String maSoBaoHiem) {
        BaoHiemDAL.Sua(maNhanVien, maLuong, ngayCapSo, noiCapSo, ghiChu, maSoBaoHiem);
    }
}
