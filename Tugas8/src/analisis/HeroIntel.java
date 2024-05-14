package Tugas8.src.analisis;

public class HeroIntel extends Hero {
    String type;
    public HeroIntel(String name, double health){
        super(name, health);
        this.type = "Intel";
    }

    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }   
}
