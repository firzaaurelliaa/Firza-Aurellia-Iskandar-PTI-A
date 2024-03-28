public class Hero {
    private String nama;
    private static String asalUniv;
    private final String tanggalLahir;

    public Hero(){
        tanggalLahir = "gak ada";
    }

    public String getTanggal() {
        return tanggalLahir;
    }

    public Hero(String nama, String tgl) {
        this.nama = nama;
        asalUniv = "UB";
        tanggalLahir = tgl;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static String getAsalUniv() {
        return asalUniv;
    }

    // gak bisa, karena final
    // public void setTanggal(String tgl){
    //     this.tanggalLahir = tgl;
    // }

    public static void setAsalUniv(String asalUniv) {
        Hero.asalUniv = asalUniv;
    }

  
}
