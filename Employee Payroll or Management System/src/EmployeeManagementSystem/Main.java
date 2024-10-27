package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {

        PayrollSystem payrollSystem =new PayrollSystem();

        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("Anik das",101,25000.65);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("Fazly Rabbi",102,30000.21);
        FullTimeEmployee fullTimeEmployee3 = new FullTimeEmployee("Dip Azad",103,35000.21);

        PartTimeEmployee partTimeEmployee1 =new PartTimeEmployee("Karim",201,400.25,7);
        PartTimeEmployee partTimeEmployee2= new PartTimeEmployee("Rahim",202,500.33,8);

        payrollSystem.addEmployee(fullTimeEmployee1);
        payrollSystem.addEmployee(fullTimeEmployee2);
        payrollSystem.addEmployee(fullTimeEmployee3);
        payrollSystem.addEmployee(partTimeEmployee1);
        payrollSystem.addEmployee(partTimeEmployee2);

        System.out.println("All Employees Details in this company: ");
        payrollSystem.displayEmployee();
        System.out.println();

        System.out.println("Removing Employees: ");
        payrollSystem.removeEmployee(201);
        payrollSystem.removeEmployee(102);
        payrollSystem.displayEmployee();
        System.out.println();

        System.out.println("Salary of the Employee:");
        System.out.println("The Salary of fullTimeEmployee1 is: "+fullTimeEmployee1.calculateSalary());
        System.out.println("The Salary of fullTimeEmployee2 is: "+fullTimeEmployee2.calculateSalary());

        System.out.println("The Salary of partTimeEmployee1 is: "+ partTimeEmployee1.calculateSalary());
        System.out.println("The Salary of partTimeEmployee2 is: "+ partTimeEmployee2.calculateSalary());




    }
}
