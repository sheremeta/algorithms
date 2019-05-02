package com.study.algorithms.leetcode;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import static com.study.algorithms.leetcode.BSTIterator.TreeNode.node;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class BSTIteratorTest {

    @Test
    public void next() {
        BSTIterator iterator = new BSTIterator(
            node(10,
                node(7,
                    node(6),
                    node(8)),
                node(15,
                    node(12,
                        node(11),
                        node(13)),
                    node(16))));

        List<Integer> result = new LinkedList<>();

        while (iterator.hasNext()) {
            result.add(iterator.next());
        }

        assertThat(result).containsExactly(6, 7, 8, 10, 11, 12, 13, 15, 16);
    }
}
