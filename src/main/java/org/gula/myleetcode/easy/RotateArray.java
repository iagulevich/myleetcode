package org.gula.myleetcode.easy;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        while (k > 0) {
            int temp = nums[n - 1];
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;
        }
    }

    public static void main(String[] args) {
        new RotateArray().rotate(new int[]{1, 2, 3, 4, 5}, 2);
    }
}
