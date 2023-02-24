class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                int x=hm.getOrDefault(nums[i][j],0);
                hm.put(nums[i][j],x+1);

                if(x+1 == nums.length) l.add(nums[i][j]);
                
            }
        }
        Collections.sort(l);
        return l;
        
        
    }
}
