import java.util.Scanner;

public class Akademik {
    public static void main(String[] args) {
        akademik();
    }

    public static void akademik() {
        MiniSiamm.clearScreen();
        MiniSiamm.Header("AKADEMIK");
        System.out.println("1. Kartu Rencana Studi");
        System.out.println("2. Kartu Hasil Studi");

        int pilihan = getInput();

        // Memproses pilihan user
        if (pilihan == 1) {
            isiKrs();
        } else if (pilihan == 2) {
            isiKhs();
        } else {
            MiniSiamm.clearScreen();
            System.out.println("Pilihan tidak valid. Masukkan inputan dengan benar.");
            MiniSiamm.dashboard();
        }
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        boolean inputValid = false;

        while (!inputValid) {
            System.out.println("");
            System.out.print("Pilihan: ");
            if (input.hasNextInt()) {
                pilihan = input.nextInt();
                if (pilihan >= 1 && pilihan <= 2) {
                    inputValid = true;
                } else {
                    System.out.println("Masukkan inputan dengan benar.");
                }
            } else {
                System.out.println("Masukkan inputan dengan benar.");
                input.next();
            }
            input.close();
        }

        return pilihan;
        
    }

    public static void isiKrs() {
        MiniSiamm.clearScreen();
        MiniSiamm.Header2("KARTU RENCANA STUDI");

        // Tabel KRS
        System.out.println("+-----+----------------+----------------------+-------+-------+");
        System.out.printf("| %-3s | %-14s | %-20s | %-5s | %-5s |\n", "No", "Kode", "Matkul", "SKS", "Kelas");
        System.out.println("+-----+----------------+----------------------+-------+-------+");

        // Isi Tabel KRS
        krs("1.", "MPK60007", "Pemrograman Dasar", "3", "A");
    }

    private static void isiKhs() {
        MiniSiamm.clearScreen();
        MiniSiamm.Header2("KARTU HASIL STUDI");

        // Tabel KHS
        System.out.println("+-----+----------------+----------------------+-------+");
        System.out.printf("| %-3s | %-14s | %-20s | %-5s |\n", "No", "Kode", "Matkul", "Nilai");
        System.out.println("+-----+----------------+----------------------+-------+");

        // Isi Tabel KHS
        khs("1.", "MPK60007", "Pemrograman Dasar", "A");
    }

    private static void krs(String no, String kode, String matkul, String sks, String kelas) {
        Scanner input = new Scanner(System.in);
        System.out.printf("| %-3s | %-14s | %-20s | %-5s | %-5s |\n", no, kode, matkul, sks, kelas);
        System.out.print("\nKetik '1' untuk kembali... ");
        String kembali = input.next();

        if (kembali.equals("1")) {
            MiniSiamm.clearScreen();
            akademik();
        }

        input.close();
    }

    private static void khs(String no, String kode, String matkul, String nilai) {
        Scanner input = new Scanner(System.in);
        System.out.printf("| %-3s | %-14s | %-20s | %-5s |\n", no, kode, matkul, nilai);
        System.out.print("\nKetik '1' untuk kembali... ");
        String kembali = input.next();

        if (kembali.equals("1")) {
            MiniSiamm.clearScreen();
            akademik();
        }

        input.close();
    }
}
