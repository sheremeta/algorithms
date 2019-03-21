package com.study.algorithms.divideandconquer;

import static java.lang.Math.random;

class ChipTestingProblem {

    static Chip solve(Chip[] chips) {
        throw new IllegalStateException();
    }

    public interface Chip {

        static Chip good() {
            return new GoodChip();
        }

        static Chip bad() {
            return new BadChip();
        }

        boolean isGood();

        boolean check(Chip chip);

        class GoodChip implements Chip {

            private GoodChip() {}

            public boolean isGood() {
                return true;
            }

            public boolean check(Chip chip) {
                return chip.isGood();
            }
        }

        class BadChip implements Chip {

            private BadChip() {}

            public boolean isGood() {
                return false;
            }

            public boolean check(Chip chip) {
                return random() < 0.5;
            }
        }
    }
}
