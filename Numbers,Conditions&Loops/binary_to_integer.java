#Leetcode: Convert binary to integer
#Link:
https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/submissions/2166418851/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while(head !=null){
            num = num*2+head.val;
            head = head.next;
        }
        return num;
        
    }
}
