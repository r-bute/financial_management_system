package com.perscholas.java_basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWriter {
    public static void writeEmployeesToCsv(List<Employee> employees, String File) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(File)))
        {for (Employee employee : employees) {
            String line = String.format("%d,%s,%.2f,%s,%s,%.2f",
                    employee.getId(),
                    employee.getName(),
                    employee.getSalary(),
                    employee.getPosition(),
                    employee.getDepartment(),
                    employee.getHourly_rate());

                    bw.write(line);
                    bw.newLine();
        }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
