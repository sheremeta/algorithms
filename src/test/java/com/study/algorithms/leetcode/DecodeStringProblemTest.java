package com.study.algorithms.leetcode;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class DecodeStringProblemTest {

    @Test
    public void solve() {
        assertThat(DecodeStringProblem.solve("3[a]2[bc]")).isEqualTo("aaabcbc");
        assertThat(DecodeStringProblem.solve("3[a2[c]]")).isEqualTo("accaccacc");
        assertThat(DecodeStringProblem.solve("2[abc]3[cd]ef")).isEqualTo("abcabccdcdcdef");
    }
}
