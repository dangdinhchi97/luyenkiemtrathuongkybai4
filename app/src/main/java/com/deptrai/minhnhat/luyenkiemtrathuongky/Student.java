package com.deptrai.minhnhat.luyenkiemtrathuongky;

import java.io.Serializable;

public class Student implements Serializable {
    private String ma;
    private String ten;
    private int hinhanh;
    private String diachi;
    private String email;

    private int namsinh;


    public Student() {
    }

    public Student(String ma, String ten, int hinhanh, String diachi, String email, int namsinh) {
        this.ma = ma;
        this.ten = ten;
        this.hinhanh = hinhanh;
        this.diachi = diachi;
        this.email = email;
        this.namsinh = namsinh;
    }

    public String getMa() {
        return ma;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    @Override
    public String toString() {
        return ten;
    }
}
