/*
Substring Concatenation

You are given a string, S, and a list of words, L, that are all of the same length.

Find all starting indices of substring(s) in S that is a concatenation of each word in L exactly once and without any intervening characters.

Example :

S: "barfoothefoobarman"
L: ["foo", "bar"]
You should return the indices: [0,9].
(order does not matter).

*/
public class Solution {
	public ArrayList<Integer> findSubstring(String a, final List<String> b) {

	ArrayList<Integer> result = new ArrayList<Integer>();
    int len = (b.get(0).length());

    //create a hash to count occurrences
    //foobarman, 0
    //foomanbar. 0
    //manfoobar. 0
    //manbarfoo, 0
    //barmanfoo, 0
    //barfooman, 0

    HashMap<String,Integer> map = new HashMap<String,Integer>();
    for(String w: b){
        if(map.containsKey(w)){
            map.put(w, map.get(w)+1);
        }else{
            map.put(w, 1);
        }
    }

    //int check = 1;

    for(int i=0; i<len; i++){
        HashMap<String,Integer> checkMap = new HashMap<String,Integer>();
        int start = i;
        int count = 0; //count of words

        for(int j=i; j<=a.length()-len; j=j+len){

            String word = a.substring(j, j+len);

            if(map.containsKey(word)){
                if(checkMap.containsKey(word)){
                    checkMap.put(word, checkMap.get(word) +1);
                } else {
                    checkMap.put(word, 1);
                }
                count++;

                while(checkMap.get(word)>map.get(word)){
                    String remaining = a.substring(start, start+len);
                    checkMap.put(remaining, checkMap.get(remaining)-1);

                    count--;
                    start = start + len;
                }

                if(count == b.size()){
                    result.add(start);
                    String remaining = a.substring(start, start+len);
                    checkMap.put(remaining, checkMap.get(remaining)-1);

                    count--;
                    start = start + len;
                }
            }else{
                checkMap.clear();
                start = j + len;
                count = 0;
            }
        }
    }
    return result;
    }
}
