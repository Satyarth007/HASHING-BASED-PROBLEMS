class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> hs1=new HashSet<>(); for(int e:nums1) hs1.add(e);
        HashSet<Integer> hs2=new HashSet<>(); for(int e:nums2) hs2.add(e);
        HashSet<Integer> hs3=new HashSet<>(); for(int e:nums3) hs3.add(e);
        HashSet<Integer> hs4=new HashSet<>();
        for(Integer e:hs1){
            if(hs2.contains(e)) hs4.add(e);
            else if(hs3.contains(e)) hs4.add(e);
        }
        for(Integer e:hs2) if(hs3.contains(e)) hs4.add(e);
        List<Integer> l=new ArrayList<>();
        for(Integer e:hs4) l.add(e);
        return l;
        

        
    }
}
