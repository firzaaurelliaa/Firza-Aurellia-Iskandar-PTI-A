import java.util.ArrayList;

public class Perpustakaan {
    private String nama;
    private String alamat;
    private ArrayList<Kategori> koleksiKategori;

    public Perpustakaan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.koleksiKategori = new ArrayList<>();
    }

    public void tambahKategori(Kategori kategori) {
        koleksiKategori.add(kategori);
    }

    public void tampilkanKoleksi() {
        System.out.println("Koleksi Perpustakaan " + nama + " (" + alamat + "):");
        for (Kategori kategori : koleksiKategori) {
            kategori.tampilkanBuku();
        }
    }

    public static void main(String[] args) {
        // Membuat perpustakaan
        Perpustakaan perpusX = new Perpustakaan("Perpustakaan Kampus X", "Jl. Contoh No.1");

        // Membuat kategori
        Kategori teknologi = new Kategori("Teknologi");
        Kategori filsafat = new Kategori("Filsafat");
        Kategori sejarah = new Kategori("Sejarah");
        Kategori agama = new Kategori("Agama");
        Kategori psikologi = new Kategori("Psikologi");
        Kategori politik = new Kategori("Politik");
        Kategori fiksi = new Kategori("Fiksi");

        // Menambahkan kategori ke perpustakaan
        perpusX.tambahKategori(teknologi);
        perpusX.tambahKategori(filsafat);
        perpusX.tambahKategori(sejarah);
        perpusX.tambahKategori(agama);
        perpusX.tambahKategori(psikologi);
        perpusX.tambahKategori(politik);
        perpusX.tambahKategori(fiksi);

        // Menampilkan koleksi perpustakaan
        perpusX.tampilkanKoleksi();
    }
}

class Kategori {
    private String nama;
    private ArrayList<Buku> daftarBuku;

    public Kategori(String nama) {
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
        // Generate daftar buku
        for (int i = 1; i <= 5; i++) {
            daftarBuku.add(new Buku("Buku " + i, "Penulis " + i));
        }
    }

    public void tampilkanBuku() {
        System.out.println("Kategori: " + nama);
        for (Buku buku : daftarBuku) {
            System.out.println("- Judul: " + buku.getJudul() + ", Penulis: " + buku.getPenulis());
        }
    }
}

class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }
}
