package com.perscholas.java_basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<Employee> readEmployeeFromCsv(String File) {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(File))){
            String line;
            // Read the header line
            if ((line = br.readLine()) != null) {

            }
            // Process the remaining lines
            while ((line =br.readLine())!=null)
                {
                    String[] data = line.split(",");
                    Employee employee = new Employee(
                            Integer.parseInt(data[0]),
                            data[1],
                            Double.parseDouble(data[2]),
                            data[3],
                            data[4],
                            Double.parseDouble(data[5])

                    );
                    employees.add(employee);
                }

        }
        catch(IOException e){
            e.printStackTrace();
        }
        return employees;
    }
}

