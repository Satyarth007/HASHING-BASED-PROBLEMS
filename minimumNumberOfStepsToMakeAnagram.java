class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char e:s.toCharArray()) hm.put(e,hm.getOrDefault(e,0)+1);
        int count = 0;
        for (char e : t.toCharArray()) {
            if (hm.containsKey(e) && hm.get(e) > 0)  hm.put(e, hm.get(e) - 1);
            else count++;
        }
        return count;
    }
}
