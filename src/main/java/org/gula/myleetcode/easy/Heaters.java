package org.gula.myleetcode.easy;

import java.util.TreeSet;

public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        int prev = houses[0];
        int max = 0;
        for (int i = 0; i < heaters.length; i++) {
            int house = houses[heaters[i] - 1];
            int sum = house - prev;
            if (sum / 2 > max) {
                max = sum / 2;
            }
            prev = house;
        }

        return max;
    }


    public int findRadius2(int[] houses, int[] heaters) {
        TreeSet<Integer> treeset = new TreeSet<>();
        for (int heater : heaters) treeset.add(heater);
        int res = 0;
        for (int house : houses) {
            Integer upper = treeset.ceiling(house);
            Integer lower = treeset.floor(house);
            int min = Math.min(upper == null ? Integer.MAX_VALUE : upper - house, lower == null ? Integer.MAX_VALUE : house - lower);
            res = Math.max(res, min);
        }
        return res;
    }
}
