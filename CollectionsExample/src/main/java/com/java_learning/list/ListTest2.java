package com.java_learning.list;

import java.util.*;
import java.util.stream.Collectors;

public class ListTest2 {
    static void main() {
        List<Integer> list = new ArrayList<>(Arrays.asList(4,7,97,35,2));
        Integer max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        Integer sum = 0;
        for(Integer i:list){
            max = Math.max(i, max);
            min = Math.min(min, i);
            sum += i;
        }
        double avg = sum / (double) list.size();

        Collections.reverse(list);
        System.out.println(list.toString());

        list.removeIf( t -> t < 7 );
        System.out.println(list.toString());

        final List<Integer> collect = list.stream()
                .filter(p -> p > 40)
                .toList();
        System.out.println(collect.toString());
    }
}
