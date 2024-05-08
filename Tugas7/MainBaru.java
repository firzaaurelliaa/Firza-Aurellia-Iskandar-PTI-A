package Tugas7;

import java.time.LocalDate;

public class MainBaru {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Orel", "135", LocalDate.now(), 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Aurel", "135", LocalDate.now(), 800.00, 9);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Firza", "135", LocalDate.now(), 800.00, 9);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Daniel", "135", LocalDate.now(), 800.00, 9, 9000.000);
        
        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
        
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
        System.out.println(currentEmployee);
        if (currentEmployee instanceof BasePlusCommissionEmployee) {
            BasePlusCommissionEmployee employee = 
            (BasePlusCommissionEmployee) currentEmployee;
            employee.setBaseSalary(1.10 * 
            employee.getBaseSalary());
            System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
        }   
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, 
            employees[j].getClass().getName());
        }
    }
}
