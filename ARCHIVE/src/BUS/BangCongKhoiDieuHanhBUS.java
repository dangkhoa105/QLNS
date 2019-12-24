/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.BangCongKhoiDieuHanhDAL;
import DTO.BangCongKhoiDieuHanh;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author DangKhoa
 */
public class BangCongKhoiDieuHanhBUS {
    public static void getCBboxMaNV(JComboBox maNhanVien) {
        BangCongKhoiDieuHanhDAL.getCBboxMaNV(maNhanVien);
    }
}
