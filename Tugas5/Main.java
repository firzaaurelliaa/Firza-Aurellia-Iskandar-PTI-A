package Tugas5;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final double SALDO_MINIMAL = 10000;
    private static double saldo = 100000; // Inisialisasi saldo awal
    private static int loginAttempts = 0; //Jumlah percobaan login
    private static final int MAX_LOGIN_ATTEMPTS = 3; //Max jumlah percobaan


    // Buat nyimpen username pas login (Selamat datang, ..!)
    private static String usernameLogin;
    private static boolean isLoggedIn = false; // buat nandain apakah user udh login atau belum

    public static void main(String[] args) {
        // Buat nyimpem data user (nama, username, password, PIN, Nomor Pelanggan)
        ArrayList<String[]> users = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) { // Tetap jalankan program secara terus menerus
            if (!isLoggedIn) { // Jika pengguna belum login, tampilkan menu login
                Header("MENU");
                System.out.println("1. Daftar");
                System.out.println("2. Login");
                System.out.println("");
                System.out.print("Pilih menu: ");
                int pilihMenu = scanner.nextInt();
                scanner.nextLine();
                clearScreen();

                switch (pilihMenu) {
                    case 1:
                        register(users, scanner);
                        break;
                    case 2:
                        usernameLogin = login(users, scanner);
                        if (usernameLogin != null) {
                            isLoggedIn = true; 
                            clearScreen();
                            Home.show(usernameLogin, nomorPelanggan(), saldo, users);
                        } else {
                            clearScreen();
                            System.out.println("Login gagal. Silakan coba lagi.");
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } else { // Kalo udh login :
                System.out.println("Apa yang ingin Anda lakukan?");
                System.out.println("1. Pembelian");
                System.out.println("2. Top Up");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                clearScreen();
                switch (choice) {
                    case 1:
                        System.out.println("PEMBELIAN");
                        System.out.print("Masukkan nomor pelanggan: ");
                        String customerNumber = scanner.nextLine();
                        System.out.print("Masukkan PIN: ");
                        String pin = scanner.nextLine();
                        if (customerNumber.equals(nomorPelanggan()) && validatePIN(users, pin, customerNumber)) {
                            System.out.print("Masukkan jumlah pembelian: ");
                            double purchaseAmount = scanner.nextDouble();
                            scanner.nextLine();
                            transaksi(purchaseAmount);
                        } else {
                            System.out.println("Transaksi gagal. Nomor pelanggan atau PIN salah.");
                        }
                        break;
                    case 2:
                        System.out.println("TOP UP");
                        System.out.print("Masukkan nomor pelanggan: ");
                        String customerNumberTopUp = scanner.nextLine();
                        System.out.print("Masukkan PIN: ");
                        String pinTopUp = scanner.nextLine();
                        if (customerNumberTopUp.equals(nomorPelanggan()) && validatePIN(users, pinTopUp, customerNumberTopUp)) {
                            System.out.print("Masukkan jumlah top up: ");
                            double topUpAmount = scanner.nextDouble();
                            scanner.nextLine();
                            topUp(topUpAmount);
                        } else {
                            System.out.println("Transaksi gagal. Nomor pelanggan atau PIN salah.");
                        }
                        break;
                    case 3:
                        isLoggedIn = false;
                        clearScreen();
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        }
    }

    // LOGIN
    private static String login(ArrayList<String[]> users, Scanner scanner) {
        Header("LOGIN");
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Periksa apakah username dan password cocok
        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                loginAttempts = 0; // Reset jumlah percobaan login yang gagal
                return user[2]; // Kembalikan nama pengguna jika login berhasil
            }
        }
        loginAttempts++; // Tambahkan jumlah percobaan login yang gagal
        if (loginAttempts >= MAX_LOGIN_ATTEMPTS) {
            // Blokir akun jika jumlah percobaan login yang gagal mencapai batas
            System.out.println("Anda telah melebihi batas percobaan login. Akun Anda telah diblokir.");
            System.exit(0); // Keluar dari program setelah blokir akun
        }
        return null; // Ngreturn null kl login gagal
}


    // REGISTER
    private static void register(ArrayList<String[]> users, Scanner scanner) {
        Header("DAFTAR");
        System.out.print("Masukkan username baru: ");
        String newUsername = scanner.nextLine();
        System.out.print("Masukkan password baru: ");
        String newPassword = scanner.nextLine();
        System.out.print("Masukkan nama: ");
        String newName = scanner.nextLine();
        System.out.print("Masukkan PIN: ");
        String newPIN = scanner.nextLine();

        // tambahkan pengguna baru ke array users
        String[] newUser = {newUsername, newPassword, newName, newPIN, nomorPelanggan()};
        users.add(newUser);

        clearScreen();
        System.out.println("Akun berhasil dibuat. Silahkan login");
    }

    
    // NOMOR PELANGGAN
    private static String nomorPelanggan() {
    Random random = new Random();
    int[] DuaDigitjenis = {38, 56, 74}; // Jenis rekening: silver, gold, platinum
    int TipeAkunIndex = random.nextInt(DuaDigitjenis.length);
    int TipeAkun = DuaDigitjenis[TipeAkunIndex];
    

    String nomorPelanggan = String.valueOf(TipeAkun) + "12345678";
    return nomorPelanggan;
}



    // VALIDASI PIN
    public static boolean validatePIN(ArrayList<String[]> users, String pin, String customerNumber) {
        for (String[] user : users) {
            if (user[3].equals(pin) && user[4].equals(customerNumber)) {
                return true;
            }
        }
        return false;
    }

    // TRANSAKSI
    public static void transaksi(double amount) {
        double maksimalPembelian = saldo - SALDO_MINIMAL; // Maksimal pembelian sesuai dengan saldo yang tersisa setelah menyisakan saldo minimal
        if (maksimalPembelian <= 0) {
            System.out.println("Pembelian gagal. Saldo minimal yang harus disisakan tidak mencukupi.");
        } else if (amount > maksimalPembelian) {
            System.out.println("Pembelian gagal. Melebihi batas maksimal pembelian.");
        } else {
            double cashback = calculateCashback(amount, usernameLogin);
            saldo -= amount;
            saldo += cashback; // Tambahkan cashback ke saldo
            System.out.println("Pembelian berhasil. Sisa saldo Anda: Rp" + saldo);
            if (cashback > 0) {
                System.out.println("Cashback Anda: Rp" + cashback);
            }
        }
    }

    // TOP UP
    public static void topUp(double amount) {
        saldo += amount;
        System.out.println("Top up berhasil. Saldo Anda sekarang: Rp" + String.format(Locale.US, "%.2f", saldo));
    }

    //CASHBACK
    public static double calculateCashback(double amount, String customerNumber) {
        double cashback = 0;
        int jenisPelanggan = Integer.parseInt(customerNumber.substring(0, 2));
        
        if (amount > 1000000) { // Jika pembelian melebihi 1 juta
            switch (jenisPelanggan) {
                case 38: // Silver
                    cashback = amount * 0.05; // Cashback 5%
                    break;
                case 56: // Gold
                    cashback = amount * 0.07; // Cashback 7%
                    break;
                case 74: // Platinum
                    cashback = amount * 0.10; // Cashback 10%
                    break;
                default:
                    break;
            }
        } else { // Jika pembelian kurang dari atau sama dengan 1 juta
            switch (jenisPelanggan) {
                case 56: // Gold
                case 74: // Platinum
                    cashback = amount * 0.02; // Cashback 2%
                    break;
                default:
                    break;
            }
        }
        return cashback;
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

     public static void Header(String message) {
        System.out.println("=".repeat(20 + message.length()));
        System.out.printf(" ".repeat(10));
        System.out.printf("%s", message);
        System.out.printf(" ".repeat(10));
        System.out.printf("\n");
        System.out.println("=".repeat(20 + message.length()));
    }

}
