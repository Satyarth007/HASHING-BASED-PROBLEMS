class Solution {
    public char repeatedCharacter(String s) {
        char[] c=s.toCharArray();
        HashMap<Character,Integer> hm= new HashMap<>();
        for(char e:c){
            hm.put(e,hm.getOrDefault(e,0)+1);
            if(hm.get(e).equals(2)) return e;
            
             
        }
        return '0';
    }
}
