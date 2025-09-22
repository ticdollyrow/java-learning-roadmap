package com.java_learning.generics;

public class ParameterizedClass {
    static void main() {
        Pair<Integer, String> pair1 = new Pair<>(23, "phrase");
        System.out.println(pair1.toString());

        PairRecord<String, Boolean> pairRecord = new PairRecord<>("Are you ready?", true);
        System.out.println(pairRecord.toString());

        Info<Number> info1 = new Info<>(1);
        Info<Integer> info2 = new Info<>(2);
        Info<Double> info3 = new Info<>(4.9);

    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "first " + value1 + " second " + value2;
    }
}

record PairRecord<V1, V2>(V1 val1, V2 val2){}

record Info<T extends Number>(T val){}

interface Interface1{}
interface Interface2{}

record TestInfo<T extends Number&Interface1&Interface2>(T val){}