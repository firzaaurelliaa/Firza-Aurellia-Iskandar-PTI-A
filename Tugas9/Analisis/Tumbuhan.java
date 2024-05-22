package Tugas9.Analisis;

public class Tumbuhan implements MakhlukHidup {
    private String jenis;
    
    public Tumbuhan(String jenis) {
        this.jenis = jenis;
    }
    
    @Override
    public void makan() {
        System.out.println("Tumbuhan sedang melakukan fotosintesis...");
    }
    
    @Override
    public void berjalan() {
        System.out.println("Tumbuhan tidak berjalan, mereka berakar di tempat...");
    }
    
    @Override
    public void bersuara() {
        System.out.println("Tumbuhan tidak bersuara...");
    }
    
    public void fotosintesis() {
        System.out.println("Tumbuhan " + jenis + " sedang melakukan fotosintesis...");
    }
}
