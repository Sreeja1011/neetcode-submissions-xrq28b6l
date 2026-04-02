class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        if(nums.length==0){
            return 0;
        }
        for(int x:nums){
            pq.add(x);
        }
        int x=pq.poll();
        int res=1;
        int maxi=1;
        while(pq.size()>0){
            int y=pq.poll();
            if(y==x){
                continue;
            }
            if(Math.abs(y-x)==1){
                maxi++;
                //System.out.println(maxi +"i"+ y);
            }
            else{
                maxi=1;
            }
            x=y;
            res=Math.max(maxi,res);
        }
        return res;
    }
}
