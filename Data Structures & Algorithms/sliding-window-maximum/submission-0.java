class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        int res[]=new int[nums.length-k+1];
        int x=1;
        res[0]=pq.peek();
        for(int i=k;i<nums.length;i++){
            pq.remove(nums[i-k]);
            pq.add(nums[i]);
            res[x]=pq.peek();
            x++;
        }
    return res;
    }
}
