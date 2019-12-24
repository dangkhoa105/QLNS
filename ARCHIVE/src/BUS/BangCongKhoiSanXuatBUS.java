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
    
    public static void getCBboxMaPhong(JComboBox maPhong) {
        BangCongKhoiSanXuatDAL.getCBboxMaPhong(maPhong);
    }
}
