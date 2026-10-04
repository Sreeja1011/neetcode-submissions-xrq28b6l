class Solution {
    // public int dfs(int i,int[]prices,boolean buy){
    //     if(i>=prices.length){
    //         return 0;
    //     }
    //     int notcons=dfs(i+1,prices,buy);
    //     if(buy){
    //         int con=dfs(i+1,prices,false)-prices[i];
    //         return Math.max(notcons,con);
    //     }
    //     else{
    //         int sell=dfs(i+2,prices,true)+prices[i];
    //         return Math.max(notcons,sell);
    //     }
    // }
    public int maxProfit(int[] prices) {
        //return dfs(0,prices,true);
        int n=prices.length;
        int dp[][]=new int[n+1][2];
        dp[1][0]=-prices[0];
        if(n>1)dp[2][0]=Math.max(-prices[0],-prices[1]);
        for(int i=2;i<=n;i++){
            for(int j=0;j<2;j++){
                if(j==0&&i>2){
                    dp[i][j]=Math.max(dp[i-2][1]-prices[i-1],dp[i-1][0]);
                }
                else if(j==1){
                    dp[i][j]=Math.max(dp[i-1][0]+prices[i-1],dp[i-1][1]);
                }
            }
        }
        return Math.max(dp[n][0],dp[n][1]);

    }
}
