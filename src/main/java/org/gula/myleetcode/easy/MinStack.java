package org.gula.myleetcode.easy;

import java.util.Arrays;

public class MinStack {

    private int[] data;
    private int length;
    private int current;


    public MinStack() {
        this.length = 2;
        this.data = new int[this.length];
        this.current = 0;
    }

    public void push(int x) {
        if (this.current == this.length) {
            this.length += 2;
            this.data = Arrays.copyOf(this.data, this.length);
        }
        this.data[this.current++] = x;
    }

    public void pop() {
        if (this.current > 0) {
            this.data[--this.current] = 0;
        }
    }

    public int top() {
        return this.data[this.current - 1];
    }

    public int getMin() {
        int min = this.data[this.current - 1];
        for (int i = 0; i < this.current; i++) {
            min = Math.min(this.data[i], min);
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(5);

        minStack.getMin();

//        int min = minStack.getMin();//--> Returns -3.
//        System.out.println("min:-3?" + min);
//
//        minStack.pop();
//
//        int top = minStack.top();//--> Returns 0.
//        System.out.println("top:0?" + top);
//
//        int minAgain = minStack.getMin();//--> Returns -2.
//        System.out.println("minAgain:-2?" + minAgain);
    }
}


