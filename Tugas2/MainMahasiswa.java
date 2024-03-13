public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setTotalLembar(50);
        mahasiswa.setKataPerHari(100);
        
        int lamaMenghabiskan = mahasiswa.hitungLamaMenghabiskan();
        System.out.println("Mahasiswa A akan menghabiskan 1 buku dalam " + lamaMenghabiskan + " hari.");
    }
}

class Mahasiswa {
    private int totalLembar;
    private int kataPerHari;

    public void setTotalLembar(int totalLembar) {
        this.totalLembar = totalLembar;
    }

    public void setKataPerHari(int kataPerHari) {
        this.kataPerHari = kataPerHari;
    }

    public int hitungLamaMenghabiskan() {
        int totalHalaman = totalLembar * 2; // Satu lembar = dua halaman
        int halamanPerHari = kataPerHari / 2; // Seratus kata = setengah halaman
        int lamaMenghabiskan = totalHalaman / halamanPerHari;
        return lamaMenghabiskan;
    }
}
