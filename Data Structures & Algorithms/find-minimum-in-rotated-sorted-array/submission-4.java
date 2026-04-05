class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int left=0;
        int right=nums.length-1;
        int mid=(left+right-1)/2;
        while(left<right){
            mid=(left+right-1)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
    }
}
