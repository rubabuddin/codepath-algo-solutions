import java.io.*;
import java.util.*;

/*
make an array of int[26], . If non-26-char exist, return -1
use same int arr to remove chars from s2.
count the non-zeros
*/

public class Solution {
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    Scanner sc = new Scanner(System.in);
    int numCases = Integer.parseInt(sc.nextLine());

    while (numCases > 0) {
        int changes = check(sc.nextLine());
        System.out.println(changes);
        numCases--;
    }

}

public static int check(String str){

    int result = 0;

    //if length is odd return -1
    if(str.length()%2 == 1){
        return -1;
    }

    String a1 = str.substring(0, str.length()/2);
    String b1 = str.substring(str.length()/2);

    int[] letters = new int[26];

    for(int i=0; i<a1.length(); i++){
        char a = a1.charAt(i);
        char b = b1.charAt(i);

        letters[a - 'a']++; //increment array with which letters exist
        letters[b - 'a']--; //decrement array with which letters exist
    }

    //remainder in this array are the total number of moves needed to get anagram
    //we might have negative numbers from the b-string so take the absolute

    for(int j:letters){
       result += Math.abs(j);
    }

    //return half of result since you only need to change either a or b to get anagram
    return result/2;

}

}




/*

remove all nodes greater than the value x
 * Complete the function below.
 */
/*
For your reference:
LinkedListNode {
    int val;
    LinkedListNode *next;
};
*/

    static LinkedListNode removeNodes(LinkedListNode list, int x) {

        LinkedListNode curr = list;

        //say x=5, list is 6 -> 2 -> 7 -> 1 -> 3

        while(curr.next != null){
            if(curr.val > x){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

//how do you drop the last node over x???
        if(curr.val > x)
            curr = null;
        return list;

    }
