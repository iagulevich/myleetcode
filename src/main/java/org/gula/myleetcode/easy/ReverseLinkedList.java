package org.gula.myleetcode.easy;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode listNode = new ListNode(curr.val);
            listNode.next = result;
            result = listNode;

            curr = curr.next;
        }
        return result;
    }

    public static void main(String[] args) {
//        1->2->3->4->5->NULL
        ListNode root = new ListNode(1);

        ListNode first = new ListNode(2);
        root.next = first;

        ListNode second = new ListNode(3);
        first.next = second;

        ListNode three = new ListNode(4);
        second.next = three;

        ListNode four = new ListNode(5);
        three.next = four;

        new ReverseLinkedList().reverseList(root);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}