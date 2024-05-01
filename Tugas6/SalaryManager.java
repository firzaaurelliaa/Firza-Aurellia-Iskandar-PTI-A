package Tugas6;

public class SalaryManager {
    public static void main(String[] args) {
        Employee employee = new Employee("orelll", 50000, 2022, 4, 29);
        
        // manggil method rasie ini dr luar class employee
        employee.raiseSalary(10);
    }
}

