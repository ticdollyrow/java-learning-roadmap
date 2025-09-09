package com.java_learning.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Last"));
        employees.add(new Employee(2, "John", "Summer"));
        employees.add(new Employee(3, "Anna", "Frank"));

        Collections.sort(employees);
        System.out.println(employees.toString());
    }
}

class Employee implements Comparable<Employee>{
    private final int id;
    private final String name;
    private final String surname;

    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        if(this.name.equals(otherEmployee.getName())){
            return Integer.compare(this.id, otherEmployee.id);
        }
        return this.name.compareTo(otherEmployee.getName());
    }
}
