package org.gula.myleetcode.medium;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == target) {
                result = i;
                break;
            }
        }
        return result;
    }
}
