package com.study.algorithms.util;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ArraysTest {

    @Test
    public void maximumSlice() {
        assertThat(Arrays.maximumSlice(new int[] { 5, -7, 3, 5, -2, 4, -1 })).isEqualTo(10);
    }
}
