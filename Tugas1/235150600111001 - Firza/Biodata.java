import java.util.Scanner;

public class Biodata {
    public static void isiBiodata() {
        MiniSiamm.clearScreen();
        MiniSiamm.Header2("BIODATA");

        // Tabel Biodata
        System.out.println("+---------------------+----------------+--------------------+--------------------+---------------+");
        System.out.printf("| %-19s | %-14s | %-18s | %-18s | %-13s |\n", "Nama", "NIM", "Fakultas", "Prodi", "Tanggal Lahir");
        System.out.println("+---------------------+----------------+--------------------+--------------------+---------------+");

        // Isi Tabel Biodata
        biodata("Firza Aurellia", "2351506011001", "Ilmu Komputer", "PTI", "01-01-2000");

        System.out.println("+---------------------+----------------+--------------------+--------------------+---------------+");
    }

    private static void biodata(String nama, String nim, String fakultas, String prodi, String tanggalLahir) {
        Scanner input = new Scanner(System.in);
        System.out.printf("| %-19s | %-14s | %-18s | %-18s | %-13s |\n", nama, nim, fakultas, prodi, tanggalLahir);

        System.out.print("\nKetik '1' untuk kembali... ");
        String kembali = input.next();

        if (kembali.equals("1")) {
            MiniSiamm.clearScreen();
            MiniSiamm.dashboard();
        }
         input.close();
    }
}
