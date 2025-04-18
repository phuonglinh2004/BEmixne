package com.example.wedbansach_bakend1.dto;

import lombok.Data;

@Data
public class ChiTietGioHangDTO {
    private long maChiTietGioHang;
    private int soLuong;
    private int maSach;
    private String tenSach;
    private double giaBan;
    private String hinhAnh; // Đường dẫn hoặc base64 ảnh đầu tiên
}

