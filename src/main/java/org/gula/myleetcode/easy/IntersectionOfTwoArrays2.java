package org.gula.myleetcode.easy;

public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int count = 0;
        boolean[] b = new boolean[n1];
        for (int num : nums2) {
            for (int i = 0; i < n1; i++) {
                if (b[i] == false && nums1[i] == num) {
                    b[i] = true;
                    count++;
                    break;
                }
            }
        }
        int[] result = new int[count];
        int k = 0;
        for (int i = 0; i < n1; i++) {
            if (b[i]) {
                result[k++] = nums1[i];
            }
        }
        return result;
    }
}
