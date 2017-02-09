//Number of 1-bits

public class Solution {
	public int numSetBits(long a) {
	int ones = 0;
	while(a != 0){
	    a = a & (a-1); //1011 & 1010 = 1010
	    ones ++;
	}
	return ones;

	}
}
