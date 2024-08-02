package com.perscholas.java_basics;

import java.util.List;
import java.util.stream.Collectors;


public class FinancialOperations {

    public static double getHourlyRateSum(List<Employee> employees){
        double sum = 0;
        for(Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }

    /*Streams
    List<String> list = Arrays.asList("a", "b", "c", "d");

    Creating a stream from a collection
    Stream<String> stream = list.stream();

    // Creating a stream from an array
    String[] array = {"a", "b", "c", "d"};
    Stream<String> streamFromArray = Arrays.stream(array);

    // Creating a stream using Stream.of() method
    Stream<String> streamOf = Stream.of("a", "b", "c", "d");
    */
    public static double getHourlyRateSumUsingStreams (List<Employee> employees){
        return employees.stream().mapToDouble(Employee::getSalary).sum();

        }
    }
    //filter
    public static sumDepartmentSalary(List<Employee> employees, String department) {
        return employees.stream()
                .filter(employee -> employee
                        .getDepartment()
                        .equals(department))
                .mapToDouble(Employee::getSalary).sum();
    }
    public static double getAverageSalaryByDepartment(List<Employee> employees, String department){
        return employees.stream()
                .filter(employee -> employee.getDepartment()
                        .equals(department))
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
}
