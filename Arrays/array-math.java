//Min Steps in Infinite Grid

public class Solution1 {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int totalMoves = 0;

        for(int i = 1; i < X.size(); i++){
            totalMoves += Math.max(Math.abs(X.get(i)-X.get(i-1)), Math.abs(Y.get(i)-Y.get(i-1)));
        }
        return totalMoves;
    }
}

//Add One To Number

public class Solution2{
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {

	    int carry = 1;
	    ArrayList<Integer> result = new ArrayList<>(a);

	    for(int i = (a.size() - 1); i >= 0; i--){
	        int val = a.get(i) + carry; //0 +1 = 1
	        result.set(i, val%10); //set 1%10=1
	        carry = val/10; //
	    }
	     if(carry != 0){
            result.add(0, carry);
        }

        while(result.get(0).equals(0) && 0 < a.size()){
             result.remove(0);
        }
	    return result;
	}
}

//Max Sum Contiguous Subarray

public class Solution3 {
	// DO NOT MODFIY THE LIST.
	public int maxSubArray(final List<Integer> a) {

	    int newSum = a.get(0);
	    int maxSum = a.get(0);

	    if(a.size() == 0)
	        return 0;

	   for(int i = 1; i < a.size(); i++){
	       newSum = Math.max(a.get(i), newSum + a.get(i));
	       maxSum = Math.max(maxSum, newSum);
	   }

	   return maxSum;

	}
}
