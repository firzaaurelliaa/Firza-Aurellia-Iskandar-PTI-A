import java.util.Scanner;

public class Presensi {
    public static void presensi() {
        Scanner input = new Scanner(System.in);
        MiniSiamm.clearScreen();
        MiniSiamm.Header("PRESENSI");
        System.out.println("1. Absen Masuk");
        System.out.println("2. Lihat Absensi");

        // Membaca pilihan user
        System.out.println();
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        // Memproses pilihan user
        if (pilihan == 1) {
            absenMasuk();
        } else if (pilihan == 2) {
            lihatAbsensi();
        } else {
            MiniSiamm.clearScreen();
            System.out.print("Pilihan tidak valid.");
            MiniSiamm.dashboard();
        }
        input.close();
    }

    public static void absenMasuk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama untuk absen masuk: ");
        String nama = scanner.nextLine();
        MiniSiamm.attendanceList.add(nama);
        MiniSiamm.clearScreen();
        System.out.println(nama + " berhasil absen masuk.");
        scanner.close();
    }

    public static void lihatAbsensi() {
    MiniSiamm.clearScreen();
    MiniSiamm.Header2("DAFTAR KEHADIRAN");
    System.out.println("Nama yang sudah absen:");

    for (String nama : MiniSiamm.attendanceList) {
        System.out.println("- " + nama);
    }

    // Navigasi kembali ke halaman utama
    System.out.print("\nKetik '1' untuk kembali... ");
    Scanner input = new Scanner(System.in);
    String kembali = input.next();

    if (kembali.equals("1")) {
        MiniSiamm.clearScreen();
        Presensi.presensi();
    }

    input.close();
}
}
