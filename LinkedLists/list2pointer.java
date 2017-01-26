/*
Remove duplicates from Linked List 

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
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
	public ListNode deleteDuplicates(ListNode a) {
	//a = head
	
	if(a==null || a.next == null){
	    return a;
	}
	
	ListNode prev = a;
	ListNode curr = a.next;
	
	while(curr!= null){
	    if(curr.val == prev.val){
	        //drop curr
	        prev.next = curr.next;
	        curr = curr.next;
	    } else {
	        //no change, traverse
	        prev = curr;
	        curr = curr.next;
	    }
	}
	return a;   
	}
}
