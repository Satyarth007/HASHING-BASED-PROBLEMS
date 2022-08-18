/*
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...".
We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.


*/



// MY SOLUTION 
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> hm=new HashMap<>();
        hm.put('a',".-");  hm.put('b',"-..."); hm.put('c',"-.-."); hm.put('d',"-..");
        hm.put('e',".");  hm.put('f',"..-."); hm.put('g',"--."); hm.put('h',"....");
        hm.put('i',"..");  hm.put('j',".---"); hm.put('k',"-.-"); hm.put('l',".-..");
        hm.put('m',"--");  hm.put('n',"-."); hm.put('o',"---"); hm.put('p',".--.");
        hm.put('q',"--.-");  hm.put('r',".-."); hm.put('s',"..."); hm.put('t',"-");
        hm.put('u',"..-");  hm.put('v',"...-"); hm.put('w',".--"); hm.put('x',"-..-");
        hm.put('y',"-.--");  hm.put('z',"--.."); 
        
       HashSet<String> hs = new HashSet<>();
        int count = 0;
        for(String ele : words){
            String str = "";
            for(char ch : ele.toCharArray()){
                str = str + hm.get(ch);
            }
            if(!hs.contains(str)){
                hs.add(str);
                count ++;
            }
        }
        
        return count;
    }
}
// ALTERNATE SOLUTION FOND ON LEETCODE (MORE EEFICIENT)
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] chart = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        Set<String> count = new HashSet();
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char c : word.toCharArray())
             code.append(chart[c - 'a']);
             count.add(code.toString());
        }
        return count.size();
    }
}
