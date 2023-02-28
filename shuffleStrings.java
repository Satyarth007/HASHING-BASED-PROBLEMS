class Solution {
    public String restoreString(String s, int[] indices) {
        TreeMap<Integer,Character> tm=new TreeMap<>();
        int idx=0;
        for(int i:indices) tm.put(i,s.charAt(idx++));
        String ans="";
        for(Character e:tm.values()) ans+=e;
        return ans;

        
    }
}
