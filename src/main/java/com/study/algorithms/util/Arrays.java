package com.study.algorithms.util;

import static java.lang.Integer.max;

public class Arrays {

    public static int maximumSlice(int[] arr) {
        int localMaximum = 0;
        int maximumSlice = 0;

        for (int curr : arr) {
            localMaximum = max(0, localMaximum + curr);
            maximumSlice = max(maximumSlice, localMaximum);
        }

        return maximumSlice;
    }
}
