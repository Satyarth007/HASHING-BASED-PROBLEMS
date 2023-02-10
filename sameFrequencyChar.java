class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int val=1;
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i)))
                    hm.replace(s.charAt(i),hm.get(s.charAt(i)),hm.get(s.charAt(i))+1);
            else hm.put(s.charAt(i),val);
         }

        int x=hm.get(s.charAt(0));
        for(Character e:hm.keySet()) if(hm.get(e)!=x) return false;
        return true;
    }
}
