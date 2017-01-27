/*
Swap List Nodes in Pairs

Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

*/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode swapPairs(ListNode a) {
	//a = head
	
	if(a == null || a.next == null)
	    return a;
	
	ListNode curr = new ListNode(0);
	curr.next = a;
	ListNode prev = curr;
	    
	while(prev.next != null && prev.next.next != null){
	    
	    ListNode n1 = prev;
	    prev = prev.next;
	    n1.next = prev.next;
	    
	    ListNode n2 = prev.next.next;
	    prev.next.next = prev;
	    prev.next = n2;
	}
	
	return curr.next;
	}
}
