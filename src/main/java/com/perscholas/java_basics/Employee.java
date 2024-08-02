package com.perscholas.java_basics;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String position;
    private String department;
    private double hourly_rate;

    public Employee(int id, String name, double salary, String position, String department, double hourly_rate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.hourly_rate = hourly_rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", hourly_rate=" + hourly_rate +
                '}';
    }
}
