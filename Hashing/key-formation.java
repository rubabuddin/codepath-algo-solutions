/*
Anagrams

Given an array of strings, return all groups of strings that are anagrams. Represent a group by a list of integers representing the index in the original list. Look at the sample case for clarification.

 Anagram : a word, phrase, or name formed by rearranging the letters of another, such as 'spar', formed from 'rasp' 
 Note: All inputs will be in lower-case. 
Example :

Input : cat dog god tca
Output : [[1, 4], [2, 3]]
cat and tca are anagrams which correspond to index 1 and 4. 
dog and god are another set of anagrams which correspond to index 2 and 3.
The indices are 1 based ( the first element has index 1 instead of index 0).

 Ordering of the result : You should not change the relative ordering of the words / phrases within 
 
*/

public class Solution {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
	
	//if two strings are anagrams of each other, their sorted sequence should be the same
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    //map entry -> [word, (location, location...)]
    HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
    
    for(int i=0; i < a.size(); i++){
        char[] word = a.get(i).toCharArray();
        Arrays.sort(word);
        String anagram = String.valueOf(word);
        if(map.get(anagram) == null){
            ArrayList<Integer> entry = new ArrayList<Integer>();
            //create entry for sorted word
            entry.add(i+1);
            map.put(anagram, entry);
        } else {
            //if sorted word already exists, add location of index to array
            map.get(anagram).add(i + 1);
        }
    }
    for(ArrayList<Integer> entry : map.values()){
            result.add(entry);
    }
    
    return result;
}
/* 
//Previous solution attempt

    public static boolean isAnagram(String str1, String str2) {
        char[] cStr1 = str1.toCharArray();
        char[] cStr2 = str2.toCharArray();
        Arrays.sort(cStr1);
        Arrays.sort(cStr2);
        return String.valueOf(cStr1).equals(String.valueOf(cStr2));
    }
*/
}
