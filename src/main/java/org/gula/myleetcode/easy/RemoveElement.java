package org.gula.myleetcode.easy;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        int i = 0;
        while (i < n - count) {
            if (nums[i] == val) {
                if (n - 1 - count > i && nums[n - 1 - count] != val) {
                    int temp = nums[i];
                    nums[i] = nums[n - 1 - count];
                    nums[n - 1 - count] = temp;
                }
                count++;
            } else {
                i++;
            }
        }
        return i;
    }
}
