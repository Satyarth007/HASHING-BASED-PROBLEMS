class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int e : nums2){
            while(!st.empty() && e > st.peek()){
                hm.put(st.pop(),e);
            }
            st.push(e);
        }

        while(!st.empty()){
            hm.put(st.pop(),-1);
        }
        int ans[] = new int[nums1.length];
        int idx=0;
        for(int e:nums1) ans[idx++] = hm.get(e);

        return ans;
        
    }
}


// Leetcode:: 496
