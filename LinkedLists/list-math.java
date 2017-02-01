/**
Add two numbers as lists

You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

    342 + 465 = 807
Make sure there are no trailing zeros in the output list
So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.


 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
	    //treat like adder function with carry for each digit
	    int carry = 0;
 
        ListNode head = new ListNode(0);
        ListNode p1 = a;
        ListNode p2 = b; 
        ListNode p3 = head; //populate result here
 
        while(p1 != null || p2 != null){
            if(p1 != null){
                carry += p1.val; //increment carry with val from List a
                p1 = p1.next; //traverse
            }
 
            if(p2 != null){
                carry += p2.val; //increment carry with val from List b
                p2 = p2.next; //traverse
            }
 
            p3.next = new ListNode(carry%10); //add new listnode for next digit, 0 if no carry exists
            p3 = p3.next; //traverse to next node of result
            carry /= 10; //update carry value
        }
 
        if(carry == 1) //if carry still remains add another ListNode to the end of the result
            p3.next = new ListNode(1);
 
        return head.next;
    }
}
