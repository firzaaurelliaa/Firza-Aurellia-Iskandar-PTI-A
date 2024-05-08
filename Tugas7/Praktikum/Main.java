package Tugas7.Praktikum;

public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                daftarKue[i] = new KuePesanan("Kue Pesanan " + i, 10.0 + i, 0.5 + i);
            } else {
                daftarKue[i] = new KueJadi("Kue Jadi " + i, 20.0 + i, 2.0 + i);
            }
        }

        System.out.println("Daftar Kue:");
        for (Kue kue : daftarKue) {
            System.out.println(kue); 
        }
        System.out.println();

        double totalHargaSemuaKue = 0;
        for (Kue kue : daftarKue) {
            totalHargaSemuaKue += kue.hitungHarga(); 
        }
        System.out.println("Total Harga Semua Kue: " + totalHargaSemuaKue);
        System.out.println();

        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan: " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratKuePesanan);
        System.out.println();

        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);
        System.out.println();


        double hargaTertinggi = 0;
        Kue kueDenganHargaTertinggi = null;
        for (Kue kue : daftarKue) {
            if (kue.hitungHarga() > hargaTertinggi) {
                hargaTertinggi = kue.hitungHarga();
                kueDenganHargaTertinggi = kue;
            }
        }
        System.out.println("Kue dengan Harga Tertinggi:");
        System.out.println(kueDenganHargaTertinggi);

        //Optional 
        double totalHargaKueBasi = 0;
        int totalLamaHariKueBasi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueBasi) {
                totalHargaKueBasi += kue.hitungHarga();
                totalLamaHariKueBasi += ((KueBasi) kue).getLamaHari();
            }
        }
        System.out.println("Total Harga Kue Basi: " + totalHargaKueBasi);
        System.out.println("Total Lama Hari Kue Basi: " + totalLamaHariKueBasi);
    }
}
