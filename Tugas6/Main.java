package Tugas6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // manusia
        System.out.println("Testcase Manusia :");
        Manusia lakiLakiMenikah = new Manusia("Iskandar", true, "123456789", true);
        Manusia perempuanMenikah = new Manusia("Firza Orel", false, "987654321", true);
        Manusia belumMenikah = new Manusia("Aurel", true, "456789123", false);

        System.out.println("a. " + lakiLakiMenikah.toString() + ", Status: " + (lakiLakiMenikah.isMenikah() ? "Menikah" : "Belum Menikah"));
        System.out.println("b. " + perempuanMenikah.toString() + ", Status: " + (perempuanMenikah.isMenikah() ? "Menikah" : "Belum Menikah"));
        System.out.println("c. " + belumMenikah.toString() + ", Status: " + (belumMenikah.isMenikah() ? "Menikah" : "Belum Menikah"));

        System.out.println();

        //mahasiswa
        System.out.println("Testcase Mahasiswa :");
        MahasiswaFILKOM mahasiswaA = new MahasiswaFILKOM("Firza", false, "111", "235150600111001", false, 2.0);
        MahasiswaFILKOM mahasiswaB = new MahasiswaFILKOM("Firza", false, "111", "235150600111001", false, 3.5);
        MahasiswaFILKOM mahasiswaC = new MahasiswaFILKOM("Firza", false, "111", "235150600111001", false, 4.0);

        System.out.println("a. " + mahasiswaA.toString() + ", Status IPK: " + mahasiswaA.getStatus());
        System.out.println("b. " + mahasiswaB.toString() + ", Status IPK: " + mahasiswaB.getStatus());
        System.out.println("c. " + mahasiswaC.toString() + ", Status IPK: " + mahasiswaC.getStatus());

        System.out.println();

        //pekerja
        System.out.println("Testcase Pekerja :");
        Pekerja pekerjaA = new Pekerja("Andi", true, "123456789", true, 5000, LocalDate.of(2020, 1, 1), 2);
        Pekerja pekerjaB = new Pekerja("Budi", false, "987654321", false, 7000, LocalDate.of(2013, 1, 1), 0);
        Pekerja pekerjaC = new Pekerja("Charlie", true, "456789123", true, 10000, LocalDate.of(2004, 1, 1), 10);

        System.out.println("a. " + pekerjaA.toString());
        System.out.println("b. " + pekerjaB.toString());
        System.out.println("c. " + pekerjaC.toString());

        System.out.println();

        System.out.println("Testcase Manager :");
        int tahunMasuk = LocalDate.now().getYear() - 15;
        ManagerNew manager = new ManagerNew("Aurel", true, "111", true, 7500, LocalDate.of(tahunMasuk, 1, 1), 0, "Manager");
        System.out.println(manager);
    }
}
