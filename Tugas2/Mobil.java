public class Mobil {
private String noPlat;
private String warna;
private String manufaktur;
private int kecepatan;
public double waktu;
public double ubahSatuanWaktu;
public double gantiKecepatan;
public double hitungJarak;
public double gantiSatuanJarak;

public void setNoPlat(String s){
noPlat = s;
}
public void setWarna(String s){
warna = s;
}
public void setManufaktur(String s){
manufaktur = s;
}
public void setKecepatan(int i){
kecepatan = i;
rubahKecepatan(kecepatan);		
}

public void setWaktu (double wkt) {
    waktu = wkt;
    rubahSekon(waktu);
    //System.out.println("Waktu anda = "+waktu);
}
private void rubahSekon (double gantiSatuanWaktu) {
    ubahSatuanWaktu = 3600 * gantiSatuanWaktu;
    System.out.println("Waktu anda setelah dikonversi ke detik adalah "+ubahSatuanWaktu+" sekon");
}
private void rubahKecepatan (double gantiSatuanKecepatan) {
    gantiKecepatan = (kecepatan*1000)/3600;
    System.out.println("Kecepatan anda setelah dikonversi ke m/s adalah "+gantiKecepatan+" m/s");
}

public double hitungJarak() {
    hitungJarak = kecepatan*waktu;
    System.out.println("Hasil hitung kecepatan sementara "+waktu);
    return hitungJarak;
}
public double gantiSatuanJarak() {
    gantiSatuanJarak = hitungJarak/1000;
    //System.out.println(hitungJarak);
    return gantiSatuanJarak;
}

public void displayMessage(){			
System.out.println("Mobil anda adalah bermerek "+manufaktur);			
System.out.println("mempunyai nomor plat "+noPlat);
System.out.println("serta memililki warna "+warna);
System.out.println("dan mampu menempuh kecepatan "+kecepatan);
System.out.println("Jarak yang dapat ditempuh adalah "+hitungJarak());
System.out.println("Jarak anda setelah dikonversi ke km adalah "+gantiSatuanJarak());
}			
}