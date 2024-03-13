package Tugas3.src;

import java.util.Scanner;

public class MainBarista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nama;
        String levelJabatan;
        int umur = 0;
        String pendidikanTerakhir;

        // NAMA
        do {
            System.out.print("Masukkan nama barista: ");
            nama = scanner.nextLine();
        } while (nama.isEmpty());


        // LEVEL JABATAN
        do {
            System.out.println("Pilih level jabatan barista:");
            System.out.println("1. Senior");
            System.out.println("2. Junior");
            System.out.print("Masukkan pilihan Anda (1/2): ");
            String inputLevelJabatan = scanner.nextLine();
            if (inputLevelJabatan.equals("1")) {
                levelJabatan = "Senior";
                break;
            } else if (inputLevelJabatan.equals("2")) {
                levelJabatan = "Junior";
                break;
            } else {
                System.out.println("Masukkan pilihan yang valid (1/2).");
            }
        } while (true);


        // UMUR
        while (true) {
            System.out.print("Masukkan umur barista: ");
            String inputUmur = scanner.nextLine();
            try {
                umur = Integer.parseInt(inputUmur);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Masukkan umur dengan angka.");
            }
        }

        //PENDIDIKAN TERAKHIR
        do {
            System.out.print("Masukkan pendidikan terakhir barista: ");
            pendidikanTerakhir = scanner.nextLine();
        } while (pendidikanTerakhir.isEmpty());

        Barista barista = new Barista(nama, levelJabatan, umur, pendidikanTerakhir);
        
        clearScreen();

        System.out.println("Kita suruh barista ngapain nih? :");
        System.out.println("1. Buat Kopi");
        System.out.println("2. Beresin Dapur");
        System.out.println("3. Hitung Uang");
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihan;
        do {
            String inputPilihan = scanner.nextLine();
            try {
                pilihan = Integer.parseInt(inputPilihan);
                if (pilihan >= 1 && pilihan <= 3) {
                    break;
                } else {
                    System.out.println("Masukkan pilihan yang valid (1/2/3).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan pilihan dengan angka (1/2/3).");
            }
        } while (true);
        
        clearScreen();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jenis kopi yang ingin dibuat: ");
                String jenisKopi = scanner.nextLine();
                barista.buatKopi(jenisKopi);
                break;
            case 2:
                barista.beresinDapur();
                break;
            case 3:
                barista.hitungUang();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        clearScreen();
        System.out.println("Data barista:");
        System.out.println("Nama: " + barista.getNama());
        System.out.println("Level Jabatan: " + barista.getLevelJabatan());
        System.out.println("Umur: " + barista.getUmur());
        System.out.println("Pendidikan Terakhir: " + barista.getPendidikanTerakhir());
        
        scanner.close();
    }

    // biar clean aja
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
