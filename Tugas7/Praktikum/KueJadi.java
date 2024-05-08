package Tugas7.Praktikum;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2; // Perubahan di sini
    }

    @Override
    public String toString() {
        return "Kue Jadi: " + super.toString() + ", Jumlah: " + jumlah;
    }
}