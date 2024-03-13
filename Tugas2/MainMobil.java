import java.util.Scanner;
public class MainMobil {
    public static void main(String[] args) {
    //instan objek bernama m1
    Mobil m1 = new Mobil();
    // m1.setKecepatan(50);
    // m1.setManufaktur("Toyota");
    // m1.setNoPlat("AB 1231 UA");
    // m1.setWarna("Merah");
    // m1.displayMessage();
    // System.out.println("================");
    // //instan objek baru bernama m2
    // Mobil m2 = new Mobil();
    // m2.setKecepatan(100);
    // m2.setManufaktur("Mitsubishi");
    // m2.setNoPlat("N 1134 AG");
    // m2.setWarna("Pink");
    // m2.displayMessage();
    // System.out.println("================");
    //merubah warna dari objek m1
    // System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
    // m1.setWarna("Hijau");
    //menampilkan hasil perubahan
    // m1.displayMessage();

    Scanner input = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("(masukkan menu yang ingin dimasukkan, disarankan dimulai dari menu (1))");
        System.out.println("==========");
        System.out.println("1. Manufaktur");
        System.out.println("2. Kecepatan");
        System.out.println("3. Warna");
        System.out.println("4. No Plat");
        System.out.println("5. Keluar");
        System.out.print("PILIH MENU :");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.print("Masukkan manufaktur pilihan kamu: ");
                String manufaktur = input.next();
                m1.setManufaktur(manufaktur);
                //m1.displayMessage();
            case 2:
                System.out.print("Masukkan waktu pilihan kamu: ");
                double inputWaktu = input.nextDouble();
                // m1.setManufaktur(setWaktu);
                m1.setWaktu(inputWaktu);
            case 3:
                System.out.print("Masukkan kecepatan: ");
                int kecepatan = input.nextInt();
                m1.setKecepatan(kecepatan);
                //m1.displayMessage();
            case 4:
                System.out.print("Masukkan warna: ");
                String warna = input.next();
                m1.setWarna(warna);
                //m1.displayMessage();
            case 5:
                System.out.print("Masukkan no plat: ");
                String noPlat = input.next();
                m1.setNoPlat(noPlat);
                //m1.displayMessage();
            case 6:
                System.out.println("Terima kasih, program akan berakhir");
                System.out.println("=================================");
                break; 
            default:
                System.out.println("Menu tidak ditemukan");
                break;
        }
        input.close();
        m1.displayMessage();
    //merubah warna dari objek m1
    //System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
    //m1.setWarna("Hijau");
    //menampilkan hasil perubahan
    }
}