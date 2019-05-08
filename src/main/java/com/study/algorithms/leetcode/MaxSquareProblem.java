package com.study.algorithms.leetcode;

import static java.lang.Math.*;

/*
https://leetcode.com/problems/maximal-square/description/
 */
class MaxSquareProblem {

    static int solve(int[][] matrix) {

        int rows = matrix.length;

        if (rows == 0) {
            return 0;
        }
        int columns = matrix[0].length;

        int[][] squares = new int[rows + 1][columns + 1];

        int max = 0;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (matrix[row][column] == 1) {
                    int square = min(squares[row][column + 1], squares[row + 1][column]);

                    square = min(square, squares[row][column]) + 1;

                    squares[row + 1][column + 1] = square;

                    max = max(square, max);
                }
            }
        }

        return max * max;
    }
}
