package Latihan;

public class Dosen {
    public String nama;
    public String NIDN;

    public Dosen(String nama, String nIDN) {
        this.nama = nama;
        NIDN = nIDN;
    }

    void mengajar(String universitas) {
        System.out.println(this.nama + " mengejar di universitas " + universitas);
    }

    void mengajar(MataKuliah mk) {
        System.out.println(this.nama + " mengejar mata kuliah " + mk.namaMataKuliah);
    }

    // void mengajar(Mahasiswa mhs) {
    //     System.out.println(this.nama + " mengajar mahasiswa dengan nama " + mhs.nama);
    // }

    void mengajar(Mahasiswa mhs) {
        System.out.println(this.nama + " mengajar " + mhs.nama);
    }
    
}
