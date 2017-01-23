/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.
*/

public class Solution {
	public int lengthOfLastWord(final String a) {

	   StringBuilder word = new StringBuilder();
	   ArrayList<StringBuilder> words = new ArrayList<StringBuilder>();
	   int maxLen = 0;

	   for(int i=0; i<a.length(); i++){
	       if(a.charAt(i) == ' ')
	       {
	           words.add(word);
	           word = new StringBuilder();
	       }
	       if(a.charAt(i) != ' ')
	           word.append(a.charAt(i));
	   }
	   words.add(word);

	   for(int i=0; i<words.size(); i++){
	       if((words.get(i)).toString() != " ")
	        maxLen = (words.get(words.size()-1)).length();
	   }

	    return maxLen;
	}
}
