package org.gula.myleetcode.easy;

public class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int max0 = 0;
        int count = 0;
        boolean first0 = seats[0] == 0;
        boolean last0 = seats[n - 1] == 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                int temp = 0;
                if (first0) {
                    temp = count;
                } else if (count > 0) {
                    temp = (count % 2 == 0) ? count / 2 : count / 2 + 1;
                }
                max0 = Math.max(max0, temp);
                count = 0;
                first0 = false;

            } else {
                count++;
            }
        }

        if (last0 && count > 0) {
            max0 = Math.max(max0, count);
        }

        return max0;
    }
}
