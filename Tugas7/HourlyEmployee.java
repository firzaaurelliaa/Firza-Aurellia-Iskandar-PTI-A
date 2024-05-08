package Tugas7;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double wage; //upah per jam
    private double hours; //jumlah jam tiap minggu

    public HourlyEmployee(String name, String noKTP, LocalDate ulangTahun, double hourlyWage, double hoursWorked) {
        super(name, noKTP, ulangTahun);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage){
        wage = hourlyWage;
    }

    public double getWage(){
        return wage;
    }

    public void setHours(double hoursWorked){
        hours = hoursWorked;
    }

    public double getHours(){
        return hours;
    }

    public double earnings(){
        if(getHours()<=40)
        return getWage() * getHours();
        else
        return 40 * getWage() + ( getHours()-40) * 
        getWage() * 1.5;
    }

    public String toString(){
        return String.format("Hourly employee: " + super.toString() + "\nHourly wage: " + getWage() + "\nHours worked: " + getHours());
    }
}
