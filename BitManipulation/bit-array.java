//Given an array of integers, every element appears twice except for one. Find that single one.

public class Solution {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    int x = 0;
    	for (int digit : a) {
    		x = x ^ digit;
    	}
    	return x;
	}
}
