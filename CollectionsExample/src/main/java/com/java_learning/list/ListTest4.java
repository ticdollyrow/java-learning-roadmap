package com.java_learning.list;

import java.util.*;

public class ListTest4 {
    static void main() {
        List<String> list1 = new ArrayList<>();
        list1.add("Test1");
        list1.add("Test2");
        list1.add("Test3");
        list1.add("Test4");
        list1.add("Test5");

        List<String> subList1 = list1.subList(1,4);
        System.out.println(subList1);
        subList1.add("NewValue");
        System.out.println(list1);
        System.out.println(subList1);

        list1.add("ConcurrentModificationException");
        System.out.println(list1);
//        System.out.println(subList1);  //возникнет ошибка при взаимодействии с subList1 из-за того,
//        что добавили значение в list1

        String[] array = list1.toArray(new String[0]);
        System.out.println("Array " + Arrays.toString(array));


        Iterator<String> iterator1 = list1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
            iterator1.remove();
        }
        System.out.println(list1.size());

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Name", 56));
        employees.add(new Employee("Name2", 85));
        employees.add(new Employee("Name3", 12));
        Employee employee = new Employee("Name2", 85);
        System.out.println(employees);
        Iterator<Employee> iterator2 = employees.iterator();
        while (iterator2.hasNext()){
            if(iterator2.next().equals(employee)){
                iterator2.remove();
            }
        }
        System.out.println(employees);
    }
}

record Employee(String name, int age){}
