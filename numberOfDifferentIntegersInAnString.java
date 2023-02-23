class Solution {
    public int numDifferentIntegers(String word) {
        String[] str=word.split("[a-z]");
        HashSet<String> hs=new HashSet<>();
        for(String e:str) {
        	//e=e.trim();
        	if(!e.equals("")) {
        		e=e.replaceAll("^0*", "");
        		hs.add(e);
        	}
        }
        return hs.size();
        
    }
}
