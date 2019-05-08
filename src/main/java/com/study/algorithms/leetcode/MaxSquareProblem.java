package com.study.algorithms.leetcode;

import static java.lang.Math.max;
import static java.lang.Math.min;

/*
https://leetcode.com/problems/maximal-square/description/
 */
class MaxSquareProblem {

    static int solve(int[][] matrix) {

        int rNum = matrix.length;

        if (rNum == 0) {
            return 0;
        }
        int cNum = matrix[0].length;

        int[][] squares = new int[rNum + 1][cNum + 1];

        int max = 0;

        for (int i = 0; i < rNum; i++) {
            for (int j = 0; j < cNum; j++) {
                if (matrix[i][j] == 1) {
                    squares[i + 1][j + 1] = min(min(squares[i][j + 1], squares[i + 1][j]), squares[i][j]) + 1;

                    max = max(squares[i + 1][j + 1], max);
                }
            }
        }

        return max * max;
    }
}
