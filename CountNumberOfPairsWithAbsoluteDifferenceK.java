class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int e:nums) hm.put(e,hm.getOrDefault(e,0)+1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]-k)){
                count+= hm.get(Math.abs(nums[i]-k));
            }
        }
        return count;
        
    }
}
