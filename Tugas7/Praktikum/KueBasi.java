package Tugas7.Praktikum;

public class KueBasi extends Kue {
    private int lamaHari;

    public KueBasi(String nama, double harga, int lamaHari) {
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    public int getLamaHari() {
        return lamaHari;
    }

    @Override
    public double hitungHarga() {
        double hargaAwal = getHarga();
        double penambahanHarga = hargaAwal * (0.1 * lamaHari);
        return hargaAwal + penambahanHarga;
    }

    @Override
    public String toString() {
        return "Kue Basi: " + super.toString() + ", Lama Hari: " + lamaHari;
    }
}

