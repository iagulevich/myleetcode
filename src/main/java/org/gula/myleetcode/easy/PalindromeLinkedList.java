package org.gula.myleetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode root = head;
        while (root != null) {
            list.add(root.val);
            root = root.next;
        }

        int n = list.size();
        int m = n / 2;
        for (int i = 0; i < m; i++) {
            if (!list.get(i).equals(list.get(n - 1 - i))) {
                return false;
            }
        }
        return true;
    }

}
