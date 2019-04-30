package com.study.algorithms.leetcode;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class DutchNationalFlagProblemTest {

    @Test
    public void solve() {
        assertThat(DutchNationalFlagProblem.solve(new int[] { 1, 0, 0, 1, 2, 2, 0, 0, 1, 1 }))
            .containsExactly(0, 0, 0, 0, 1, 1, 1, 1, 2, 2);
    }
}
