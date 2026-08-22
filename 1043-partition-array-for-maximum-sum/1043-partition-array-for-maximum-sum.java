class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int dp[] = new int[n+1];
       
        int ans =-1;
dp[0]=0;
        for(int i =1; i<=n; i++){
            int max = 0;
       for(int j =1; j <=k  && i -j>=0; j++){
         max = Math.max(arr[i-j],max);
          int  sum =  dp[i-j] + max * j;
     dp[i]= Math.max(dp[i],sum);
       }
        }
return dp[n];
    }
}