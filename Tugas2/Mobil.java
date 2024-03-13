import java.util.Scanner;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan; // Menggunakan double untuk kecepatan dalam m/s
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    private double rubahKecepatan(double kecepatanKmh) {
        // Mengonversi kecepatan dari km/h menjadi m/s
        return kecepatanKmh * 1000 / 3600;
    }

    public void setKecepatan(double kecepatanKmh) {
        kecepatan = rubahKecepatan(kecepatanKmh);
    }

    public void setWaktu(double jam) {
        waktu = jam * 3600; // Mengonversi waktu dari jam ke detik
    }

    public double hitungJarak() {
        return kecepatan * waktu / 1000; // Menghitung jarak dalam kilometer
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s dalam waktu " + waktu + " detik.");
        System.out.println("Jarak yang dapat ditempuh adalah " + hitungJarak() + " km.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mobil mobil = new Mobil();

        System.out.println("Masukkan kecepatan mobil (km/jam):");
        double kecepatan = scanner.nextDouble();
        mobil.setKecepatan(kecepatan);

        System.out.println("Masukkan merk mobil:");
        String merk = scanner.next();
        mobil.setManufaktur(merk);

        System.out.println("Masukkan nomor plat mobil:");
        String noPlat = scanner.next();
        mobil.setNoPlat(noPlat);

        System.out.println("Masukkan warna mobil:");
        String warna = scanner.next();
        mobil.setWarna(warna);

        System.out.println("Masukkan waktu perjalanan mobil (jam):");
        double waktu = scanner.nextDouble();
        mobil.setWaktu(waktu);

        System.out.println("================");
        System.out.println("Informasi mobil:");
        mobil.displayMessage();

        scanner.close();
    }
}
