package Tugas4.Praktikum;

import java.util.Scanner;

public class MainFreelancer {
    public static void main(String[] args) {
        //no 7
        Freelancer freelancer1 = new Freelancer("Orelie", 19, "S1", 10000);

        // manggil method mendesign dengan ID pesanan, jumlah revisi, dan deadline
        freelancer1.mendesign(123, 2, "2024-04-30");
    

        // Scanner scanner = new Scanner(System.in);

        // String nama;
        // int umur = 0;
        // String pendidikanTerakhir;
        // double gaji = 0;

        // // NAMA
        // do {
        //     System.out.print("Masukkan nama freelancer: ");
        //     nama = scanner.nextLine();
        // } while (nama.isEmpty());

        // // UMUR
        // do {
        //     System.out.print("Masukkan umur freelancer: ");
        //     String inputUmur = scanner.nextLine();
        //     try {
        //         umur = Integer.parseInt(inputUmur);
        //         break;
        //     } catch (NumberFormatException e) {
        //         System.out.println("Masukkan umur dengan angka.");
        //     }
        // } while (true);

        // // PENDIDIKAN TERAKHIR
        // System.out.print("Masukkan pendidikan terakhir freelancer: ");
        // pendidikanTerakhir = scanner.nextLine();

        // // GAJI
        // do {
        //     System.out.print("Masukkan gaji freelancer: ");
        //     String inputGaji = scanner.nextLine();
        //     try {
        //         gaji = Double.parseDouble(inputGaji);
        //         break;
        //     } catch (NumberFormatException e) {
        //         System.out.println("Masukkan gaji dengan angka.");
        //     }
        // } while (true);

        // Freelancer freelancer = new Freelancer(nama, umur, pendidikanTerakhir, gaji);

        // clearScreen();

        // System.out.println("Data freelancer:");
        // System.out.println("Nama: " + freelancer.getNama());
        // System.out.println("Umur: " + freelancer.getUmur());
        // System.out.println("Pendidikan Terakhir: " + freelancer.getPendidikanTerakhir());
        // System.out.println("Gaji: " + freelancer.getGaji());

        // System.out.println("\nKita suruh freelancer ngapain nih? : ");
        // System.out.println("1. Mendesign");
        // System.out.println("2. Revisian");
        // System.out.println("3. Begadang");
        // System.out.print("Masukkan pilihan Anda (1/2/3): ");
        // int pilihan;
        // do {
        //     String inputPilihan = scanner.nextLine();
        //     try {
        //         pilihan = Integer.parseInt(inputPilihan);
        //         if (pilihan >= 1 && pilihan <= 3) {
        //             break;
        //         } else {
        //             System.out.println("Masukkan pilihan yang valid (1/2/3).");
        //         }
        //     } catch (NumberFormatException e) {
        //         System.out.println("Masukkan pilihan dengan angka (1/2/3).");
        //     }
        // } while (true);

        // clearScreen();

        // switch (pilihan) {
        //     case 1:
        //         freelancer.mendesign(123);
        //         break;
        //     case 2:
        //         freelancer.revisian();
        //         break;
        //     case 3:
        //         freelancer.begadang();
        //         break;
        //     default:
        //         System.out.println("Pilihan tidak valid.");
        // }

        // scanner.close();
    }

    // Metode untuk membersihkan layar konsol
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
