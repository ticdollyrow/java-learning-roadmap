package com.java_learning.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    static void main() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2, "April", 32));
        employees.add(new Employee(1, "Ronni", 45));
        employees.add(new Employee(5, "Bob", 63));
        employees.add(new Employee(3, "Wednesday", 15));

        employees.sort(new IdComparator());
        System.out.println(employees.toString());

        Collections.sort(employees, new AgeComparator());
        System.out.println(employees.toString());
    }
}

record Employee(int id, String name, int age){

}

class IdComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee empl1, Employee empl2) {
        return Integer.compare(empl1.id(), empl2.id());
    }
}

class AgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee empl1, Employee empl2) {
        return Integer.compare(empl1.age(), empl2.age());
    }
}
