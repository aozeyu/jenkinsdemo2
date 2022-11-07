package com.example.jenkinsdemo.demo6;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = new ListNode(-1);
        ListNode cur = new ListNode(-1);
        cur.next = head;
        pre = cur;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }

        return  pre.next;
    }
}


