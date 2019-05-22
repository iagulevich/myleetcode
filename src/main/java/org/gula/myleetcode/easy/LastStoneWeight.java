package org.gula.myleetcode.easy;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(stones.length, (x, y) -> y - x);

        for (int stone : stones) {
            queue.add(stone);
        }

        while (queue.size() > 1) {
            int last = queue.poll();
            int preLast = queue.poll();
            int diff = Math.abs(last - preLast);
            if (diff > 0) {
                queue.add(diff);
            }
        }
        return (queue.size() == 1) ? queue.peek() : 0;
    }
}
