package org.gula.myleetcode.medium;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= last) {
                last = i;
            }
        }
        return last == 0;
    }

    public boolean canJump2(int[] nums) {
        if (nums == null || nums.length <= 0) return false;
        int n = nums.length - 1;

        int max = nums[0];
        for (int i = 1; i <= n; i++) {
            if (i > max) {
                return false;
            }
            if (i + nums[i] > max) {
                max = i + nums[i];
            }
            if (max >= n) {
                return true;
            }
        }
        return true;
    }
}
