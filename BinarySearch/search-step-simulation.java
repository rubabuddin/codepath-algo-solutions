
//Implement pow(x, n) % d.
public class Solution {
	public int pow(int x, int n, int d) {
	    // (x ^ n) % d
	    //if n is even, x ^ n = (x * x) ^ n/2
	if(x == 0)
	    return 0;
	if(n == 0)
	    return 1;

    long ans = 1;

	while(n > 0){

	    if(n%2 != 0){
	        ans = ans*x;
	    }

	    x = (x*x)%d;
	    n = n/2;
	    if(ans > d)
	        ans = ans%d;
	}

	return (int) ans;

	}
}
