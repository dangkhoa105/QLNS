/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Ngoc
 */
public class VanDeTangLuong {
    private String maNhanVien, hoTen, gioiTinh, chucVu, chucDanh, luongCoBanCu,
            luongCoBanMoi, phuCapCVCu, phuCapCVMoi, ngayTang, lyDo;

    public VanDeTangLuong(String maNhanVien, String hoTen, String gioiTinh, String chucVu, String chucDanh, String luongCoBanCu, String luongCoBanMoi, String phuCapCVCu, String phuCapCVMoi, String ngayTang, String lyDo) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.chucDanh = chucDanh;
        this.luongCoBanCu = luongCoBanCu;
        this.luongCoBanMoi = luongCoBanMoi;
        this.phuCapCVCu = phuCapCVCu;
        this.phuCapCVMoi = phuCapCVMoi;
        this.ngayTang = ngayTang;
        this.lyDo = lyDo;
    }
