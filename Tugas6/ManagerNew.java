package Tugas6;
import java.time.LocalDate;

public class ManagerNew extends Pekerja {
    private String departemen;

    // Constructor
    public ManagerNew(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    // Getter and Setter
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

// method untuk menghitung total pendapatan termasuk tunjangan
    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * getGaji()); // tambahkan 10% dari gaji sebagai tunjangan
    }

    public String toString() {
        return super.toString() + ", Departemen: " + departemen;
    }
}
