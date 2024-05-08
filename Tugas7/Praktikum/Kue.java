package Tugas7.Praktikum;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga(); // tambahkan metode ini

    @Override
    public String toString() {
        return "Nama: " + nama + ", Harga: " + harga;
    }
}
