/*
Longest Common PrefixBookmark Suggest Edit
Write a function to find the longest common prefix string amongst an array of strings.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.
*/

public class Solution {
	public String longestCommonPrefix(ArrayList<String> a) {

	String empty = "";

	if(a.size() == 1)
	    return a.get(0);

	if(a.size() == 0)
	    return empty;

	int minLength = Integer.MAX_VALUE;

	for(String str:a){
	    if(minLength > str.length())
	        minLength = str.length();
	}

	for(int i=0; i<minLength; i++){
	    for(int j=0; j<a.size()-1; j++){
	        String S1 = a.get(j);
	        String S2 = a.get(j+1);
	        if(S1.charAt(i) != S2.charAt(i)){
	            return S1.substring(0,i);
	        }
	    }
	}
	return a.get(0).substring(0,minLength);
    }
}
