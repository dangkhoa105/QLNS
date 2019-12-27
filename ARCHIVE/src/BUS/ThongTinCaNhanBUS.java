/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.ThongTinCaNhanDAL;
import javax.swing.JComboBox;

/**
 *
 * @author DangKhoa
 */
public class ThongTinCaNhanBUS {
    public static void getCBbox(JComboBox maNV) {
        ThongTinCaNhanDAL.getCBbox(maNV);
    }
    
    public static void getCBboxTb(JComboBox maNV) {
        ThongTinCaNhanDAL.getCBboxTb(maNV);
    }
    
    public static void Them(String maNhanVien, String noiSinh, String nguyenQuan, String diaChiThuongTru, String diaChiTamTru, String soDienThoai, String danToc, String tonGiao, String quocTich, 
            String tiengNgonNgu, String trinhDoNgonNgu, String hocVan, String hocHam, String ngayVaoDoan, String tenDoanThe, String chucVuDoan, String ghiChu) {
        ThongTinCaNhanDAL.Them(maNhanVien, noiSinh, nguyenQuan, diaChiThuongTru, diaChiTamTru, soDienThoai, danToc, tonGiao, quocTich, tiengNgonNgu, trinhDoNgonNgu, hocVan, hocHam, ngayVaoDoan, tenDoanThe, chucVuDoan, ghiChu);
    }
    
    public static void Xoa(String maNhanVien) {
        ThongTinCaNhanDAL.Xoa(maNhanVien);
    }
    
    public static void Sua(String noiSinh, String nguyenQuan, String diaChiThuongTru, String diaChiTamTru, String soDienThoai, String danToc, String tonGiao, String quocTich, 
            String tiengNgonNgu, String trinhDoNgonNgu, String hocVan, String hocHam, String ngayVaoDoan, String tenDoanThe, String chucVuDoan, String ghiChu, String maNhanVien) {
        ThongTinCaNhanDAL.Sua(noiSinh, nguyenQuan, diaChiThuongTru, diaChiTamTru, soDienThoai, danToc, tonGiao, quocTich, tiengNgonNgu, trinhDoNgonNgu, hocVan, hocHam, ngayVaoDoan, tenDoanThe, chucVuDoan, ghiChu, maNhanVien);
    }
}
