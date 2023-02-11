class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs=new HashSet<>();
        for(String e:emails){
            String ans[]=e.split("@");
            int a=ans[0].indexOf("+");
            
            if(a>0)
            ans[0]=ans[0].substring(0,a);
            ans[0]=ans[0].replace(".","");
            hs.add(ans[0]+"@"+ans[1]);
            
        }
        return hs.size();

        
    }
}
