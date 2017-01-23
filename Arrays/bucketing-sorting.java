// Wave Array

public class Solution3{
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    Collections.sort(a);

	    int i =0;

	    while(i<a.size()){
	        if(i+1 < a.size()){
    	        int temp = a.get(i);
    	        a.set(i, a.get(i+1));
    	        a.set(i+1, temp);
    	        i+=2;
	        } else {
	            i++;
	        }
	    }
	    return a;

	}
}
