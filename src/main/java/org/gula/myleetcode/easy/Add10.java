package org.gula.myleetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Add10 {
    public boolean isAdd10(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            if (set.contains(10 - num)) {
                System.out.println(10 - num + "," + num);
                return false;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean add10 = new Add10().isAdd10(new int[]{3, 4, 1, 2, 9});
        System.out.println(add10);
    }
}
