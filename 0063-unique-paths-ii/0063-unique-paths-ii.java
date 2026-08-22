class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0] == 1 || grid[n-1][m-1] ==1) return 0;
        int dp[][]= new int[n][m];
        for(int dp1[]: dp){
            Arrays.fill(dp1,-1);
        }
        return min(grid,dp,0,0,n,m);

    }
    public int min(int grid[][],int dp[][],int i,int j,int n,int m){
        if(i ==n-1 && j== m-1) return 1;
        if(i == n || j == m ) return 0;
        if(grid[i][j] ==1) return 0;
        if(dp[i][j] !=-1) return dp[i][j];

        return dp[i][j] = min(grid,dp,i+1,j,n,m)+ min(grid,dp,i,j+1,n,m);


    }
}