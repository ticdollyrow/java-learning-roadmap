package com.java_learning.generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Words");
        print(list);

        print(1, "Hello", 1L);
        print("Hello", 1L); //То есть оба аргумента должны быть приведены к одному и тому же T.
        // Компилятор подставляет T = Object, так как он общий для обоих параметров
        final Object string = getValue("String", 1L);
    }


    public static <T> void print(List<T> arrayList){
        for(T elem:arrayList){
            System.out.println(elem);
        }
    }

    public static <T,K> void print(K key, T elem, T second){
        System.out.println("Key " + key + " Elem " + elem + " Second " + second) ;
    }
    public static <T> void print(T elem, T second){
        System.out.println( "Elem " + elem + " Second " + second);
        System.out.println(elem.equals(second));
    }

    public static <T> T getValue(T elem, T second){
         return elem;
    }
}
