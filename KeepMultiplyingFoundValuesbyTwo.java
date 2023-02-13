class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs=new HashSet<>();
        for(int e:nums) hs.add(e);
        while(hs.contains(original)) original*=2;
         return original;
        
    }
}
