class Solution {
    public int findLucky(int[] arr) {
      
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int e:arr) hm.put(e,hm.getOrDefault(e,0)+1);
        int ans=-1;
        for(Integer e:hm.keySet()){
            if(e==hm.get(e)) ans=e;
        }
        return ans;
        
    }
}
