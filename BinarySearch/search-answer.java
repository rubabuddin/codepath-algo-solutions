//implement floor_sqrt(a)

public class Solution {
	public int sqrt(int a) {

	    if(a == 0 || a == 1)
	        return a;

        long start = 0;
        long end = a / 2 + 1;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid == a/mid && (a%mid == 0)) //do this to avoid overflow of mid*mid
                return (int) mid;
            if (mid <= a/mid)//do this to avoid overflow of mid*mid
                start = mid + 1;
            else
                end = mid - 1;
        }
        return (int)end;
    }
}
