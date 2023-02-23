class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a=s1.split(" ");
        String[] b=s2.split(" ");
        
        ArrayList<String> al=new ArrayList<>();

        HashMap<String, Integer> h1=new HashMap<>();
        for(String e: a) h1.put(e,h1.getOrDefault(e,0)+1);
        
        HashMap<String, Integer> h2=new HashMap<>();
        for(String e: b) h2.put(e,h2.getOrDefault(e,0)+1);

        for(String e: h1.keySet())
            if(h1.get(e)==1 && !h2.containsKey(e)) al.add(e);
        
        for(String e: h2.keySet()) 
              if(h2.get(e)==1 && !h1.containsKey(e)) al.add(e);
        

        String[] ans= new String[al.size()];
        int idx=0;
        for(String e:al) ans[idx++]=e;
        return ans;

        

        
    }
}
