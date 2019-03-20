package com.study.algorithms.divideandconquer;

import java.util.Arrays;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MatrixMultiplicationProblemTest {

    @Test
    public void solve() {
        int[][] result = MatrixMultiplicationProblem.solve(
            new int[][] {
                { 2, 5 },
                { 1, 2 }
            },
            new int[][] {
                { 4, 3 },
                { 7, 1 }
            });

        assertThat(Arrays.deepEquals(result,
            new int[][] {
                { 11, 26 },
                { 15, 37 }
            })).isTrue();
    }
}
