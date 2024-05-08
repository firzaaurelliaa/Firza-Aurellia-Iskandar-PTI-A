import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<String> attendanceList = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    private static String usernameLogin;
    ArrayList<String[]> users = new ArrayList<>();

    public static void main(String[] args) {
        Landing();
    }

    public static void Landing() {
        Scanner input = new Scanner(System.in);
        Header("WELCOME TO UTP A CINEMA ^_^");
        dashboard();
        


        // System.out.println("Halo, " + nama + "!");

        
        // Navigasi kembali ke halaman utama
        // System.out.print("\nKetik '1' untuk kembali... ");
        // String kembali = input.next();

        // if (kembali.equals("1")) {
        //     clearScreen();
        //     dashboard();
        // }
    }

    public static void dashboard() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        System.out.println();
        System.out.print("Pick your choice : ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            clearScreen();
            System.out.println("Login to our system");
            System.out.println("Email : ");
            String username = input.nextLine();
            System.out.println("Password: ");
            String password = input.nextLine();

        } else if (pilihan == 2) {
            System.out.println("2");
        } else if (pilihan == 3) {
            System.out.println("3");
            // Presensi.presensi();
        } 
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

    // LOGIN
    // private static String login(String username, String password, Scanner input) {
    //     Header("LOGIN");
    //     System.out.print("Masukkan username: ");
    //     String username = input.nextLine();
    //     System.out.print("Masukkan password: ");
    //     String password = input.nextLine();
    // }
}