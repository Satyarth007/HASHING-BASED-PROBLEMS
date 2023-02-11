class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int e:arr) hm.put(e,hm.getOrDefault(e,0)+1);
        HashSet<Integer> hs=new HashSet<>();
        for(Integer e:hm.values()){
            if(hs.contains(e)) return false;
            else hs.add(e);
        }
        
        return true;
        
    }
}
