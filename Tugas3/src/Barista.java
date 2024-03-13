package Tugas3.src;

public class Barista {
    private String nama;
    private String levelJabatan;
    private int umur;
    private String pendidikanTerakhir;

    public Barista(String nama, String levelJabatan, int umur, String pendidikanTerakhir) {
        this.nama = nama;
        this.levelJabatan = levelJabatan;
        this.umur = umur;
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public void buatKopi(String jenis) {
        System.out.println("Barista " + nama + " membuat kopi jenis " + jenis);
    }

    public void beresinDapur() {
        System.out.println("Barista " + nama + " membersihkan dapur.");
    }

    public void hitungUang() {
        System.out.println("Barista " + nama + " sedang menghitung uang.");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLevelJabatan() {
        return levelJabatan;
    }

    public void setLevelJabatan(String levelJabatan) {
        this.levelJabatan = levelJabatan;
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
}
