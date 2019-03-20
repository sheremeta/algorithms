package com.study.algorithms.divideandconquer;

import static com.study.algorithms.util.Integers.isPowerOfTwo;

class MatrixMultiplicationProblem {

    static int[][] solve(int[][] a, int[][] b) {
        if (!isPowerOfTwo(a.length) || a.length != b.length) {
            throw new IllegalArgumentException();
        }

        return divideAndConquer(a, 0, 0, b, 0, 0, a.length);
    }

    private static int[][] divideAndConquer(int[][] a, int ax0, int ay0, int[][] b, int bx0, int by0, int size) {

        int[][] c = new int[size][size];

        if (size == 1) {
            return new int[][] { { a[ax0][ay0] * b[bx0][by0] } };
        }

        int mid = size / 2;

        sum(c, 0, 0, divideAndConquer(a, ax0, ay0, b, bx0, by0, mid), divideAndConquer(a, ax0 + mid, ay0, b, bx0, by0 + mid, mid));
        sum(c, mid, 0, divideAndConquer(a, ax0, ay0, b, bx0 + mid, by0, mid), divideAndConquer(a, ax0 + mid, ay0, b, bx0 + mid, by0 + mid, mid));
        sum(c, 0, mid, divideAndConquer(a, ax0, ay0 + mid, b, bx0, by0, mid), divideAndConquer(a, ax0 + mid, ay0 + mid, b, bx0, by0 + mid, mid));
        sum(c, mid, mid, divideAndConquer(a, ax0, ay0 + mid, b, bx0 + mid, by0, mid), divideAndConquer(a, ax0 + mid, ay0 + mid, b, bx0 + mid, by0 + mid, mid));

        return c;
    }

    private static void sum(int[][] c, int cx0, int cy0, int[][] c1, int[][] c2) {
        int size = c1.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                c[cx0 + i][cy0 + j] = c1[i][j] + c2[i][j];
            }
        }
    }
}
