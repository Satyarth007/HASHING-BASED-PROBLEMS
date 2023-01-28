class Solution {
    public String destCity(List<List<String>> paths) {
        if(paths.size()==1) return paths.get(0).get(1);
        HashMap<String,String> hm=new HashMap<>();
        int i=0;
        while(i!=paths.size()){
            hm.put(paths.get(i).get(0),paths.get(i).get(1));
            i++;
        }
        String ans="";
        for(String s:hm.values()){
            if(!hm.containsKey(s)) ans+=s;
        }
        return ans;
    }
}
