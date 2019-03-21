package com.study.algorithms.divideandconquer;

import java.util.LinkedList;
import java.util.List;

import static com.study.algorithms.util.Integers.isEven;

class ChipTestingProblem {

    static <T extends Chip<T>> T solve(List<T> chips) {
        if (chips == null || chips.size() < 2) {
            throw new IllegalArgumentException();
        }

        LinkedList<T> copy = new LinkedList<>(chips);

        if (!isEven(copy.size())) {
            T head = copy.poll();

            LinkedList<T> result = divideAndConquer(copy);

            return result.isEmpty() ? head : result.getFirst();
        }

        return divideAndConquer(copy).getFirst();
    }

    private static <T extends Chip<T>> LinkedList<T> divideAndConquer(LinkedList<T> chips) {
        int size = chips.size();

        if (size == 1) {
            return chips;
        }

        LinkedList<T> remain = new LinkedList<>();

        for (int i = 0; i < size / 2; i++) {

            T left = chips.removeFirst();
            T right = chips.removeLast();

            if (left.check(right) && right.check(left)) {
                remain.add(left);
                remain.add(right);
            }
        }

        return remain;
    }

    public interface Chip<T extends Chip> {

        boolean check(T chip);
    }
}
