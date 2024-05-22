package Tugas9.Praktikum;

class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public void printInvoices() {
        System.out.println("Invoices for Employee: " + name);
        for (Invoice invoice : invoices) {
            System.out.println(invoice.toString());
        }
    }

    public String toString() {
        return "Registration Number: " + registrationNumber + ", Name: " + name + ", Salary Per Month: $" + salaryPerMonth;
    }
}

