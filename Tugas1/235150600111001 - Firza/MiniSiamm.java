import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniSiamm {
    public static List<String> attendanceList = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Landing();
    }

    public static void Landing() {
        Scanner input = new Scanner(System.in);
        Header("SELAMAT DATANG DI MINI SIAM");
        System.out.println();
        System.out.println("Siapa namamu?");
        System.out.print("Nama : ");
        String nama = input.nextLine();

        // Membersihkan layar
        clearScreen();

        System.out.println("Halo, " + nama + "!");

        // Dashboard
        dashboard();

        
        // Navigasi kembali ke halaman utama
        System.out.print("\nKetik '1' untuk kembali... ");
        String kembali = input.next();

        if (kembali.equals("1")) {
            clearScreen();
            dashboard();
        }

        input.close();
    }

    public static void dashboard() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nApa yang akan kamu lihat?");
        System.out.println("1. Biodata");
        System.out.println("2. Akademik");
        System.out.println("3. Presensi");

        // Membaca pilihan user
        System.out.println();
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        // Memproses pilihan user
        if (pilihan == 1) {
            Biodata.isiBiodata();
        } else if (pilihan == 2) {
            Akademik.akademik();
        } else if (pilihan == 3) {
            Presensi.presensi();
        } 
        input.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void Header(String message) {
        System.out.println("=".repeat(40 + message.length()));
        System.out.printf(" ".repeat(20));
        System.out.printf("%s", message);
        System.out.printf(" ".repeat(20));
        System.out.printf("\n");
        System.out.println("=".repeat(40 + message.length()));
    }

    public static void Header2(String message) {
        System.out.printf(" ".repeat(20));
        System.out.printf("%s", message);
        System.out.printf(" ".repeat(20));
        System.out.printf("\n");
    }
}
