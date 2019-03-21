package com.study.algorithms.util;

public class Integers {

    public static boolean isPowerOfTwo(int x) {
        return x > 0 && (x & (x - 1)) == 0;
    }

    public static boolean isEven(int x) {
        return x > 0 && (x & 1) == 0;
    }
}
