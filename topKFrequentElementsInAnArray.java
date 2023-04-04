class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int e:nums) hm.put(e,hm.getOrDefault(e,0)+1);
        List<Map.Entry<Integer,Integer>>ls=new ArrayList<>(hm.entrySet());
        ls.sort((a,b)-> 
            Objects.equals(a.getValue(),b.getValue())
            ? b.getKey()-a.getKey()
            : b.getValue()-a.getValue()
        );
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=ls.get(i).getKey();
        }
        return ans;
    }
}
