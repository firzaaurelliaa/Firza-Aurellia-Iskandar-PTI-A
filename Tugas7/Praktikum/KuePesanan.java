package Tugas7.Praktikum;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * berat; // Menghitung harga berdasarkan harga dan berat
    }

    @Override
    public String toString() {
        return "Kue Pesanan: " + super.toString() + ", Berat: " + berat;
    }
}
