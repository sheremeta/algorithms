package com.study.algorithms.divideandconquer;

import org.junit.Test;

import static com.study.algorithms.util.Arrays.maximumSlice;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class MaxSubArrayProblemTest {

    @Test
    public void solve() {
        //O(n log n)
        int result1 = MaxSubArrayProblem.solve(new int[] { -1, 2, 3, 4, -10, 10, 12, -7, -9, 10 });

        //O(n)
        int result2 = maximumSlice(new int[] { -1, 2, 3, 4, -10, 10, 12, -7, -9, 10 });

        assertThat(result1).isEqualTo(result2).isEqualTo(22);
    }
}
