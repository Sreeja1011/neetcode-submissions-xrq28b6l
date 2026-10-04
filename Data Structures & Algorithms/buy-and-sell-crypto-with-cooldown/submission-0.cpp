class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        vector<vector<int>>dp(n+1,vector<int>(2,0));
        dp[1][0]=-prices[0];
        if(n>1)dp[2][0]=max(-prices[0],-prices[1]);
        for(int i=2;i<=n;i++){
            for(int j=0;j<2;j++){
                if(j==0&&i>2)dp[i][j]=max(dp[i-1][0],dp[i-2][1]-prices[i-1]);
                else if(j==1) {
                    dp[i][j]=max(prices[i-1]+dp[i-1][0],dp[i-1][1]);
                }
            }
        }
        return max(dp[n][0],dp[n][1]);
    }
};
