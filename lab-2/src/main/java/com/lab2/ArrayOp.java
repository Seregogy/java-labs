package com.lab2;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayOp {
    int[] arr;

    ArrayOp(int requireSize) {
        arr = new int[requireSize];
        fillArrRandom();
    }

    private void fillArrRandom() {
        arr = Arrays.stream(arr).map(_ ->
            (int)(Math.random() * 50)
        ).toArray();
    }

    public int sum() {
        return Arrays.stream(arr).sum();
    }

    public double avg() {
        OptionalDouble res = Arrays.stream(arr).average();
        if (res.isPresent())
            return res.getAsDouble();

        return 0;
    }

    @Override
    public String toString() {
        return String.format("Sum: %d, avg: %.2f", sum(), avg());
    }
}
