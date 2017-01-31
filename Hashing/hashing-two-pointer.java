/*
Longest Substring Without Repeat
Given a string, 
find the length of the longest substring without repeating characters.

Example:

The longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.

For "bbbbb" the longest substring is "b", with the length of 1.
*/

public class Solution {
	public int lengthOfLongestSubstring(String a) {
	    
	if(a.length()<=1)
	    return a.length();
	
	int maxLength = 1;
	ArrayList<Integer> lengths = new ArrayList<Integer>();
	
	
	//count occurence of letters each time
    for(int i=0; i<a.length(); i++){
        Map<Character, Integer> map = new HashMap<>();
        map.put(a.charAt(i), 1);
        for(int j=i+1; j<a.length(); j++){
            //if letter already exists
            if(map.containsKey(a.charAt(j)))
                break;
            map.put(a.charAt(j), 1);
            lengths.add((a.substring(i,j)).length()+1);    
        }
    }
    
    
    for(int i=0; i<lengths.size(); i++){
        if(lengths.get(i) > maxLength)
            maxLength = lengths.get(i);
    }
    
    return maxLength;
    }
}
