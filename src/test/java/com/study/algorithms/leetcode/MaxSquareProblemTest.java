package com.study.algorithms.leetcode;

import org.junit.Test;

import com.study.algorithms.leetcode.MaxSquareProblem;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MaxSquareProblemTest {

    @Test
    public void solve() {
        assertThat(MaxSquareProblem.solve(new int[][] {
            { 0, 0, 0, 1, 0, 0, 0 },
            { 0, 1, 1, 1, 1, 0, 0 },
            { 1, 1, 1, 1, 1, 0, 0 },
            { 1, 1, 1, 1, 1, 1, 1 },
            { 0, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 0, 0, 0 }
        })).isEqualTo(16);
    }
}
