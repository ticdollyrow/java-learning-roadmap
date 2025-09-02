package com.java_learning.records;

import java.util.Arrays;

//https://docs.oracle.com/en/java/javase/17/language/records.html
public record Cat(String name, int numberOfLives, String color) {
//    public Cat(String name, int numberOfLives, String color) {
//        if (numberOfLives < 0) {
//            throw new IllegalArgumentException("Number of lives cannot be less than 0.");
//        }
//
//        if (numberOfLives > 9) {
//            throw new IllegalArgumentException("Cats cannot have that many lives.");
//        }
//
//        this.name = name;
//        this.numberOfLives = numberOfLives;
//        this.color = color;
//    }

    //This succinct form of constructor declaration is only available in a record class.
    // Note that the statements this.name = name; this.numberOfLives = numberOfLives;  this.color = color;
    // which appear in the canonical constructor do not appear in the compact constructor.
    public Cat{
        if (numberOfLives < 0) {
            throw new IllegalArgumentException("Number of lives cannot be less than 0.");
        }

        if (numberOfLives > 9) {
            throw new IllegalArgumentException("Cats cannot have that many lives.");
        }
    }

    static void main() {
        Cat cat = new Cat("Fluffy", 9, "White");
        if(cat.getClass().isRecord()) {
            System.out.println("Record Cat " + cat);
        }

        Arrays.stream(cat.getClass().getRecordComponents()).forEach(System.out::println);
    }
}

