package org.gula.myleetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>(n);

        return result;

    }

    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length == 0) return result;
        List<Integer> cur = new LinkedList<>();
        cur.add(nums[0]);
        result.add(cur);
        for (int i = 1; i < nums.length; i++) {
            int curSize = result.size();
            for (int j = 0; j < curSize; j++) {
                for (int x = 0; x < result.get(j).size(); x++) {
                    List<Integer> newList = new LinkedList<>(result.get(j));
                    newList.add(x, nums[i]);
                    result.add(newList);
                }
                result.get(j).add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new Permutations().permute2(new int[]{1, 2, 3, 4});
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}
