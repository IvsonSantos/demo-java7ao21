package com.example.demojava7ao21.exercises.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercicio2 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 35, "Engineering", 10000),
                new Employee("Bob", 28, "HR", 80000),
                new Employee("Charlie", 32, "Engineering", 95000),
                new Employee("David", 40, "Engineering", 150000),
                new Employee("Eve", 45, "Finance", 160000)
        );

        List<Employee> filteredEmployees = filterEmployees(employees);
        filteredEmployees.forEach(emp -> System.out.println(emp.getName()));

        Optional<Employee> highestPaidEmployee = findHighestPaidEmployee(filteredEmployees);
        highestPaidEmployee.ifPresent(e -> System.out.println("Highest Paid: " + e.getName()));

        double averageSalary = calculateAverageSalary(employees);
        System.out.println("Average Salary: " + averageSalary);
    }

    public static List<Employee> filterEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getAge() > 30 && "Engineering".equals(e.getDepartment()))
                .collect(Collectors.toList());
    }

    public static Optional<Employee> findHighestPaidEmployee(List<Employee> employees) {
        return employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
    }

    public static double findHighestPaidEmployeeDouble(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0.0);
    }

    public static double calculateAverageSalary(List<Employee> employees) {
        return employees.stream()
                //.filter(e -> "Engineering".equals(e.getDepartment()))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

}
