package Tugas9.Analisis;


public class Rectangle implements Colorable, Comparable<Rectangle> {
    private String warna;
    private int kategori;

    public Rectangle() {
        this.warna = null;
        this.kategori = 0;
    }

    public Rectangle(String warna) {
        this.warna = warna;
        this.kategori = 0;
    }

    @Override
    public void howToColor() {
        if (this.warna == null) {
            System.out.println("tidak ada warna, warna bangun kotak masih polos");
        } else {
            System.out.println("bangun kotak sudah diwarnai dengan warna " + this.warna);
        }
    }

    @Override
    public int compareTo(Rectangle other) {
        return Integer.compare(this.kategori, other.kategori);
    }

    public void setKategori(int kategori) {
        this.kategori = kategori;
    }

    public static void main(String[] args) {
        Rectangle kotak1 = new Rectangle("merah");
        Rectangle kotak2 = new Rectangle();
        Rectangle kotak3 = new Rectangle();
        
        kotak1.howToColor();
        kotak2.howToColor();
        
        kotak3.setKategori(4);
        int perbandingan = kotak1.compareTo(kotak3);
        if (perbandingan < 0) {
            System.out.println("kotak1 memiliki kategori yang lebih kecil dari kotak3");
        } else if (perbandingan > 0) {
            System.out.println("kotak1 memiliki kategori yang lebih besar dari kotak3");
        } else {
            System.out.println("kotak1 dan kotak3 memiliki kategori yang sama");
        }
    }
}
