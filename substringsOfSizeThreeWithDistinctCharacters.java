class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            String ans = s.substring(i,i+3);
            char a = ans.charAt(0);
            char b = ans.charAt(1);
            char c = ans.charAt(2);
            if(a!=b && b!=c && a!=c) count++;
            
        }
        return count;
    }
}
