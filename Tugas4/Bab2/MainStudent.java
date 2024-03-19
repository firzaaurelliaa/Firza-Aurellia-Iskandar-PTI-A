package Tugas4.Bab2;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Student.jumlahObjek();

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();

        // array buat nyimpen objek Student
        Student[] siswa = new Student[jumlahSiswa];

        // masukin info siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            System.out.print("Umur: ");
            int umur = scanner.nextInt();

            System.out.print("Nilai Matematika: ");
            double nilaiMatematika = scanner.nextDouble();

            System.out.print("Nilai Bahasa Inggris: ");
            double nilaiBahasaInggris = scanner.nextDouble();

            System.out.print("Nilai IPA: ");
            double nilaiIPA = scanner.nextDouble();

            System.out.println("");

            // Bikin objek student dan disimpen di array
            siswa[i] = new Student(nama, alamat, umur, nilaiMatematika, nilaiBahasaInggris, nilaiIPA);

            scanner.nextLine();
        }

        // tampilin deh
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInformasi Siswa ke-" + (i + 1));
            siswa[i].displayMessage();
        }

        // Student anna = new Student("Anna", "Malang", 20, 100, 80, 89);
        // anna.displayMessage();

        // Student anna = new Student();
        // anna.setName("Anna");
        // anna.setAddress("Malang");
        // anna.setAge(20);
        // anna.setMath(100);
        // anna.setScience(89);
        // anna.setEnglish(80);
        // anna.displayMessage();
        

        // Menggunakan constructor lain
        // System.out.println("===================");
        // Student chris = new Student("Chris", "Kediri", 21);
        // chris.setMath(70);
        // chris.setScience(60);
        // chris.setEnglish(90);
        // chris.displayMessage();

        // Siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        // System.out.println("===================");
        // anna.setAddress("Batu");
        // anna.setAge(18);
        // anna.displayMessage();

        // System.out.println();

        // Siswa dengan nama chris dirubah informasi alamat dan umurnya melalui method
        // System.out.println("===================");
        // chris.setAddress("Surabaya");
        // chris.setAge(22);
        // chris.displayMessage();

        scanner.close();
    }
}
