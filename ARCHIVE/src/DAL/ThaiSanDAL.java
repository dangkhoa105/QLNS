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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DTO.BaoHiem;
import DTO.ThaiSan;
import javax.swing.JComboBox;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author DangKhoa
 */
public class ThaiSanDAL {
    private static Connection conn;
    
    public static ArrayList<ThaiSan> tsList() {
        ArrayList<ThaiSan> tsList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM TblThaiSan");
            ResultSet rs = ps.executeQuery();
            ThaiSan ts;
            while (rs.next()) {
                ts = new ThaiSan(
                    rs.getString("MaBoPhan"),
                    rs.getString("MaPhong"),
                    rs.getString("MaNV"),
                    rs.getString("HoTen"),
                    rs.getString("NgaySinh"),
                    rs.getString("NgayVeSom"),
                    rs.getString("NgayNghiSinh"),
                    rs.getString("NgayLamTroLai"),
                    rs.getString("TroCapCTY"),
                    rs.getString("GhiChu")
                );
                tsList.add(ts);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return tsList;
    }
    
    public static void getCBboxMaNV(JComboBox maNV) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
            PreparedStatement ps = conn.prepareStatement("SELECT MaNV FROM TblTTNVCoBan ORDER BY MaNV");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                maNV.addItem(rs.getString("MaNV"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void getCBboxBP(JComboBox maBoPhan) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
            PreparedStatement ns = conn.prepareStatement("SELECT MaBoPhan FROM TblBoPhan ORDER BY MaBoPhan");
            ResultSet rs = ns.executeQuery();
            while (rs.next()) {
                maBoPhan.addItem(rs.getString("MaBoPhan"));
            }
            //cbxID.setModel(modelCombo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void getCBboxPB(JComboBox maPhong) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
            PreparedStatement ns = conn.prepareStatement("SELECT MaPhong FROM TblPhongBan ORDER BY MaPhong");
            ResultSet rs = ns.executeQuery();
            while (rs.next()) {
                maPhong.addItem(rs.getString("MaPhong"));
            }
            //cbxID.setModel(modelCombo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void Them(String maBoPhan, String maPhong, String maNhanVien, String hoTen, String ngaySinh, String ngayVeSom, String ngayNghiSinh, String ngayLamTroLai, String troCapCongTy, String ghiChu) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
            String sql = "INSERT INTO TblThaiSan(MaBoPhan, MaPhong, MaNV, HoTen, "
            + "NgaySinh, NgayVeSom, NgayNghiSinh, NgayLamTroLai, TroCapCTY, GhiChu) "
            + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maBoPhan);
            ps.setString(2, maPhong);
            ps.setString(3, maNhanVien);
            ps.setString(4, hoTen);
            ps.setString(5, ngaySinh);
            ps.setString(6, ngayVeSom);
            ps.setString(7, ngayNghiSinh);
            ps.setString(8, ngayLamTroLai);
            ps.setString(9, troCapCongTy);
            ps.setString(10, ghiChu);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void Xoa(String maNhanVien) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
            String sql = "DELETE FROM TblThaiSan WHERE MaNV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maNhanVien);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Xoá thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void Sua(String maBoPhan, String maPhong, String hoTen, String ngaySinh, String ngayVeSom, String ngayNghiSinh, String ngayLamTroLai, String troCapCongTy, String ghiChu, String maNhanVien) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
            String sql = "UPDATE TblThaiSan SET MaBoPhan=?, MaPhong=?, HoTen=?, " 
            + "NgaySinh=?, NgayVeSom=?, NgayNghiSinh=?, NgayLamTroLai=?, TroCapCTY=?, GhiChu=? WHERE MaNV=?";
            PreparedStatement ps = conn.prepareStatement(sql);           
            ps.setString(1, maBoPhan);
            ps.setString(2, maPhong);
            ps.setString(3, hoTen);
            ps.setString(4, ngaySinh);
            ps.setString(5, ngayVeSom);
            ps.setString(6, ngayNghiSinh);
            ps.setString(7, ngayLamTroLai);
            ps.setString(8, troCapCongTy);
            ps.setString(9, ghiChu);
            ps.setString(10, maNhanVien);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Chỉnh sửa thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
