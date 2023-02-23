class Solution {
    public String greatestLetter(String s) {
        char[] c=s.toCharArray();
        TreeSet<Character> ts=new TreeSet<>();
        for(char e:c) ts.add(e);
        for(Character e:ts.descendingSet()){
            if(ts.contains((char)(e-32)) || ts.contains((char)(e+32)))
                return (""+e).toUpperCase();
        }
        return "";
   }
}
