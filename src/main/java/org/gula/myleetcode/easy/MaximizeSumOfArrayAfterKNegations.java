package org.gula.myleetcode.easy;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] A, int K) {
        int n = A.length;
        Arrays.sort(A); // O(logn * n)
        for (int i = 0; i < n && K > 0; i++) { //O(logn * n) + O(n)
            if (A[i] < 0) {
                A[i] = -A[i];
                K--;
            } else {
                if (K % 2 != 0) {
                    if (i > 1 && A[i - 1] < A[i]) {
                        A[i - 1] = -A[i - 1];
                    } else {
                        A[i] = -A[i];
                    }
                }
                break;
            }
        }

        int sum = 0;
        for (int a : A) {  //O(logn * n) + O(n) + O(n)
            sum += a;
        }
        return sum;
    }
}
