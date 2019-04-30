package com.study.algorithms.leetcode;

public class DutchNationalFlagProblem {

    public static int[] solve(int[] input) {
        int low = 0, reader = 0;
        int high = input.length - 1;

        while (reader <= high) {
            switch (input[reader]) {
                case 0: {
                    swap(input, low, reader);

                    low++;
                    reader++;

                    break;
                }
                case 1: {
                    reader++;
                    break;
                }
                case 2: {
                    swap(input, reader, high);
                    high--;
                }
            }
        }

        return input;
    }

    private static void swap(int[] input, int i, int j) {
        int tmp = input[i];

        input[i] = input[j];
        input[j] = tmp;
    }

}
