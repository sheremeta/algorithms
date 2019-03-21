package com.study.algorithms.divideandconquer;

import org.junit.Test;

import static com.study.algorithms.divideandconquer.ChipTestingProblem.Chip;
import static com.study.algorithms.divideandconquer.ChipTestingProblemTest.CheckableChip.bad;
import static com.study.algorithms.divideandconquer.ChipTestingProblemTest.CheckableChip.good;
import static java.lang.Math.random;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class ChipTestingProblemTest {

    @Test
    public void solve() {
        CheckableChip chip = ChipTestingProblem.solve(asList(bad(), bad(), bad(), good(), good(), good(), good()));

        assertThat(chip.state()).isTrue();
    }

    static class GoodChip extends CheckableChip {

        private GoodChip() {
            super(true);
        }

        public boolean check(CheckableChip chip) {
            return chip.state();
        }
    }

    static class BadChip extends CheckableChip {

        private BadChip() {
            super(false);
        }

        public boolean check(CheckableChip chip) {
            return random() < 0.5;
        }
    }

    abstract static class CheckableChip implements Chip<CheckableChip> {

        private final boolean state;

        static CheckableChip good() {
            return new GoodChip();
        }

        static CheckableChip bad() {
            return new BadChip();
        }

        CheckableChip(boolean state) {
            this.state = state;
        }

        boolean state() {
            return state;
        }

        @Override
        public boolean check(CheckableChip chip) {
            return state;
        }
    }
}
