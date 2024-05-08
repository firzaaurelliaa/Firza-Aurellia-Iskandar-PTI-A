package Tugas7.AnalisisPercobaan;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, String noKTP, LocalDate ulangTahun, double monthlySalary) {
        super(name, noKTP, ulangTahun);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double earnings() {
        return getMonthlySalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried employee:\n%s\nMonthly Salary: $%,.2f", super.toString(), getMonthlySalary());
    }
}
