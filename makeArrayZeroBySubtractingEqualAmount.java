class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int e:nums) if(e!=0) hs.add(e);
        return hs.size();
    }
}

/*
// another solution using priority queue
class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int e:nums) pq.offer(e);
        int count=0;
        int temp =-1;
        for(int i =0;i<nums.length;i++){
            int x = pq.poll();
            if(x==0 || x==temp) continue;
            temp=x;
            count++;
        }
        return count;
       
        
        
    }
}
*/
