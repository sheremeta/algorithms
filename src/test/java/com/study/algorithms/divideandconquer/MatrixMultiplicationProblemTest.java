package com.study.algorithms.divideandconquer;

import org.junit.Test;

import static java.util.Arrays.deepEquals;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class MatrixMultiplicationProblemTest {

    @Test
    public void solve() {
        int[][] result = MatrixMultiplicationProblem.solve(
            new int[][] {
                { 2, 5, 2, 5 },
                { 1, 2, 1, 2 },
                { 2, 5, 2, 5 },
                { 1, 2, 1, 2 }
            },
            new int[][] {
                { 4, 3, 4, 3 },
                { 7, 1, 7, 1 },
                { 4, 3, 4, 3 },
                { 7, 1, 7, 1 }
            });

        assertThat(deepEquals(result,
            new int[][] {
                { 86, 22, 86, 22 },
                { 36, 10, 36, 10 },
                { 86, 22, 86, 22 },
                { 36, 10, 36, 10 }
            })).isTrue();
    }
}
