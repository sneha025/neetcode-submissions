class Solution {
    public int climbStairs(int n) {
        // if there is one steps =1
        // two 1+1
        // just take 2 
        // 
        int[] dp = new int[n+1];
        dp[n] = 1;
        dp[n-1]=1;

        for(int i=n-2;i>=0;i--){
            dp[i]=dp[i+1]+dp[i+2];
        }
        
        return dp[0];
    }
}
