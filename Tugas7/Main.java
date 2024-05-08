package Tugas7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan data karyawan
        LocalDate ulangTahun1 = LocalDate.of(2024, 5, 10);
        LocalDate ulangTahun2 = LocalDate.of(1985, 8, 20);
        LocalDate ulangTahun3 = LocalDate.of(1995, 3, 10);
        LocalDate ulangTahun4 = LocalDate.of(1980, 11, 25);

        SalariedEmployee salariedEmployee = new SalariedEmployee("Orel", "135", ulangTahun1, 200000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Aurel", "135", ulangTahun2, 80000, 9);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Firza", "135", ulangTahun3, 800.00, 9);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Daniel", "135", ulangTahun4, 800.00, 9, 9000.000);

        // Menghitung gaji karyawan dan menambahkan gaji sebesar 100.000 jika bulan ini adalah bulan ulang tahunnya
        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee};

        int bulanIni = LocalDate.now().getMonthValue();

        for (Employee employee : employees) {
            double earnings = employee.earnings();

            // meriksa apakah ultahnya bulan ini apa bkn
            if (employee.getUlangTahun().getMonthValue() == bulanIni 
                ) {
                earnings += 100000;
            }

            System.out.printf("%s\n%s: $%,.2f\n\n", employee.toStringTgl(), "Pendapatan : ", earnings);
        }
    }
}
