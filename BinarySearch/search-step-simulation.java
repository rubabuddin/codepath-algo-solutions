/*
Implement pow(x, n) % d.

In other words, given x, n and d,

find (xn % d)

Note that remainders on division cannot be negative.
In other words, make sure the answer you return is non negative.

Input : x = 2, n = 3, d = 3
Output : 2

2^3 % 3 = 8 % 3 = 2.
*/

public class Solution {
	public int pow(int x, int n, int d) {
	    // (x ^ n) % d
	    //if n is even, x ^ n = (x * x) ^ n/2
	if(x == 0)
	    return 0;
	if(n == 0)
	    return 1%d;

    long ans = 1;
    long base = x;

	while(n > 0){

	    if(n%2 != 0){
	        ans = (ans*base)%d;
	        n--;
	    } else {
	        base = (base * base)%d;
	        n=n/2;
	    }
	}

    if(ans < 0)
	    ans = (ans+d)%d;
	return (int) ans;

	}
}
