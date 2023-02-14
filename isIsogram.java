class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        HashMap<Character,Integer> hm=new HashMap<>();
        char[] c=data.toCharArray();
        for(char e:c) hm.put(e,hm.getOrDefault(e,0)+1);
        
        for(Integer e:hm.values()) if(e!=1) return false;
        return true;
        
        
    }
}
