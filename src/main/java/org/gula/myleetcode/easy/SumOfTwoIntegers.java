package org.gula.myleetcode.easy;

public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while(b!=0){
            int c = a&b;
            a = a^b;
            b = c<<1;
        }
        return a;
    }

    public static void main(String[] args) {
        int sum = new SumOfTwoIntegers().getSum(3, 5);
        System.out.println(sum);
    }
}
