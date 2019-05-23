package org.gula.myleetcode.easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        int k = 1;
        for(int i=0;i<n;i++) {
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for(int i = j; i < n; i++){
            nums[i] = 0;
        }
    }
}
