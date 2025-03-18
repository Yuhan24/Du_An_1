/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author MSII
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class HoaDonChiTiet {
    private Integer id;

    private String maSP;

    private String maHd;

    private String maCtsp;

    private String tenSP;

    private Integer soLuong;

    private Double donGia;

    private Double thanhTien;

    private Integer kichThuoc;

    private String chatLieu;

    private String MauSac;

    private String deGiay;

    private String NSX;

    private String hang;

    private String coGiay;

    private String khoiLuong;

    private String xuatXu;

    private String ghiChu;

    private Integer hoaDonID;

    private Integer ctspID;
}
