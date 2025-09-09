package com.java_learning.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    static void main() {
        List<EmployeeRecord> employeeRecords = new ArrayList<>();
        employeeRecords.add(new EmployeeRecord(1, "Sam", "Brown"));
        employeeRecords.add(new EmployeeRecord(2, "Zoe", "Doe"));
        employeeRecords.add(new EmployeeRecord(3, "Mike", "Shinoda"));
        employeeRecords.add(new EmployeeRecord(4, "Emy", "Lee"));

        Collections.sort(employeeRecords);
        System.out.println(employeeRecords.toString());
    }
}


record EmployeeRecord (int id, String name, String surname) implements Comparable<EmployeeRecord>{
    @Override
    public int compareTo(EmployeeRecord other) {
        return other.name().compareTo(this.name());
    }
}
