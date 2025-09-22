package com.java_learning.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
    static void main() {

        List<InnerClass> list3 = new ArrayList<>();
        list3.add(new InnerClass(1));
        list3.add(new InnerClass(2));

        List<InnerClass> list4 = new ArrayList<>(list3);
        System.out.println(list3);
        System.out.println(list4);

        extracted(list3, list4);

    }

    private static void extracted(List<InnerClass> list3, List<InnerClass> list4) {
        var innerClass1 = list3.getFirst();
        innerClass1.setValue(4);
        list3.addFirst( new InnerClass(8));

        System.out.println(list3);
        System.out.println(list4);
    }


    static class InnerClass{
        int value;

        public InnerClass(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "value=" + value +
                    '}';
        }
    }
}
