package org.gula.myleetcode.medium;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] result = new int[n];
        for (int i = 0; i < n - 1; i++) {
            result[i] = count(T, n, i);
        }

        return result;
    }

    private int count(int[] T, int n, int i) {
        int r = 0;
        boolean found = false;
        for (int j = i + 1; j < n; j++) {
            if (T[j] > T[i]) {
                r++;
                found = true;
                break;
            } else {
                r++;
            }
        }
        return found ? r : 0;
    }

    public static void main(String[] args) {
        //        T = [73, 74, 75, 71, 69, 72, 76, 73],
//            [1, 1, 4, 2, 1, 1, 0, 0].
        int[] ints = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println("ints:" + Arrays.toString(ints));
        int[] result = new DailyTemperatures().dailyTemperatures2(ints);
        System.out.println("result:" + Arrays.toString(result));
    }

    public int[] dailyTemperatures2(int[] T) {
        int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = T.length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }
}
