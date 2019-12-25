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
public class BaoHiem {
    private String maNhanVien, maLuong, maSoBaoHiem, ngayCapSo, noiCapSo, ghiChu;

    public BaoHiem(String maNhanVien, String maLuong, String maSoBaoHiem, String ngayCapSo, String noiCapSo, String ghiChu) {
        this.maNhanVien = maNhanVien;
        this.maLuong = maLuong;
        this.maSoBaoHiem = maSoBaoHiem;
        this.ngayCapSo = ngayCapSo;
        this.noiCapSo = noiCapSo;
        this.ghiChu = ghiChu;
    }

