/*
Implement strStr().

 strstr - locate a substring ( needle ) in a string ( haystack ).
Try not to use standard library string functions for this question.

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

public class Solution {
	public int strStr(final String haystack, final String needle) {

	//empty/null case
	if(needle == null || needle == "" || haystack == null || haystack == "")
	    return -1;

	int indexFound = -1;

	for(int i=0; i<haystack.length(); i++){

	    //if substring no longer can be found due to size
	    if(i+needle.length() > haystack.length())
	        return -1;

	    indexFound = i;
	    for(int j=0; j<needle.length(); j++){
	        if(needle.charAt(j) == haystack.charAt(indexFound)){
	            //if we reach end of needle length
	            if(j == needle.length()-1)
	                return i;
	            //check next letter of haystack
	            indexFound++;

	        } else {
	            break;
	        }
	    }
	 }
	 return -1;
}
}
