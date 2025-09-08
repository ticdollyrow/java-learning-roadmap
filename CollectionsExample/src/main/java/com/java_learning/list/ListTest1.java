package com.java_learning.list;

import java.util.*;
import java.util.stream.Collectors;

public class ListTest1 {
    static void main() {
        String testLine = "cat dog meow dog fox black dog";
        final String[] split = testLine.split("\\s");
        List<String> list = Arrays.asList(split);

        Set<String> unique = new TreeSet<>(list);
        System.out.println(unique.toString());

        List<String> result = list.stream()
                .distinct()                  // убираем дубликаты
                .sorted()                    // сортируем
                .collect(Collectors.toList());

        System.out.println(result.toString());

        list.sort((s,t)-> Integer.compare(s.length(), t.length()));
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list.toString());


        List<Integer> listWithDuplicates = Arrays.asList(5, 0, 3, 1, 2, 3, 0, 0);
        List<Integer> listWithoutDuplicates = new ArrayList<>(
                new LinkedHashSet<>(listWithDuplicates));
    }
}
