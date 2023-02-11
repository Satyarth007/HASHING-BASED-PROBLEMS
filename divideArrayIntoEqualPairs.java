class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        // count the frequency of each character 
        for(int e:nums) hm.put(e,hm.getOrDefault(e,0)+1);
        // return false if any of the frequency is odd
        for(Integer e:hm.values()) if(e%2!=0) return false;
        // otherwise retrn true
        return true;
        
        
    }
}
