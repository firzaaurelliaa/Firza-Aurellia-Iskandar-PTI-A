package Tugas8.src.analisis;

public class Main {
    public static void main(String[] args) {
        // Casting
        // double angka = 5.4;
        // int angka_int = (int)angka;
        // System.out.println(angka_int);
        
        // Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();

        // Upcasting
        Hero heroUp = (Hero) hero1;
        heroUp.display();

        // System.out.println(heroUp.getType()); // ini error
        // Object dgn class Hero
        Hero heroReg = new Hero("Boy", 100);
        heroReg.display();

        // Downcasting
        // HeroAgility heroDown = (HeroAgility) heroReg; // ini error
        // heroDown.display();
        // heroUp dikembalikan ke hero1
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); // ini berhasil downcasting

        HeroIntel hero3 = (HeroIntel) heroUp;
        hero3.display();

        // No 4
        HeroAgility heroAgility = new HeroAgility("Windrunner", 100.0);
        HeroIntel heroIntel = new HeroIntel("Invoker", 100.0);

        System.out.println(heroAgility.type);
        System.out.println(heroIntel.type);

        //HeroMagic
        HeroMagic heroMagic = new HeroMagic("Oreeel", 120.0);
        heroMagic.display();

        // Upcasting 
        Hero heroUpMagic = heroMagic;
        heroUpMagic.display();

        // Downcasting
        if (heroUpMagic instanceof HeroMagic) {
            HeroMagic heroMagicAgain = (HeroMagic) heroUpMagic;
            heroMagicAgain.display();
            System.out.println("Power: " + heroMagicAgain.power);
        } else {
            System.out.println("heroUpMagic bukan pewarisan dari HeroMagic");
        }
    }
}
