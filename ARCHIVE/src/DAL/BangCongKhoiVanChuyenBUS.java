/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DTO.BangCongKhoiDieuHanh;
import DTO.BangCongThuViec;
import DTO.BangCongKhoiSanXuat;
import DTO.BangCongKhoiVanChuyen;
import DTO.BangCongKhoiVanPhong;

/**
 *
 * @author DangKhoa
 */
public class BangCongKhoiVanChuyenBUS {
    private static Connection conn;
    
    public static ArrayList<BangCongKhoiVanChuyen> vcList() {
        ArrayList<BangCongKhoiVanChuyen> vcList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM TblCongKhoiVanChuyen");
            ResultSet rs = ps.executeQuery();
            BangCongKhoiVanChuyen vc;
            while (rs.next()) {
                vc = new BangCongKhoiVanChuyen(
                    rs.getString("MaNV"),
                    rs.getString("LCB"),
                    rs.getString("PhuCapCVu"),
                    rs.getString("PhuCapKhac"),
                    rs.getString("Thang"),
                    rs.getString("Nam"),
                    rs.getString("SoNgayCongThang"),
                    rs.getString("SoNgayNghi"),
                    rs.getString("SoGioLamThem"),
                    rs.getString("GhiChu")
                );
                vcList.add(vc);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return vcList;
    }
    
    public static ArrayList<BangCongKhoiVanChuyen> vctcList() {
        ArrayList<BangCongKhoiVanChuyen> vcList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
            PreparedStatement ps = conn.prepareStatement("SELECT TblCongKhoiVanChuyen.MaNV, HoTen, NgaySinh, LCB, PhuCapCVu, PhuCapKhac, Thang, "
            + "Nam, SoNgayCongThang, SoNgayNghi, SoGioLamThem FROM TblCongKhoiVanChuyen, TblTTNVCoBan WHERE TblCongKhoiVanChuyen.MaNV = TblTTNVCoBan.MaNV ");
            ResultSet rs = ps.executeQuery();
            BangCongKhoiVanChuyen vc;
            while (rs.next()) {
                vc = new BangCongKhoiVanChuyen(
                    rs.getString("MaNV"),
                    rs.getString("HoTen"),
                    rs.getString("NgaySinh"),
                    rs.getString("LCB"),
                    rs.getString("PhuCapCVu"),
                    rs.getString("PhuCapKhac"),
                    rs.getString("Thang"),
                    rs.getString("Nam"),
                    rs.getString("SoNgayCongThang"),
                    rs.getString("SoNgayNghi"),
                    rs.getString("SoGioLamThem")
                );
                vcList.add(vc);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return vcList;
    }
    

}
