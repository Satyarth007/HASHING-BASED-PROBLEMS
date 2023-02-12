class Solution {
    public int digit(int n){
        int r=0;
        while(n>0){
            r+=n%10;
            n=n/10;
        }
        return r;
    }
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            if(i<9) hm.put(i,hm.getOrDefault(i,0)+1);
            else hm.put(digit(i),hm.getOrDefault(digit(i),0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(Integer e:hm.values()) if(max<=e) max=e;
        return max;
        
    }
}
