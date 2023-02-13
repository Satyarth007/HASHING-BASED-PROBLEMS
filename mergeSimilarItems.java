class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        for(int[] e:items1){
            if(hm.containsKey(e[0])) hm.put(e[0],hm.get(e[0])+e[1]);
            else hm.put(e[0],e[1]);
        }
        for(int[] e:items2){
            if(hm.containsKey(e[0])) hm.put(e[0],hm.get(e[0])+e[1]);
            else hm.put(e[0],e[1]);
        }
        List<List<Integer>> al=new  ArrayList<>();
        
        for(Integer e:hm.keySet()){
            List<Integer> a=new ArrayList<>();
           a.add(e);
           a.add(hm.get(e));
           al.add(a);
        }
        return al;
        
        
    }
}
