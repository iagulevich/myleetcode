package org.gula.myleetcode.medium;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target,
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 */
public class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i = Arrays.binarySearch(nums, target/3);
        return target;
    }
}
