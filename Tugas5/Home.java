package Tugas5;

import java.util.ArrayList;
import java.util.Scanner;

public class Home {
    public static void show(String username, String nomorPelanggan, double saldo, ArrayList<String[]> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang, " + username + "!");
        System.out.println("Saldo Anda saat ini: Rp" + saldo);
        System.out.println("Nomor Pelanggan: " + nomorPelanggan);
        
        System.out.println("=".repeat(20));
        System.out.println("PEMBELIAN");
        System.out.print("Masukkan nomor pelanggan: ");
        String inputNomorPelanggan = scanner.nextLine();
        System.out.print("Masukkan PIN: ");
        String pin = scanner.nextLine();
        if (inputNomorPelanggan.equals(nomorPelanggan) && Main.validatePIN(users, pin, inputNomorPelanggan)) {
            System.out.print("Masukkan jumlah pembelian: ");
            double purchaseAmount = scanner.nextDouble();
            scanner.nextLine();
            Main.transaksi(purchaseAmount); // Memanggil method transaksi dari kelas Main
        } else {
            System.out.println("Transaksi gagal. Nomor pelanggan atau PIN salah.");
        }
        
    }
}
