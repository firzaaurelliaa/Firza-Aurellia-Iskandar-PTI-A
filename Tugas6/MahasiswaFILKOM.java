package Tugas6;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, String nim, boolean menikah, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodiCode = Integer.parseInt(nim.substring(6, 7));
        String prodi = getProdi(prodiCode);
        return prodi + ", 20" + angkatan;
    }

    private String getProdi(int code) {
        switch (code) {
            case 2:
                return "Teknik Informatika";
            case 3:
                return "Teknik Komputer";
            case 4:
                return "Sistem Informasi";
            case 6:
                return "Pendidikan Teknologi Informasi";
            case 7:
                return "Teknologi Informasi";
            default:
                return "Unknown";
        }
    }

    public String toString() {
        return super.toString() + "\nnim : " + nim + "\nipk : " + ipk + "\nstatus : " + getStatus();
    }
}
