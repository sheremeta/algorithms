package com.study.algorithms.divideandconquer;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MaxSubArrayProblemTest {

    @Test
    public void solve() {
        assertThat(MaxSubArrayProblem.solve(new int[] { -1, 2, 3, 4, -10, 10, 12, -7, -9, 10 })).isEqualTo(22);
    }
}
