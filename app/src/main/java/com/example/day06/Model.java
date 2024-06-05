package com.example.day06;

public class Model {
    private String nama;
    private int logo;
    private String detailTambahan1;
    private String detailTambahan2;
    private String detailTambahan3;
    public Model(String nama, int logo, String detailTambahan1, String detailTambahan2, String detailTambahan3) {
        this.nama = nama;
        this.logo = logo;
        this.detailTambahan1 = detailTambahan1;
        this.detailTambahan2 = detailTambahan2;
        this.detailTambahan3 = detailTambahan3;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getLogo() {
        return logo;
    }
    public void setLogo(int logo) {
        this.logo = logo;
    }
    public String getDetailTambahan1() {
        return detailTambahan1;
    }
    public void setDetailTambahan1(String detailTambahan1) {
        this.detailTambahan1 = detailTambahan1;
    }
    public String getDetailTambahan2() {
        return detailTambahan2;
    }
    public void setDetailTambahan2(String detailTambahan2) {
        this.detailTambahan2 = detailTambahan2;
    }
    public String getDetailTambahan3() {
        return detailTambahan3;
    }
    public void setDetailTambahan3(String detailTambahan3) {
        this.detailTambahan3 = detailTambahan3;
    }
}