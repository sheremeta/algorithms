package com.study.algorithms.leetcode;

import java.util.Stack;

import static java.lang.Character.isDigit;

/*
https://leetcode.com/problems/decode-string/
 */
class DecodeStringProblem {

    static String solve(String str) {
        char[] chars = str.toCharArray();

        String decoded = "";

        Stack<Integer> nums = new Stack<>();
        Stack<String> partialDecoded = new Stack<>();

        int idx = 0;

        while (idx < str.length()) {
            if (isDigit(chars[idx])) {

                StringBuilder digits = new StringBuilder();
                digits.append(chars[idx]);

                while (isDigit(chars[++idx])) {
                    digits.append(chars[idx]);
                }

                nums.push(Integer.valueOf(digits.toString()));
            } else if (chars[idx] == '[') {

                partialDecoded.push(decoded);

                decoded = "";

                idx++;
            } else if (chars[idx] == ']') {

                int num = nums.pop();

                StringBuilder tmp = new StringBuilder(partialDecoded.pop());
                for (int i = 0; i < num; i++) {
                    tmp.append(decoded);
                }

                decoded = tmp.toString();

                idx++;
            } else {

                decoded = decoded + chars[idx];

                idx++;
            }
        }

        return decoded;
    }
}
