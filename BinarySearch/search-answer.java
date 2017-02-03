//implement sqrt

public class Solution {
	public int sqrt(int a) {
	   
    if (a == 0 || a == 1)
       return a;
 
    int i = 1;
    int result = 1;
    
    while (result < a)
    {
       if (result == a)
          return result;
       i++;
       result = i*i;
    }
    return i-1;
	}
}
