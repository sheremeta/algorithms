package com.study.algorithms.leetcode;

import java.util.LinkedList;

/*
    https://leetcode.com/problems/binary-search-tree-iterator/
 */
class BSTIterator {

    private final LinkedList<Integer> sortedElements = new LinkedList<>();

    BSTIterator(TreeNode root) {
        if (root != null) {
            dfs(root);
        }
    }

    int next() {
        if (sortedElements.isEmpty()) {
            throw new IllegalStateException();
        }
        return sortedElements.poll();
    }

    boolean hasNext() {
        return sortedElements.peek() != null;
    }

    private void dfs(TreeNode root) {
        if (root.left != null) {
            dfs(root.left);
        }

        sortedElements.add(root.val);

        if (root.right != null) {
            dfs(root.right);
        }
    }

    static class TreeNode {

        final int val;
        final TreeNode left;
        final TreeNode right;

        static TreeNode node(int val, TreeNode left, TreeNode right) {
            return new TreeNode(val, left, right);
        }

        static TreeNode node(int val) {
            return new TreeNode(val, null, null);
        }

        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.right = right;
            this.left = left;
        }
    }
}
