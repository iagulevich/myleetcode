package org.gula.myleetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String S) {
        char[] chars = S.toCharArray();
        int n = chars.length;
        Deque<Character> deque = new ArrayDeque<>(n);
        for (char ch : chars) {
            if (!deque.isEmpty() && deque.peekLast() == ch) {
                deque.pollLast();
            } else {
                deque.add(ch);
            }
        }

        StringBuilder str = new StringBuilder();
        for (Character character : deque) {
            str.append(character);
        }
        return str.toString();
    }

}
