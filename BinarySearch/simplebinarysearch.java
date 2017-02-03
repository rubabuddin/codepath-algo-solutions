//Given target value, return index of where to place it in sorted bst

public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b){
	    if(b > a.get(a.size()-1))
	        return a.size();
	    
	int i = 0;
	int j = a.size();
	
	while(i < j){
	    int k = (i+j)/2;
	    if(b > a.get(k)){
	        i = k+1;
	    } else {
	        j = k;
	    }
	}
	    return j;
	}
}
