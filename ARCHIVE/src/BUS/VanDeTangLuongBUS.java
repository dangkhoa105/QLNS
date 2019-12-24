/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.VanDeTangLuongDAL;
import javax.swing.JComboBox;

/**
 *
 * @author DangKhoa
 */
public class VanDeTangLuongBUS {
    public static void getCBboxMaNV(JComboBox maNV) {
        VanDeTangLuongDAL.getCBboxMaNV(maNV);
    }
    
    public static void Them(String maNhanVien, String hoTen, String gioiTinh, String chucVu, String chucDanh, String luongCoBanCu, String luongCoBanMoi, String phuCapCVCu, String phuCapCVMoi, String ngayTang, String lyDo) {
        VanDeTangLuongDAL.Them(maNhanVien, hoTen, gioiTinh, chucVu, chucDanh, luongCoBanCu, luongCoBanMoi, phuCapCVCu, phuCapCVMoi, ngayTang, lyDo);
    }
    
    public static void Xoa(String maNhanVien) {
        VanDeTangLuongDAL.Xoa(maNhanVien);
    }
    
    public static void Sua(String hoTen, String gioiTinh, String chucVu, String chucDanh, String luongCoBanCu, String luongCoBanMoi, String phuCapCVCu, String phuCapCVMoi, String ngayTang, String lyDo, String maNhanVien) {
        VanDeTangLuongDAL.Sua(hoTen, gioiTinh, chucVu, chucDanh, luongCoBanCu, luongCoBanMoi, phuCapCVCu, phuCapCVMoi, ngayTang, lyDo, maNhanVien);
    }
}
