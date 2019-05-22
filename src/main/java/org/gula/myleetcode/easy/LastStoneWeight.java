package org.gula.myleetcode.easy;

import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(stones.length, (x, y) -> y - x);

        for (int stone : stones) {
            queue.add(stone);
        }

        while (queue.size() > 1) {
            queue.add(queue.poll() - queue.poll());
        }
        return queue.peek();
    }
}
