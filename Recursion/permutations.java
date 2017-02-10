//Given a collection of numbers, return all possible permutations.

public class Solution {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    if(a == null || a.size() == 0)
	        return result;
        permute(a, 0, result);
        return result;
	}

	public void permute(ArrayList<Integer> numbers, int start, ArrayList<ArrayList<Integer>> result) {
	    if(start >= numbers.size()) {
	        ArrayList<Integer> set = convertArrayListToList(numbers);
	    	result.add(set);
    	}

    	for (int j=start; j <= numbers.size() - 1; j++) {
    		swap(numbers, start, j);
    		permute(numbers, start + 1, result);
    		swap(numbers, start, j);
    	}
	}

    private ArrayList<Integer> convertArrayListToList(ArrayList<Integer> numbers) {
    	ArrayList<Integer> set = new ArrayList<Integer>();
    	for (int i = 0; i < numbers.size(); i++) {
    		set.add(numbers.get(i));
    	}
    	return set;
    }

	public void swap(ArrayList<Integer> a, int i, int j) {
    	int temp = a.get(i);
    	a.set(i, j);
    	a.set(j, temp);
    }

    }
