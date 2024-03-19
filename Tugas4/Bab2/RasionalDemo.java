package Tugas4.Bab2;

public class RasionalDemo {
    public static void main(String[] args) {
        // Membuat objek dari kelas Rasional
        Rasional R1 = new Rasional(1, 2);
        Rasional R2 = new Rasional(1, 3);

        // Membandingkan dua objek Rasional
        System.out.println("R1 < R2 : " + R1.kurangDari(R2));
        System.out.println("R1 <= R2 : " + R1.kurangSamaDengan(R2));
        System.out.println("R1 >= R2 : " + R1.lebihSamaDengan(R2));



        // Menampilkan status rasional
        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R2.isRasional());
        System.out.println();

        // Membandingkan dua objek Rasional
        System.out.println("R1 > R2 : " + R1.moreThan(R2));
        System.out.println();

        // Menampilkan nilai objek Rasional
        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();

        // Menyederhanakan objek Rasional
        R1.Sederhana();
        R2.Sederhana();

        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();

        // Mengkonversi objek Rasional menjadi double
        System.out.println("Setelah dilakukan Cast ke double menjadi : ");
        System.out.println("R1 : " + R1.Cast());
        System.out.println("R2 : " + R2.Cast());
        System.out.println();

        // Melakukan operasi negasi pada objek Rasional
        R1.negasi();
        System.out.print("Unary- dari R1 : ");
        R1.cetak();
        System.out.println();

        // Melakukan operasi unary plus pada objek Rasional
        R1.unaryPlus(R2);
        System.out.print("Nilai dari 'R1 += R2' : ");
        R1.cetak();
        System.out.println();
    }
}
