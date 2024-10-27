package EmployeeManagementSystem;

import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeArrayList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for( Employee i : employeeArrayList){
            if(i.getId()==id){
                employeeToRemove=i;
                break;
            }
        }

        if (employeeToRemove != null){
            employeeArrayList.remove(employeeToRemove);
        }
    }

    public void displayEmployee(){
        for (Employee i : employeeArrayList){
            System.out.println("The all Employee is :" + i);
        }
    }
}
