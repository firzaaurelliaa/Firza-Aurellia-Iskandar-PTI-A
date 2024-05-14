package Tugas8.src.praktikum;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJamKerja;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJamKerja) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJamKerja = totalJamKerja;
    }

    @Override
    public double hitungGaji() {
        if (totalJamKerja <= 40) {
            return upahPerJam * totalJamKerja;
        } else {
            double gajiNormal = upahPerJam * 40;
            double jamLembur = totalJamKerja - 40;
            double upahLembur = upahPerJam * 1.5;
            return gajiNormal + (jamLembur * upahLembur);
        }
    }

    @Override
    public String toString() {
        return "Pegawai Harian:\nNama: " + nama + "\nNo KTP: " + noKTP + "\nUpah per Jam: " + upahPerJam + "\nTotal Jam Kerja: " + totalJamKerja + "\nPendapatan: " + hitungGaji();
    }
}
