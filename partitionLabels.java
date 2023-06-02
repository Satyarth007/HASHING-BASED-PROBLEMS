class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        HashSet<Character> hs= new HashSet<>();
        List<Integer> al = new ArrayList<>();
        for(char e : s.toCharArray()) hm.put(e,hm.getOrDefault(e,0)+1);

        int count=0;

        for(char e:s.toCharArray()){
            count++;
            hs.add(e);
            hm.put(e,hm.get(e)-1);

            if(hm.get(e)==0) hs.remove(e);

            if(count>0 && hs.isEmpty()){
                al.add(count);
                count=0;
            }
        }

        return al;
        

    }
}
