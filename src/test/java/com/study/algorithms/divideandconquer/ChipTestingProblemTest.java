package com.study.algorithms.divideandconquer;

import org.junit.Test;

import static com.study.algorithms.divideandconquer.ChipTestingProblem.Chip;
import static com.study.algorithms.divideandconquer.ChipTestingProblem.Chip.bad;
import static com.study.algorithms.divideandconquer.ChipTestingProblem.Chip.good;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class ChipTestingProblemTest {

    @Test
    public void solve() {
        Chip chip = ChipTestingProblem.solve(new Chip[] { bad(), bad(), good(), bad(), good(), good(), good() });

        assertThat(chip.isGood()).isTrue();
    }
}
