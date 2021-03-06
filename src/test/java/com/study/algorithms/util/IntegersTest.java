package com.study.algorithms.util;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class IntegersTest {

    @Test
    public void isPowerOfTwo() {
        assertThat(Integers.isPowerOfTwo(-1)).isFalse();
        assertThat(Integers.isPowerOfTwo(0)).isFalse();
        assertThat(Integers.isPowerOfTwo(1)).isTrue();
        assertThat(Integers.isPowerOfTwo(2)).isTrue();
        assertThat(Integers.isPowerOfTwo(3)).isFalse();
        assertThat(Integers.isPowerOfTwo(4)).isTrue();
        assertThat(Integers.isPowerOfTwo(5)).isFalse();
        assertThat(Integers.isPowerOfTwo(4096)).isTrue();
    }

    @Test
    public void isOdd() {
        assertThat(Integers.isEven(-1)).isFalse();
        assertThat(Integers.isEven(0)).isFalse();
        assertThat(Integers.isEven(2)).isTrue();
        assertThat(Integers.isEven(3)).isFalse();
        assertThat(Integers.isEven(4)).isTrue();
        assertThat(Integers.isEven(5)).isFalse();
        assertThat(Integers.isEven(6)).isTrue();
    }
}
