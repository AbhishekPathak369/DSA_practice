class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][]= new int[n][m];
        for(int dp1[]: dp){
            Arrays.fill(dp1,-1);
        }
        return min(grid,dp,0,0,n,m);

    }
    public int min(int grid[][],int dp[][],int i,int j,int n,int m){
        if(i >= n || j>=m){
            return Integer.MAX_VALUE;
        }
        if(i == n-1 && j == m-1){
            return grid[i][j];
        }
        if(dp[i][j] != -1) return dp[i][j];
        int right = min(grid,dp,i,j+1,n,m);
        int down = min(grid,dp,i+1,j,n,m);
       return dp[i][j] = Math.min(right,down) + grid[i][j];
    }
}