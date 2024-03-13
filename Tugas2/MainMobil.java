import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instan objek mobil m1
        Mobil m1 = new Mobil();
        System.out.println("Masukkan kecepatan mobil m1:");
        int kecepatanM1 = scanner.nextInt();
        System.out.println("Masukkan manufaktur mobil m1:");
        String manufakturM1 = scanner.next();
        System.out.println("Masukkan nomor plat mobil m1:");
        String noPlatM1 = scanner.next();
        System.out.println("Masukkan warna mobil m1:");
        String warnaM1 = scanner.next();

        m1.setKecepatan(kecepatanM1);
        m1.setManufaktur(manufakturM1);
        m1.setNoPlat(noPlatM1);
        m1.setWarna(warnaM1);

        // Tampilkan pesan
        System.out.println("================");

        // Instan objek mobil m2
        Mobil m2 = new Mobil();
        System.out.println("Masukkan kecepatan mobil m2:");
        int kecepatanM2 = scanner.nextInt();
        System.out.println("Masukkan manufaktur mobil m2:");
        String manufakturM2 = scanner.next();
        System.out.println("Masukkan nomor plat mobil m2:");
        String noPlatM2 = scanner.next();
        System.out.println("Masukkan warna mobil m2:");
        String warnaM2 = scanner.next();

        m2.setKecepatan(kecepatanM2);
        m2.setManufaktur(manufakturM2);
        m2.setNoPlat(noPlatM2);
        m2.setWarna(warnaM2);

   
        System.out.println("================");

        // Ubah warna mobil m1
        System.out.println("Masukkan warna baru untuk mobil m1:");
        String newWarnaM1 = scanner.next();
        m1.setWarna(newWarnaM1);

        // Tampilkan hasil perubahan
        m1.displayMessage();

        scanner.close();
    }
}
