package Tugas9.Praktikum;

public class Main {
    public static void main(String[] args) {
        // invoice untuk karyawan
        Invoice[] invoices1 = {
            new Invoice("Laptop", 1, 1500),
            new Invoice("Mouse", 2, 30),
            new Invoice("Keyboard", 1, 100)
        };
        
        Invoice[] invoices2 = {
            new Invoice("Monitor", 1, 500),
            new Invoice("Printer", 1, 200)
        };

        //karyawan dengan invoice masing-masing
        Employee employee1 = new Employee(101, "Aurel Mantap", 2000, invoices1);
        Employee employee2 = new Employee(102, "Firzo", 2500, invoices2);

        // karyawan dan total gaji setelah dipotong belanjaan
        System.out.println("Employee 1 : " + employee1);
        employee1.printInvoices();
        System.out.println("Total Gaji Setelah Deduction: $" + employee1.getPayableAmount());

        System.out.println("\nEmployee 2: " + employee2);
        employee2.printInvoices();
        System.out.println("Total Gaji Setelah Deduction: $" + employee2.getPayableAmount());
    }
}

