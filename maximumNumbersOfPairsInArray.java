class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int e:nums) hm.put(e,hm.getOrDefault(e,0)+1);

        int pc=0,lc=0;
        for(Integer e: hm.values()){
            if(e%2==0) pc+= e/2; 
            else{
                pc+= e/2;
                lc += e%2;
            }
        }
        return new int[]{pc,lc};
    }
}
