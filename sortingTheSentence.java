class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        TreeMap<Integer,String> tm=new TreeMap<>();
        for(String e:str){
            String a= e.charAt(e.length()-1)+"";
            int x= Integer.parseInt(a);
            tm.put(x,e.substring(0,e.length()-1));
        
        }
        String ans="";
        for(Integer e: tm.keySet()){
            ans+= tm.get(e)+" ";
        }
        return ans.substring(0,ans.length()-1);
        
        

        
    }
}
