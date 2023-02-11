class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        for(int e:nums1) h1.add(e);
        HashSet<Integer> h2=new HashSet<>();
        for(int e:nums2) h2.add(e);
        ArrayList<Integer> a1=new ArrayList<>();
        for(Integer e:h1) if(!h2.contains(e)) a1.add(e);
        ArrayList<Integer> a2=new ArrayList<>();
        for(Integer e:h2) if(!h1.contains(e)) a2.add(e);
        
        return Arrays.asList(a1,a2);
        
    }
}
