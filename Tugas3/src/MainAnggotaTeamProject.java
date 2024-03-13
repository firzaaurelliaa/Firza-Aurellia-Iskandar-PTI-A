package Tugas3.src;

import java.util.Scanner;

public class MainAnggotaTeamProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama anggota: ");
        String nama = scanner.nextLine();

        System.out.println("Role:");
        System.out.println("1. UI/UX Designer");
        System.out.println("2. Front End");
        System.out.println("3. Back End");
        System.out.print("Pilih role (1/2/3): ");
        int pilihan = scanner.nextInt();
        String role = "";
        switch (pilihan) {
            case 1:
                role = "UI/UX Designer";
                break;
            case 2:
                role = "Front End";
                break;
            case 3:
                role = "Back End";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.print("Masukkan umur anggota: ");
        int umur = scanner.nextInt();

        AnggotaTeamProject anggota = new AnggotaTeamProject(nama, role, umur);

        scanner.nextLine(); 

        System.out.println("Pilihan tindakan:");
        System.out.println("1. Kumpulkan Pekerjaan");
        System.out.println("2. Hapus Pekerjaan");
        System.out.println("3. Presentasi");
        System.out.println("4. Brainstorming");
        System.out.print("Masukkan pilihan Anda (1/2/3/4): ");
        int pilihanTindakan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihanTindakan) {
            case 1:
                System.out.print("Masukkan judul tugas yang akan dikumpulkan: ");
                String tugasKumpul = scanner.nextLine();
                anggota.kumpulkanPekerjaan(tugasKumpul);
                break;
            case 2:
                System.out.print("Masukkan judul tugas yang akan dihapus: ");
                String tugasHapus = scanner.nextLine();
                anggota.hapusPekerjaan(tugasHapus);
                break;
            case 3:
                anggota.presentasi();
                break;
            case 4:
                anggota.brainstorming();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
