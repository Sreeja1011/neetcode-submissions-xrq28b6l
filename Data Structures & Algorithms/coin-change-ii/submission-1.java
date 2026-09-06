class Solution {
    public int recur(int []coins,int i,int tar,int[][]memo){
        if(tar==0){
            return 1;
        }
        if(i>=coins.length){
            return 0;
        }
        if (memo[i][tar] != -1) return memo[i][tar];
        int res=0;
        if(tar>=coins[i]){
            res=recur(coins,i+1,tar,memo);
            res+=recur(coins,i,tar-coins[i],memo);
        }
        memo[i][tar]=res;
        return res;
    }
    public int change(int amount, int[] coins) {
        int res=0;
        int memo[][]=new int[coins.length+1][amount+1];
        Arrays.sort(coins);
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return recur(coins,0,amount,memo);
    }
}
