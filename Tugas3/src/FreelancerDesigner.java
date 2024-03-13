package Tugas3.src;


public class FreelancerDesigner {
    private String nama;
    private int umur;
    private String pendidikanTerakhir;
    private double gaji;

    public FreelancerDesigner(String nama, int umur, String pendidikanTerakhir, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.pendidikanTerakhir = pendidikanTerakhir;
        this.gaji = gaji;
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
