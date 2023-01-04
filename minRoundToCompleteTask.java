class Solution {
    public int minimumRounds(int[] tasks) {
        int count=0;
        HashMap<Integer,Integer> ht=new HashMap<>();
        for(int e:tasks){
            if(ht.containsKey(e)) ht.put(e,ht.get(e)+1);
            else ht.put(e,1);
        }
        
        for(Integer e:ht.keySet()){
            int x=ht.get(e);
            if(x==1)return -1;
            else{
                count+=x/3;
                if(x%3!=0)count++;
            } 
        }
        return count;



    }
}
