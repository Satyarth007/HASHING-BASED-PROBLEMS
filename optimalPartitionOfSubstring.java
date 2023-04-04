class Solution {
    public int partitionString(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int ans=1;
        for(char e:s.toCharArray()){
            if(hm.containsKey(e)){ hm.clear(); ans++; }
            hm.put(e,1);
        }
       return ans;
        
        
    }
}
