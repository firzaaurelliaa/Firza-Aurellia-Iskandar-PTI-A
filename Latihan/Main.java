package Latihan;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("PAK Afi", "100000");

        MataKuliah matkul = new MataKuliah("CIE800", "ASD", 3);

        Mahasiswa mhs = new Mahasiswa("Boci", "22");

        // dosen.mengajar("Brawijaya");

        // dosen.mengajar(mhs);

        // dosen.mengajar(matkul);

        dosen.mengajar(" pada mata kuliah dengan kode " + matkul.kodeMataKuliah + " dengan nama mata kuliah " + matkul.namaMataKuliah + " yang memiliki bobot " + matkul.sks + " sks");
    }
}
