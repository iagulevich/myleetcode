package org.gula.myleetcode.medium;

import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        System.out.println("start: " + Arrays.toString(nums));
        int k = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (i != k){
                    nums[i] = nums[k];
                    nums[k] = 0;
                }
                k++;
            }
        }

        for (int i = k; i < n; i++) {
            if (nums[i] == 1) {
                if (i != k){
                    nums[i] = nums[k];
                    nums[k] = 1;
                }
                k++;
            }
        }
        System.out.println("end: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        new SortColors().sortColors(new int[]{2, 0, 2, 1, 1, 0});
        new SortColors().sortColors(new int[]{0});
        new SortColors().sortColors(new int[]{2, 1});
        new SortColors().sortColors(new int[]{0, 1});
        new SortColors().sortColors(new int[]{1,2,1});
    }
}
