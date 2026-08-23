class Solution {
    public int jump(int[] nums) {
        int n = nums.length;

        int dp[] = new int[n];
       Arrays.fill(dp,-1);
       return help(nums,dp,0,n);
    }
    public int help(int nums[],int dp[], int i, int n){
        if(i >= n-1 ) return 0;
        if(dp[i]!=-1) return dp[i];
         if(nums[i] ==0) return 100000;
        int min = Integer.MAX_VALUE;
        for(int j =1; j<= nums[i] && i+j <n;j++){
            int next = help(nums,dp,i + j,n);
            if(min >next + 1){
                min =next + 1;
            }
           
        }
        return dp[i] = min;
    }
}