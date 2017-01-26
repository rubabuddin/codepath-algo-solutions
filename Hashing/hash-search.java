/*
Diffk II

Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2
Output :

1
as 3 - 1 = 2

Return 0 / 1 for this problem.
*/

public class Solution {
	public int diffPossible(final List<Integer> a, int b) {

	for(int i=0; i<a.size(); i++){
	    for(int j=0; j<a.size(); j++){
	        if(i!=j && (a.get(i) - a.get(j) == b))
	            return 1;
	    }
	}

    return 0;
	}
}
