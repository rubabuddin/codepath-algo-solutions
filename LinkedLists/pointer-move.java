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

/**
Reverse Link List II
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

 Note:
Given m, n satisfy the following condition:
1 = m = n = length of list. Note 2:
Usually the version often seen in the interviews is reversing the whole linked list which is obviously an easier version of this question. 


 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    
/*	
//previous solution not passing all testcases
ListNode head = a;	    
	if(head==null||head.next==null)
        return head;    
	    
	ListNode prev = null; //keep track m-1 node
	ListNode p1 = new ListNode(0); //to represent the m_th indice
	ListNode p2 = new ListNode(0); //to represent the n_th indice
	
	int numIterations = n - m + 1; //total number of iterations between n and m
	int iterations = 0;
	
    ListNode curr = head;

    while(curr != null){
        iterations++;
        if (iterations == m-1)
            prev = curr; //previous node of m_th indice (m-1)  
        
        if(iterations == m)
            p1.next = curr;
        
        if(iterations == n){
            p2.next = curr.next;
            curr.next = null;
        }  
        curr = curr.next; //traverse through list
    }
    
    if(p1.next == null)
        return head;
        
    //reverse the list between nodes m to n
    // a b c [m e f n] g -> a b c [n f e m] g
    ListNode mth = p1.next;
    ListNode nth = mth.next;
    mth.next = p2.next;
    
    while(mth != null && nth != null){
        ListNode t = mth.next;
        nth.next = mth;
        mth = nth;
        nth = t;
    }
    
    if( prev != null)
        prev.next = mth;
    else
        return nth;
        
    return nth;*/
    ListNode head = a;	  
  	
  	if(head==null||head.next==null)
        return head;    
	
	ListNode curr = new ListNode(0); // curr node to mark head of list
	curr.next = head;
	ListNode pre = curr; // use to traverse through list to find m-1 indice
	
	for (int i = 0; i < m - 1; i++)
		pre = pre.next; //m-1 indice

	ListNode start = pre.next; // beginning of sub linked list to be reversed
	ListNode end = start.next; // pointer to node to be reversed

	for (int i = 0; i < n - m; i++) {
		start.next = end.next; // 
		end.next = pre.next; 
		pre.next = end;
		end = start.next;
	}
	return curr.next;

	}
}


