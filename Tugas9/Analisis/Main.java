package Tugas9.Analisis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manusia saya = new Manusia("Aurel Mantap", 19);
        Tumbuhan pohon = new Tumbuhan("Pohon"); // Objek Tumbuhan dengan parameter jenis
        
        pohon.fotosintesis();

        saya.inputData();

        saya.makan();
        saya.berjalan();
        saya.bersuara();
        saya.tampilkanNama();
        saya.tampilkanUmur();
    }
}
