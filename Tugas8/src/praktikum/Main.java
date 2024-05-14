package Tugas8.src.praktikum;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawaiTetap1 = new PegawaiTetap("Fitza", "123456", 5000000);
        Pegawai pegawaiTetap2 = new PegawaiTetap("Orel", "654321", 4500000);
        Pegawai pegawaiTetap3 = new PegawaiTetap("Aurel", "789012", 4800000);

        Pegawai pegawaiHarian1 = new PegawaiHarian("Firza", "234567", 15000, 45);
        Pegawai pegawaiHarian2 = new PegawaiHarian("Aurel", "345678", 13000, 38);
        Pegawai pegawaiHarian3 = new PegawaiHarian("Orel", "456789", 16000, 50);

        Pegawai sales1 = new Sales("Aurel", "567890", 1000000, 0.1);
        Pegawai sales2 = new Sales("Tono", "678901", 2000000, 0.15);
        Pegawai sales3 = new Sales("Sari", "789012", 1500000, 0.2);

        // Upcasting dan Downcasting
        Pegawai upcastedPegawaiHarian = pegawaiHarian1; // Upcasting
        PegawaiHarian downcastedPegawaiHarian = (PegawaiHarian) upcastedPegawaiHarian; // Downcasting

        Pegawai upcastedSales = sales1; // Upcasting
        Sales downcastedSales = (Sales) upcastedSales; // Downcasting

        System.out.println("== Daftar Pegawai Tetap ==");
        System.out.println(pegawaiTetap1);
        System.out.println("----------------------------");
        System.out.println(pegawaiTetap2);
        System.out.println("----------------------------");
        System.out.println(pegawaiTetap3);
        System.out.println();

        System.out.println("== Daftar Pegawai Harian ==");
        System.out.println(pegawaiHarian1);
        System.out.println("----------------------------");
        System.out.println(pegawaiHarian2);
        System.out.println("----------------------------");
        System.out.println(pegawaiHarian3);
        System.out.println();

        System.out.println("== Daftar Sales ==");
        System.out.println(sales1);
        System.out.println("----------------------------");
        System.out.println(sales2);
        System.out.println("----------------------------");
        System.out.println(sales3);
        System.out.println();

        System.out.println("== Upcasting dan Downcasting ==");
        System.out.println("Upcasted Pegawai Harian: " + upcastedPegawaiHarian.getNama());
        System.out.println("Downcasted Pegawai Harian: " + downcastedPegawaiHarian.getNama() + " - Gaji: " + downcastedPegawaiHarian.hitungGaji());

        System.out.println("Upcasted Sales: " + upcastedSales.getNama());
        System.out.println("Downcasted Sales: " + downcastedSales.getNama() + " - Gaji: " + downcastedSales.hitungGaji());
    }
}
