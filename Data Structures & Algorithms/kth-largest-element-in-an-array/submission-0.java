class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>q=new PriorityQueue<>();
        int x=k;
        for(int i=0;i<x;i++){
            q.add(nums[i]);
        }
        while(x<nums.length){
            int top=q.peek();
            if(nums[x]>top){
                q.poll();
                q.add(nums[x]);
            }
            x++;
        }
        return q.poll();
    }
}
