//Combinations sum
//Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

//The same repeated number may be chosen from C unlimited number of times.

public class Solution {
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> candidates, int target) {
	    ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
	    if(candidates == null || candidates.size() == 0)
	        return result;

	    ArrayList<Integer> current = new ArrayList<Integer>();
	    Collections.sort(candidates);
	    sumCombos(candidates, target, 0, current, result);

	    return result;
	}

    public void sumCombos(ArrayList<Integer> candidates, int target, int j, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
       if(target == 0){
           ArrayList<Integer> temp = new ArrayList<Integer>(curr);
           result.add(temp);
           return;
       }
      for(int i=j; i<candidates.size(); i++){
           if(target < candidates.get(i))
                return;

           curr.add(candidates.get(i));
           sumCombos(candidates, target - candidates.get(i), i, curr, result);
           curr.remove(curr.size()-1);
       }
    }
}
