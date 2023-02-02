class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<order.length();i++) hm.put(order.charAt(i),i);
        for(int i=1;i<words.length;i++){
            String s1=words[i-1];
            String s2=words[i];
            for(int j=0;j<s1.length();j++){
                if(j==s2.length()) return false;
                if(hm.get(s1.charAt(j))<hm.get(s2.charAt(j))) break;
                if(hm.get(s1.charAt(j))>hm.get(s2.charAt(j))) return false;
            }
            
        }
        return true;

        
        
    }
}
