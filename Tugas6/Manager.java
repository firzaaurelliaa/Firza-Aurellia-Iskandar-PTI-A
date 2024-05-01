package Tugas6;

import java.util.GregorianCalendar;

public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day, double bonus) {
    super(name, salary, year, month, day); // manggil kontruktor super class employe
    this.bonus = bonus; // inisialisasi bonus Manager
    }


    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}

