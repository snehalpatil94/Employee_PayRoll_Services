package com.bridgelabz.employeepayrollservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program to Create an Employee Payroll Service to Read and Write Employee
 * Payroll to a Console
 *
 * @author : Snehal Patil
 */
public class EmployeePayrollService {
    public enum IoService {
        CONSOLE_IO, FILE_IO, REST_IO
    }

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {
        employeePayrollList = new ArrayList<EmployeePayrollData>();
    }

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        System.out.println("----------- Welcome to Employee Payroll Service---------");
        System.out.println();

        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner scanner = new Scanner(System.in);
        employeePayrollService.readEmpPayrollData(scanner);
        employeePayrollService.writeEmpPayrollData();
    }

    private void readEmpPayrollData(Scanner scanner) {
        System.out.println("Enter Employee Id : ");
        String empID = scanner.next();
        System.out.println("Enter Employee Name : ");
        String empName = scanner.next();
        System.out.println("Enter Employee Salary : ");
        double empSalary = scanner.nextDouble();

        employeePayrollList.add(new EmployeePayrollData(empID, empName, empSalary));
    }

    private void writeEmpPayrollData() {
        System.out.println("\nWriting Employee Payroll on Console : \n " + employeePayrollList);
    }
}
