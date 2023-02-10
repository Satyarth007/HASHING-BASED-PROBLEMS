// HASHMAP SOLUTION 
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        // frequency count code of each element 
        for(int e:nums) hm.put(e,hm.getOrDefault(e,0)+1);
        int sum=0;
        // sum of elements whose frequency is 1
        for(Integer e:hm.keySet()) if(hm.get(e)==1) sum+=e;
        return sum;
        
        
    }
}
