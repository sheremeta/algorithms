package com.study.algorithms.util;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ArraysTest {

    @Test
    public void maximumSlice() {
        assertThat(Arrays.maximumSlice(new int[] { 5, -7, 3, 5, -2, 4, -1 })).isEqualTo(10);
    }

    @Test
    public void islands() {
        assertThat(Arrays.islands(new int[][] {
            { 1, 1, 1, 0, 0, 0 },
            { 1, 1, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1, 1 },
            { 0, 0, 0, 1, 1, 1 }
        }, 5, 6)).isEqualTo(2);

        assertThat(Arrays.islands(new int[][] {
            { 1, 1, 1, 0, 0 },
            { 1, 1, 1, 0, 0 },
            { 0, 0, 1, 0, 0 },
            { 0, 0, 0, 1, 1 },
        }, 4, 5)).isEqualTo(1);

        assertThat(Arrays.islands(new int[][] {
            { 1, 1, 0, 1, 1 },
            { 1, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1 },
        }, 4, 5)).isEqualTo(3);
    }
}
