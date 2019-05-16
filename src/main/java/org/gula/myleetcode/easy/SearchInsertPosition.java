package org.gula.myleetcode.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int result = n;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= target) {
                result = i;
                break;
            }
        }
        return result;
    }
}
