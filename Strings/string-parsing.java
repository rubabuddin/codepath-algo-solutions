/*
Implement atoi to convert a string to an integer.

Example :

Input : "9 2704"
Output : 9
Note: There might be multiple corner cases here. Clarify all your doubts using “See Expected Output”.

 Questions: Q1. Does string contain whitespace characters before the number?
A. Yes Q2. Can the string have garbage characters after the number?
A. Yes. Ignore it. Q3. If no numeric character is found before encountering garbage characters, what should I do?
A. Return 0. Q4. What if the integer overflows?
A. Return INT_MAX if the number is positive, INT_MIN otherwise. 
*/

public class Solution {
	public int atoi(final String a) {

	int flag = 0;
	int negFlag = 0;

	String copy = a.trim();

	double result = 0;
	StringBuilder stringBuilder = new StringBuilder();

	int k = 0;
	while(k < a.length()){
	    if (copy.charAt(k) == '-' && Character.isDigit(a.charAt(k+1))){
	        negFlag = 1;
	        break;
	    }
	    k++;
	}
	k = 0;
	while(k < a.length()){
	    if (copy.charAt(k) == '+' && Character.isDigit(a.charAt(k+1))){
	        negFlag = 0;
	        break;
	    }
	    k++;
	}

	for(int i=0; i<a.length(); i++){
	    if(Character.isDigit(a.charAt(i))){
	        flag = 1;
	        stringBuilder.append(a.charAt(i));
	    }
	    if(flag == 1 && Character.isDigit(a.charAt(i)) != true)
	        break;
	}

	result = Double.parseDouble(stringBuilder.toString());

	if(result > Integer.MAX_VALUE && negFlag == 0)
	    return Integer.MAX_VALUE;
	else if(result > Integer.MAX_VALUE && negFlag == 1)
	    return Integer.MIN_VALUE;
	else if(negFlag == 1)
	    result = -result;
	else
	    return (int) result;

	return (int) result;

	}
}
