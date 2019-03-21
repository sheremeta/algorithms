package com.study.algorithms.divideandconquer;

import java.util.Collection;

class ChipTestingProblem {

    static <T extends Chip> T solve(Collection<T> chips) {

        throw new IllegalStateException();
    }

    public interface Chip<T extends Chip> {

        boolean check(T chip);
    }
}
