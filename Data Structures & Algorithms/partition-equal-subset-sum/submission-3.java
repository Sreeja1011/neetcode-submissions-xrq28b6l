class Solution {
    public boolean canPartition(int[] nums) {
        HashSet<Integer> dp=new HashSet<>();
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        if(sum%2!=0){
            return false;
        }
        sum=sum/2;
        int n=nums.length;
        dp.add(0);
        for(int i=n-1;i>=0;i--){
            HashSet<Integer> dpN=new HashSet<>();
            for(int x:dp){
                if(x+nums[i]==sum){
                    return true;
                }
                dpN.add(x+nums[i]);
                dpN.add(x);
            }
            dp=dpN;
        }
        if(dp.contains(sum)){
            return true;
        }
        return false;
    }
}
