class Solution {
    public boolean canJump(int[] nums) {
        int jump=nums[0];
        int canReach=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=canReach){
                canReach=i;
            }
        }
        return canReach==0;
    }
}
