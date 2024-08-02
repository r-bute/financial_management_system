package com.perscholas.java_basics;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = CsvReader.readEmployeeFromCsv("financial_management_system.csv");
        //employees.forEach(System.out::println);

        //traditional Approach
        System.out.println(FinancialOperations.getHourlyRateSum(employees));

        }
    }

