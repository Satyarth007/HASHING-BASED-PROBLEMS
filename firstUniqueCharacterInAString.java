class Solution {
    public int firstUniqChar(String s) {
        char c[]=s.toCharArray();
        LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<>();
        for(char e:c) lhm.put(e,lhm.getOrDefault(e,0)+1);
        for(Character e:lhm.keySet()) if(lhm.get(e)==1) return s.indexOf(e);
        return -1;
        
    }
}
