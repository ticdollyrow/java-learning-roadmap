package com.java_learning.records;

public record Pair<T , U>(T first, U second) {

    static void main() {
        Pair<String, Integer> pair = new Pair<>("Name", 100);

    }
}
