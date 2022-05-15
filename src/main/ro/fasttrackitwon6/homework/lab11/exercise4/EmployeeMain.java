package main.ro.fasttrackitwon6.homework.lab11.exercise4;


import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Pop Ionel", 35, "brown", "ABC", 3500);
        Employee employee2 = new Employee("Maria Anca", 55, "blonde", "EFG", 3500);
        Employee employee3 = new Employee("Maries Daniel", 28, "dark", "HIJ", 3500);
        Employee employee4 = new Employee("Dragos Ana", 44, "brown", "EFG", 3500);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        Conference conference =new Conference(employees);
        System.out.println(conference.findBiggerSalaries(5500));
        System.out.println(conference.findAllCompanyEmployees(employees));
        System.out.println(conference.monthlySalary(employees));
        System.out.println(conference.mostGenerousCompany(employees));
        conference.sortEmployeesBySalaryOrName(employees);


    }


}
