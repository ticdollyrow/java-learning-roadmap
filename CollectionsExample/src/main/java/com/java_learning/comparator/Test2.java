package com.java_learning.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    static void main() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2, "April", 32));
        employees.add(new Employee(7, "April", 29));
        employees.add(new Employee(1, "Ronni", 45));
        employees.add(new Employee(5, "Bob", 63));
        employees.add(new Employee(3, "Wednesday", 15));


        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee empl1, Employee empl2) {
                return Integer.compare(empl1.id(), empl2.id());
            }
        });
        System.out.println(employees.toString());

        Collections.sort(employees, (empl1, empl2) -> {
            return empl1.name().compareTo(empl2.name());
        });
        System.out.println(employees.toString());

        Collections.sort(employees, Comparator.comparingInt(Employee::age));
        System.out.println(employees.toString());

        Collections.sort(employees, Comparator.comparing(Employee::name)
                .thenComparingInt(Employee::age));
        System.out.println(employees.toString());

        employees.sort(Comparator.comparing(Employee::name, Comparator.nullsFirst(String::compareTo))
                .thenComparing(Employee::age, (age1, age2) -> Integer.compare(age2, age1) )
                .reversed());
        System.out.println(employees.toString());
    }
}


