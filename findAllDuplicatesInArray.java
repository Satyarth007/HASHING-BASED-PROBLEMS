class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int e:nums) hm.put(e,hm.getOrDefault(e,0)+1);
        for(Integer e:hm.keySet()) if(hm.get(e)>=2) l.add(e);
        return l;
        
    }
}
