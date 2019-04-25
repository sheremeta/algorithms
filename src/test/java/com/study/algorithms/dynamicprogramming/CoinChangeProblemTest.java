package com.study.algorithms.dynamicprogramming;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CoinChangeProblemTest {

    @Test
    public void solve() {
        assertThat(CoinChangeProblem.solve(new int[] { 1, 5, 10 }, 12)).isEqualTo(4);
        assertThat(CoinChangeProblem.solve(new int[] { 1, 5, 10 }, 20)).isEqualTo(9);
    }
}
