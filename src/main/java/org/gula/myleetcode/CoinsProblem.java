package org.gula.myleetcode;

import java.util.ArrayList;
import java.util.List;

public class CoinsProblem {

    private final static int[] COINS = new int[]{25, 10, 5, 1};

    public List<Integer> getCharge(int amount) {
        List<Integer> charge = new ArrayList<>();
        int i = 0;
        while (amount > 0) {
            Integer coin = COINS[i];
            if (amount >= coin) {
                amount -= coin;
                charge.add(coin);
            } else {
                i++;
            }
        }
        return charge;
    }

    public static void main(String[] args) {
        List<Integer> charge = new CoinsProblem().getCharge(67);
        System.out.println(charge); // 25, 25, 10, 5, 1, 1]
    }

}
