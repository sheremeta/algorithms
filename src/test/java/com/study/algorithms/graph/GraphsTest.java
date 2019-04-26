package com.study.algorithms.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.util.Lists.emptyList;
import static org.assertj.core.util.Lists.newArrayList;

public class GraphsTest {

    @Test
    public void dfs() {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, newArrayList(2, 3));
        graph.put(2, newArrayList(1, 4));
        graph.put(3, newArrayList(1, 2, 4, 5));
        graph.put(4, emptyList());
        graph.put(5, emptyList());

        assertThat(Graphs.dfs(1, graph)).containsExactly(1, 3, 5, 4, 2);
        assertThat(Graphs.dfs(3, graph)).containsExactly(3, 5, 4, 2, 1);
    }

    @Test
    public void bfs() {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, newArrayList(2, 3));
        graph.put(2, newArrayList(1, 4));
        graph.put(3, newArrayList(1, 2, 4, 5));
        graph.put(4, emptyList());
        graph.put(5, emptyList());

        assertThat(Graphs.bfs(1, graph)).containsExactly(1, 2, 3, 4, 5);
        assertThat(Graphs.bfs(2, graph)).containsExactly(2, 1, 4, 3, 5);
    }
}
