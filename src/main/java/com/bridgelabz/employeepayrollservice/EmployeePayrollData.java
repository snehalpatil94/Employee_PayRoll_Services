package com.bridgelabz.employeepayrollservice;

public class EmployeePayrollData {
    String id;
    String name;
    double salary;

    public EmployeePayrollData(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData [Id = " + id + ", Name = " + name + ", Salary = " + salary + "";
    }
}
