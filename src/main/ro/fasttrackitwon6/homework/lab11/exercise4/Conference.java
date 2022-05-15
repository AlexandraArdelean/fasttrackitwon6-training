package main.ro.fasttrackitwon6.homework.lab11.exercise4;

import java.util.*;

public class Conference {
    private List<Employee> employees;

    public Conference(List<Employee> employees) {
        this.employees = new ArrayList<>(employees);
    }

    public List<Employee> findBiggerSalaries(int givenAmount) {
        List<Employee> newEmployeeList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > givenAmount) {
                newEmployeeList.add(employee);

            }
        }
        return newEmployeeList;
    }

    public Map<String, List<Employee>> findAllCompanyEmployees(List<Employee> employeeList) {
        Map<String, List<Employee>> companyEmployees = new HashMap<>();
        for (Employee employee : employeeList) {
            if (companyEmployees.containsKey(employee.getCompany())) {
                companyEmployees.get(employee.getCompany()).add(employee);
            } else {
                List<Employee> employees = new ArrayList<>();
                employees.add(employee);
                companyEmployees.put(employee.getCompany(), employees);
            }

        }
        return companyEmployees;
    }


    public String mostGenerousCompany(List<Employee> employees) {
        String generousCompany = null;
        int maxSalary = 0;
        for (Employee e : employees) {
            if (e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                generousCompany = e.getCompany();
            }

        }
        return generousCompany;
    }


    public int monthlySalary(List<Employee> employees) {
        int sum = 0;
        for (Employee e : employees) {
            sum = sum + e.getSalary();
        }
        return sum;
    }

    public void sortEmployeesBySalaryOrName(List<Employee> employeeList) {

        employeeList.sort(new SalaryComparator()
                .thenComparing(new NameComparator().reversed()));
        System.out.println(employeeList);

    }

}
