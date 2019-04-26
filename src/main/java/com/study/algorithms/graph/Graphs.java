package com.study.algorithms.graph;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

class Graphs {

    static Collection<Integer> dfs(int start, Map<Integer, List<Integer>> adj) {
        Set<Integer> visited = new HashSet<>();

        visited.add(start);

        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        Collection<Integer> result = new LinkedList<>();

        while (!stack.empty()) {
            Integer current = stack.pop();

            result.add(current);

            for (Integer vertex : adj.get(current)) {
                if (!visited.contains(vertex)) {
                    stack.push(vertex);

                    visited.add(vertex);
                }
            }
        }

        return result;
    }

    static Collection<Integer> bfs(int start, Map<Integer, List<Integer>> adj) {
        Set<Integer> visited = new HashSet<>();

        visited.add(start);

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);

        Collection<Integer> result = new LinkedList<>();

        while (!queue.isEmpty()) {
            Integer current = queue.poll();

            result.add(current);

            for (Integer vertex : adj.get(current)) {
                if (!visited.contains(vertex)) {
                    queue.add(vertex);

                    visited.add(vertex);
                }
            }
        }

        return result;
    }
}
