package Tugas7.AnalisisPercobaan;

import java.time.LocalDate;

public class GajiTerbaru extends Employee {
    private int jumlahBarangProduksi;
    private double upahPerBarang;

    public GajiTerbaru(String name, String noKTP, LocalDate ulangTahun11, int jumlahBarangProduksi, double upahPerBarang) {
        super(name, noKTP, null); 
        this.jumlahBarangProduksi = jumlahBarangProduksi;
        this.upahPerBarang = upahPerBarang;
    }

    public int getJumlahBarangProduksi() {
        return jumlahBarangProduksi;
    }

    public void setJumlahBarangProduksi(int jumlahBarangProduksi) {
        this.jumlahBarangProduksi = jumlahBarangProduksi;
    }

    public double getUpahPerBarang() {
        return upahPerBarang;
    }

    public void setUpahPerBarang(double upahPerBarang) {
        this.upahPerBarang = upahPerBarang;
    }

    @Override
    public double earnings() {
        return jumlahBarangProduksi * upahPerBarang;
    }

    @Override
    public String toString() {
        return String.format("Gaji Terbaru :%s\nJumlah Barang Produksi: %d\nUpah Per Barang: $%.2f", super.toString(), jumlahBarangProduksi, upahPerBarang);
    }
}

