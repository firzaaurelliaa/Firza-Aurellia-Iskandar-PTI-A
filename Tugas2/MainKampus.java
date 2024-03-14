import java.util.ArrayList;

public class MainKampus {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Membuat beberapa penulis
        Penulis penulis1 = new Penulis("Penulis A");
        Penulis penulis2 = new Penulis("Penulis B");
        Penulis penulis3 = new Penulis("Penulis C");

        // Menambahkan buku-buku ke perpustakaan
        tambahBuku(perpustakaan, penulis1, penulis2, penulis3);

        // Menampilkan koleksi perpustakaan
        System.out.println("Koleksi Perpustakaan:");
        perpustakaan.tampilkanKoleksi();
    }

    public static void tambahBuku(Perpustakaan perpustakaan, Penulis penulis1, Penulis penulis2, Penulis penulis3) {
        String[] kategoris = {"Teknologi", "Filsafat", "Sejarah", "Agama", "Psikologi", "Politik", "Fiksi"};
        int counter = 1;
        for (String kategori : kategoris) {
            for (int i = 1; i <= 5; i++) {
                Buku buku = new Buku("Buku " + counter++, kategori);
                buku.tambahPenulis(penulis1);
                buku.tambahPenulis(penulis2);
                buku.tambahPenulis(penulis3);
                perpustakaan.tambahBuku(buku);
            }
        }
    }
}



class Penulis {
    private String nama;

    public Penulis(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Buku {
    private String judul;
    private ArrayList<Penulis> penulisList;
    private String kategori;

    public Buku(String judul, String kategori) {
        this.judul = judul;
        this.kategori = kategori;
        this.penulisList = new ArrayList<>();
    }

    public void tambahPenulis(Penulis penulis) {
        penulisList.add(penulis);
    }

    public String getJudul() {
        return judul;
    }

    public ArrayList<Penulis> getPenulisList() {
        return penulisList;
    }

    public String getKategori() {
        return kategori;
    }
}

class Perpustakaan {
    private ArrayList<Buku> koleksiBuku;

    public Perpustakaan() {
        koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tampilkanKoleksi() {
        for (Buku buku : koleksiBuku) {
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Kategori: " + buku.getKategori());
            System.out.println("Penulis:");

            for (Penulis penulis : buku.getPenulisList()) {
                System.out.println("- " + penulis.getNama());
            }
            System.out.println();
        }
    }
}

