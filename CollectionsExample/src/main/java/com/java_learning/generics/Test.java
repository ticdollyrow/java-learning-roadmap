package com.java_learning.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    static void main() {
        List<String> test1 = new ArrayList<>();
        test1.add("First");
        test1.add("Second");
        showListInfo(test1);

        List<Integer> test2 = new ArrayList<>();
        test2.add(1);
        test2.add(54);
        showListInfo(test2);

        List<?> list = new ArrayList<>();
        list.add(null);
        //list.add("Hi");
        //Нельзя добавлять элементы в list, кроме null (так как тип неизвестен).


        List<? extends Number> listNumber = new ArrayList<>();
        //Нельзя безопасно добавлять новые элементы (ведь не знаем точно — это Integer, Double или другой наследник).
        //Можно читать как Number.

        System.out.println(sum(test2));

        List<? super Number> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(4.6);
//        Object obj1 = new Integer(4);
//        list1.add(obj1);
        //Чтение ограничено → можно читать только как Object.
        //В <? super Number> можно добавлять Number и его подтипы (Integer, Double, BigDecimal и т.д.).
        //Но нельзя добавлять суперклассы (Object, Serializable, …), даже если они формально «шире».
        fillList(list1);
        System.out.println(list1);

        List<Number> list2 = new ArrayList<>();
        fillList(list2);
        System.out.println(list2);

        List<Object> list3 = new ArrayList<>();
        fillList(list3);
        System.out.println(list3);
    }

    static void showListInfo(List<?> list){
        System.out.println(list);
    }

    static Double sum(List<? extends Number> list){
        double res = 0.0;
        for(Number number:list){
            res += number.doubleValue();
        }
        return res;
    }

    static void fillList(List<? super Number> list){
        list.add(34);
        list.add(1L);
        list.add(5.98);
    }
}
