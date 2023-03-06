class Solution {
    public int countPoints(String rings) {
        HashMap<Character,String> hm=new HashMap<>();
        for(int i=1;i<rings.length();i+=2){
            char x=rings.charAt(i-1);
            char y=rings.charAt(i);
            hm.put(y,hm.getOrDefault(y,"")+(x+""));
            
        }
        int count=0;
        for(String e:hm.values()){
            if(e.contains("R") && e.contains("G") && e.contains("B")) count++;
        }
        return count;

        
    }
}
