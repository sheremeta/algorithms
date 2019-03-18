package com.study.algorithm.divideandconquer;

class MaxSubArrayProblem {

    static int solve(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        return divideAndConquer(0, array.length - 1, array);
    }

    private static int divideAndConquer(int start, int end, int[] array) {
        if (start == end) {
            return array[start];
        }

        int mid = (start + end) / 2;

        int lMax = divideAndConquer(start, mid, array);
        int rMax = divideAndConquer(mid + 1, end, array);

        int cMax = crossMax(start, mid, end, array);

        if (lMax >= rMax && lMax >= cMax) {
            return lMax;
        } else if (rMax >= lMax && rMax >= cMax) {
            return rMax;
        } else {
            return cMax;
        }
    }

    private static int crossMax(int start, int mid, int end, int[] array) {
        int leftMax = 0, rightMax = 0;

        int leftLocalMax = 0;
        for (int i = mid; i >= start; i--) {
            leftLocalMax = leftLocalMax + array[i];

            if (leftLocalMax > leftMax) {
                leftMax = leftLocalMax;
            }
        }

        int rightLocalMax = 0;
        for (int i = mid + 1; i <= end; i++) {
            rightLocalMax = rightLocalMax + array[i];

            if (rightLocalMax > rightMax) {
                rightMax = rightLocalMax;
            }
        }

        return leftMax + rightMax;
    }
}
