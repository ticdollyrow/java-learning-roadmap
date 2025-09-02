package com.java_learning.records;

public record PointRecord(int x, int y) {
    static void main() {
        PointRecord pointRecord = new PointRecord(100, 100);
        System.out.println("pointRecord " + pointRecord );
        System.out.println(pointRecord.y());
    }
}
