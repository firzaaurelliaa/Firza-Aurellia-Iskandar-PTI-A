package Tugas7;

import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;//gaji pokok tiap minggu
    public BasePlusCommissionEmployee(String name, String noKTP, LocalDate ulangTahun, double sales, double rate, double salary) {
        super(name, noKTP, ulangTahun, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    public String toString() {
        return String.format("Base-Salaried " + super.toString() + "\nbase salary " + getBaseSalary());
    }
}

