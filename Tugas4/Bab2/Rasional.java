package Tugas4.Bab2;

public class Rasional{
    private int pembilang, penyebut;
    public Rasional(){
        pembilang=0;
        penyebut=0;
    }
    
    public Rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
    }

   public boolean kurangDari(Rasional lain) {
        return (pembilang * lain.penyebut) < (penyebut * lain.pembilang);
    }

    //no 2 tambah operator
    // Operator <=
    public boolean kurangSamaDengan(Rasional lain) {
        return (pembilang * lain.penyebut) <= (penyebut * lain.pembilang);
    }

    // Operator >=
    public boolean lebihSamaDengan(Rasional lain) {
        return (pembilang * lain.penyebut) >= (penyebut * lain.pembilang);
    }

    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
        return (penyebut!= 0);
    }

    //menyederhanakan bilangan rasional
    public void Sederhana(){

    int temp, A, B;

    if (penyebut ==0){
        return;
    }

    A = (pembilang<penyebut) ? penyebut:pembilang;
    B = (pembilang<penyebut) ? pembilang:penyebut;

    // while (B != 0){
    //     temp= A % B;
    //     A = B;
    //     B = temp;
    //     }
    //     pembilang /=A;
    //     penyebut /=A;
    // }

    //no 3 ubah while jd for
    for (; B != 0; ) {
        temp = A % B;
        A = B;
        B = temp;
    }
    pembilang /= A;
    penyebut /= A;
    }


    //no 4 penambahan operator
    // Operator -
    public Rasional kurang(Rasional other) {
        int newPembilang = (pembilang * other.penyebut) - (penyebut * other.pembilang);
        int newPenyebut = penyebut * other.penyebut;
        return new Rasional(newPembilang, newPenyebut);
    }

    // Operator *
    public Rasional kali(Rasional other) {
        int newPembilang = pembilang * other.pembilang;
        int newPenyebut = penyebut * other.penyebut;
        return new Rasional(newPembilang, newPenyebut);
    }

    // Operator /
    public Rasional bagi(Rasional other) {
        int newPembilang = pembilang * other.penyebut;
        int newPenyebut = penyebut * other.pembilang;
        return new Rasional(newPembilang, newPenyebut);
    }

    public double Cast(){
        return (penyebut==0.0) ? 0.0 : (double)pembilang /
        (double)penyebut;
    }

    //oprator >
    public boolean moreThan (Rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }


    //operator Unary- ---> A = -A
    public void negasi(){
        pembilang = - pembilang;
    }

    //operator unary += \
    public void unaryPlus(Rasional A){
        pembilang = pembilang * A.penyebut + penyebut *
        A.pembilang;
        penyebut *=A.penyebut;
    }

    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }
}