package com.study.algorithms.challenge;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.StrictMath.pow;

/*
Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 */
class MaxSquareProblem {

    static int solve(int[][] matrix) {
        int maxSquare = 0;

        if (matrix.length == 0) {
            return maxSquare;
        }

        int[] dp = new int[matrix[0].length];

        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 0 && dp[j] == 1) {
                    maxSquare = max(maxSquare, maxSquare(dp));

                    dp[j] = 0;
                } else {
                    dp[j] = dp[j] + 1;
                }
            }
        }

        return (int) pow(max(maxSquare, maxSquare(dp)), 2);
    }

    private static int maxSquare(int[] dp) {
        int max = 0, height = dp[0], weight = 1;

        for (int i = 1; i < dp.length; i++) {
            max = max(min(height, weight), max);

            if (height == dp[i]) {
                weight++;
            } else {
                height = dp[i];
                weight = 1;
            }
        }

        return max;
    }
}
