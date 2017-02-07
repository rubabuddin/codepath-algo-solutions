//implement floor_sqrt(a)

public class Solution {
	public int sqrt(int a) {

        long start = 0;
        long end = a / 2 + 1;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid * mid == a)
                return (int)mid;
            if (mid * mid < a)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return (int)end;
    }
}
