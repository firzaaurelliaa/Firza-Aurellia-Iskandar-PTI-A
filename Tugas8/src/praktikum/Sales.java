package Tugas8.src.praktikum;

public class Sales extends Pegawai {
    private double totalPenjualan;
    private double komisi;

    public Sales(String nama, String noKTP, double totalPenjualan, double komisi) {
        super(nama, noKTP);
        this.totalPenjualan = totalPenjualan;
        this.komisi = komisi;
    }

    @Override
    public double hitungGaji() {
        return totalPenjualan * komisi;
    }

    @Override
    public String toString() {
        return "Sales\nNama: " + nama + "\nNo KTP: " + noKTP + "\nTotal Penjualan: " + totalPenjualan + "\nKomisi: " + komisi + "\nGaji: " + hitungGaji();
    }
}
