public class Main {
    public int totalIsiBuku;
    public int banyakKataPerHari;
    public int banyakHariPembaca;
    public void banyakHariPembaca() {
        banyakHariPembaca = totalIsiBuku * 4; // 2 dikali 2 (asumsi setiap lembar = 2 halaman)
        System.out.println("Jadi dari permasalahan tersebut, banyak hari yang dibutuhkan untuk membaca 1 buku adalah " + banyakHariPembaca + " hari");
}
}