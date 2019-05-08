package com.study.algorithms.dynamicprogramming;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;

class CoinChangeProblem {

    static int solve(int[] coins, int amount) {
        int[] ways = new int[amount + 1];

        ways[0] = 1;

        for (int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (coin <= i) {
                    ways[i] = ways[i] + ways[i - coin];
                }
            }
        }

        return ways[amount];
    }

    static Collection<Integer> exchange(int[] coins, int amount) {
        int[] coinsPerAmount = new int[amount + 1];
        coinsPerAmount[0] = 0;

        int[] minCoinIndexes = new int[amount + 1];
        minCoinIndexes[0] = 0;

        for (int j = 1; j <= amount; j++) {
            int minimum = MAX_VALUE;

            int coin = 0;

            for (int i = 1; i < coins.length; i++) {
                if (j >= coins[i]) {
                    if ((1 + coinsPerAmount[j - coins[i]]) < minimum) {
                        minimum = 1 + coinsPerAmount[j - coins[i]];
                        coin = i;
                    }
                }
            }
            coinsPerAmount[j] = minimum;
            minCoinIndexes[j] = coin;
        }

        List<Integer> result = new LinkedList<>();

        int tmpAmount = amount;
        while (tmpAmount > 0) {
            int coin = coins[minCoinIndexes[tmpAmount]];

            result.add(coin);

            tmpAmount = tmpAmount - coin;
        }
        return result;
    }
}
