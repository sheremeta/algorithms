package com.study.algorithms.util;

import java.util.Stack;

import org.apache.commons.lang3.tuple.Pair;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Arrays {

    public static int maximumSliceSum(int[] arr) {
        int localMaximum = 0;
        int maximumSlice = 0;

        for (int curr : arr) {
            localMaximum = max(0, localMaximum + curr);
            maximumSlice = max(maximumSlice, localMaximum);
        }

        return maximumSlice;
    }

    static int maximumSliceProduct(int[] arr) {
        int posSumm = 1, negSumm = 1, maxSum = 1;

        for (int value : arr) {
            if (value > 0) {
                posSumm *= value;
                negSumm *= value;
            } else if (value == 0) {
                posSumm = 1;
                negSumm = 1;
            } else {
                posSumm = max(1, negSumm * value);
                negSumm = min(negSumm * value, value);
            }

            maxSum = max(posSumm, negSumm);
        }

        return maxSum;
    }

    static int islands(int[][] arr, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];

        int count = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (!visited[row][col] && arr[row][col] == 1) {
                    dfs(arr, row, col, visited, rows, cols);

                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(int[][] arr, int row, int col, boolean[][] visited, int rows, int cols) {
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        stack.add(Pair.of(row, col));

        while (!stack.isEmpty()) {
            Pair<Integer, Integer> coordinate = stack.pop();

            int currRow = coordinate.getLeft();
            int currCol = coordinate.getRight();

            visited[currRow][currCol] = true;

            int[] rowStep = { -1, -1, -1, 0, 0, 1, 1, 1 };
            int[] colStep = { -1, 0, 1, -1, 1, -1, 0, 1 };

            for (int i = 0; i < 8; i++) {
                int newRow = currRow + rowStep[i];
                int newCol = currCol + colStep[i];

                if (isSafe(arr, newRow, newCol, visited, rows, cols)) {
                    stack.push(Pair.of(newRow, newCol));
                }
            }
        }
    }

    private static boolean isSafe(int[][] arr, int row, int col, boolean[][] visited, int rows, int cols) {
        return row >= 0 && row < rows
            && col >= 0 && col < cols
            && arr[row][col] == 1
            && !visited[row][col];
    }
}
