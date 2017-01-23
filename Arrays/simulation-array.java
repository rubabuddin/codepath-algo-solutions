/*
Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.

Example:


Input:

1 2 3
4 5 6
7 8 9

Return the following :

[
  [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9]
]

*/

public class Solution {
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {

	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

	//n by n square matrix
	int n = a.size();

	//number of diags
	int diags = (n*2)-1;

	for(int i=0; i<diags; i++){
	    //iterate through each diagonal, element is a single array element of the result
	    int index = 0;
	    ArrayList<Integer> element = new ArrayList<Integer>();

	    if(i<n) //always go to (0,x) up till mid-diagonal
	        index = 0;
	    else ////always go to (index-n+1,x) after mid-diagonal
	        index = i-n+1;

	    for(int j=index; j<i-index+1; j++){
	        element.add((a.get(j)).get(i-j));
	    }

	    result.add(element);
	}

	return result;
	}
}
