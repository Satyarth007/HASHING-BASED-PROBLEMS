class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Integer,Integer> h2=new HashMap<>();
        for(char e:suits) h1.put(e,h1.getOrDefault(e,0)+1);
        for(int e:ranks) h2.put(e,h2.getOrDefault(e,0)+1);
        if(h1.size()==1) return "Flush";
        else if(h2.containsValue(3) || h2.containsValue(4) || h2.containsValue(5) ) return "Three of a Kind";
        else if(h2.containsValue(2)) return "Pair";
        return "High Card";
        
    }
}
