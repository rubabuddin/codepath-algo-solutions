/*
Interview Question 1 - Linked List Duplicate Removal
Write a program which takes as its input an unsorted linked list of integers and deletes any duplicate values from the list without using a temporary buffer collection or any additional collection classed, such as a HashSet. Use the LinkedListNode implementation from this week's challenge.

Example: Given a linked list 1→2→3→3→4→4, the program should output: 1→2→3→4

Once you've implemented the algorithm, identify the time and space complexity of your solution using Big O notation.

*/
/*
 Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
                       N
                          C
input = 5 -> 3 -> 2 -> 1 ->|
output =
search = 3
compare =

 public ListNode removeDuplicates(ListNode a){
     ListNode head = a;
     ListNode currNode = a;
     ListNode nextNode = a;
     int search;

     while ( currNode != null ){
         search = currNode.val;
         while ( nextNode != null ){
             if ( search == nextNode.next.val ){
                 nextNode.next = nextNode.next.next;
             }else{
                 nextNode = nextNode.next;
             }
         }
         currNode = currNopde.next;
     }


     return a;

 }




 public ListNode removeDuplicates(ListNode a){
    ListNode head = a;
    ListNode currNode = a;
    ListNode nextNode = a;
    int search;

    HashSet<Int> set = new HashSet<Int>();


    while ( currNode != null ){
        search = currNode.val;
        if(set.contains(search)){
            currNode.next = nextNode.next.next;
        } else {
            set.add(search);
            currNode = nextNode.next;
        }
       // currNode = currNode.next;
    }


    return a;

}
