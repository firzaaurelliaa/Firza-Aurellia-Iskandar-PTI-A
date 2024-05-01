package Tugas6;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    // Constructor
    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    // Getter and Setter
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // bonus berdasarkan taun kerja
    public double getBonus() {
        LocalDate sekarang = LocalDate.now();
        int tahunKerja = sekarang.getYear() - tahunMasuk.getYear();

        if (tahunKerja >= 0 && tahunKerja <= 5) {
            return 0.05 * gaji;
        } else if (tahunKerja > 5 && tahunKerja <= 10) {
            return 0.10 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    //  menghitung pendapatan total termasuk bonus dan tunjangan untuk anak
    public double getPendapatan() {
        return gaji + getBonus() + (20 * jumlahAnak);
    }


    public String toString() {
        return super.toString() + ", Tahun Masuk: " + tahunMasuk + ", Jumlah Anak: " + jumlahAnak + ", Gaji: $" + gaji;
    }
}
