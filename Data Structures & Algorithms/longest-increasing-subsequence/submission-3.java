class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int res=1;
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    res=Math.max(res,dp[i]);
                }
            }
        }
        return res;
    }
}
