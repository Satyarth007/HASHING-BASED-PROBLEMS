class Solution {
    public String kthDistinct(String[] arr, int k) {
        String ans="";
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
//  count the string frequencies
        for(String e:arr) hm.put(e,hm.getOrDefault(e,0)+1);
// decrease the k if k-1 != 0 else return that string as answer
        for(String e: hm.keySet()){
            if(hm.get(e)==1 && --k==0){
                ans=e;
                break;
            }
        }
        return ans;
       
        
    }
}
