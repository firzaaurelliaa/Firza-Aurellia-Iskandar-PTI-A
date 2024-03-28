
//Firza Aurellia Iskandar
//235150600111001

/**
 * PenghitunganHarga
 */
public class PenghitunganHarga {
    public static void main(String[] args) {
        Barang tomat = new Barang("Tomat", 5000, 10);
        Barang cabai = new Barang("Cabai", 10000, 15);
        Barang daunBawang = new Barang("Daun Bawang", 1000, 25);

        Barang.Belanja(daunBawang, 2); // Beli Daun Bawang dengan jumlah 2 total harga 2000
        Barang.Belanja(cabai, 4);
        Barang.Belanja(daunBawang, 5);
        Barang.Belanja(tomat, 3);


    }
}

class Barang {
    private final String nama;
    private final double harga;
    private int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public static void Belanja(Barang barang, int jumlah) {
        System.out.println("Beli " + barang.getNama() + " dengan jumlah " + jumlah + " total harga " + (barang.getHarga() * jumlah));
    }
}