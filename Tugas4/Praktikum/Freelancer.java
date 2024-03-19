package Tugas4.Praktikum;

public class Freelancer {
    private String nama;
    private int umur;
    private String pendidikanTerakhir;
    private double gaji;


    //no 1 buat constructor
    public Freelancer() {}

    public Freelancer(String nama) {
        this.nama = nama;
    }

    public Freelancer(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public Freelancer(String nama, int umur, String pendidikanTerakhir) {
        this.nama = nama;
        this.umur = umur;
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public Freelancer(String nama, int umur, String pendidikanTerakhir, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.pendidikanTerakhir = pendidikanTerakhir;
        this.gaji = gaji;
    }

    //no 2 buat method
    // Method Overload 1: Mendesign dengan ID pesanan dan jumlah revisi
    public void mendesign(int idPesanan, int jumlahRevisi) {
        System.out.println("Designer " + nama + " sedang mendesign pesanan dengan ID: " + idPesanan + " dengan jumlah revisi: " + jumlahRevisi);
    }

    // Method Overload 2: Mendesign dengan ID pesanan, jumlah revisi, dan deadline
    public void mendesign(int idPesanan, int jumlahRevisi, String deadline) {
        System.out.println("Designer " + nama + " sedang mendesign pesanan dengan ID: " + idPesanan + " dengan jumlah revisi: " + jumlahRevisi + ", deadline: " + deadline);
    }

    // Method Overload 3: Mendesign dengan ID pesanan, jumlah revisi, deadline, dan keterangan tambahan
    public void mendesign(int idPesanan, int jumlahRevisi, String deadline, String keterangan) {
        System.out.println("Designer " + nama + " sedang mendesign pesanan dengan ID: " + idPesanan + " dengan jumlah revisi: " + jumlahRevisi + ", deadline: " + deadline + ", keterangan: " + keterangan);
    }

    //no 3 Metode instans yang mengembalikan tipe data dari kelas itu sendiri
    public Freelancer createFreelancer(String nama, int umur, String pendidikanTerakhir, double gaji) {
        return new Freelancer(nama, umur, pendidikanTerakhir, gaji);
    }

    //no 5 Buat 3 objek dari 1 class menggunakan constructor overloading
    public static void main(String[] args) {
        // Membuat objek pertama
        Freelancer freelancer1 = new Freelancer("John Doe", 30, "S1 Teknik Informatika", 1000.0);

        // Membuat objek kedua
        Freelancer freelancer2 = new Freelancer("Jane Smith", 25, "S1 Desain Grafis", 800.0);

        // Membuat objek ketiga
        Freelancer freelancer3 = new Freelancer("Michael Johnson", 35, "S2 Manajemen Bisnis", 1200.0);

        // Menampilkan informasi freelancer
        System.out.println("Informasi Freelancer 1:");
        System.out.println("Nama: " + freelancer1.getNama());
        System.out.println("Umur: " + freelancer1.getUmur());
        System.out.println("Pendidikan Terakhir: " + freelancer1.getPendidikanTerakhir());
        System.out.println("Gaji: " + freelancer1.getGaji());

        System.out.println("\nInformasi Freelancer 2:");
        System.out.println("Nama: " + freelancer2.getNama());
        System.out.println("Umur: " + freelancer2.getUmur());
        System.out.println("Pendidikan Terakhir: " + freelancer2.getPendidikanTerakhir());
        System.out.println("Gaji: " + freelancer2.getGaji());

        System.out.println("\nInformasi Freelancer 3:");
        System.out.println("Nama: " + freelancer3.getNama());
        System.out.println("Umur: " + freelancer3.getUmur());
        System.out.println("Pendidikan Terakhir: " + freelancer3.getPendidikanTerakhir());
        System.out.println("Gaji: " + freelancer3.getGaji());
    }

    public void mendesign(int idPesanan) {
        System.out.println("Designer " + nama + " sedang mendesign pesanan dengan ID: " + idPesanan);
    }

    public void revisian() {
        System.out.println("Designer " + nama + " sedang melakukan revisi.");
    }

    public void begadang() {
        System.out.println("Designer " + nama + " sedang begadang untuk menyelesaikan pekerjaan.");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    
}
