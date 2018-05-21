package org.gula.myleetcode.easy;

import org.junit.Assert;
import org.junit.Test;


public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] input = new int[]{2, 7, 11, 15};

        TwoSum twoSum = new TwoSum();
        final int[] result = twoSum.twoSum(input, 18);
        Assert.assertArrayEquals(new int[]{1, 2}, result);

    }
}