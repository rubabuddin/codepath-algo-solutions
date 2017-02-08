/*
Rotated Sorted Array Search
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7  might become 4 5 6 7 0 1 2 ).

You are given a target value to search. If found in the array, return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Input : [4 5 6 7 0 1 2] and target = 4
Output : 0

*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {

	//find pivot
	int pivotIndex = findPivot(a, 0, a.size()-1);
	//no pivot found, array is sorted only, no rotation
	if(pivotIndex == -1)
	    return binarySearch(a, 0, a.size()-1, b);

	//binary search the two sub arrays
    	//a) if pivot index contains target value
    	if(a.get(pivotIndex) == b)
    	    return pivotIndex;
    	//if left subarray contains target value
    	if(a.get(0) <= b)
    	    return binarySearch(a, 0, pivotIndex, b);
    	//if right subarray contains target value
    	return binarySearch(a, pivotIndex+1, a.size()-1, b);
	}

	public int binarySearch(final List<Integer> a, int lo, int hi, int target){
	    if(hi < lo)
	        return -1;
	    int mid = (lo + hi)/2;
	    if(target == a.get(mid))
	        return mid;
	    if(target > a.get(mid))
	        return binarySearch(a, mid+1, hi, target);
	    return binarySearch(a, lo, mid-1, target);
	}

	public int findPivot(final List<Integer> a, int lo, int hi){
	    if(hi < lo)
	        return -1;
	    if(hi == lo)
	        return hi;

	    int mid = (lo + hi)/2;

	    if(mid < hi && a.get(mid) > a.get(mid+1))
	        return mid;
	    if(mid > lo && a.get(mid) < a.get(mid-1))
	        return (mid-1);
	    if(a.get(lo) >= a.get(mid))
	        return findPivot(a, lo, mid-1);
	    return findPivot(a, mid+1, hi);
	}
}
