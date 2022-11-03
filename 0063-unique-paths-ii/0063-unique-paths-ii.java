class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        
        int m=arr.length;
        int n=arr[0].length;
        
        if(arr[m-1][n-1]==1)return 0;
        
        arr[m-1][n-1]=-1;
        
        return Math.abs(upath(0,0,arr,m,n));
        
    }
    
    public static int upath(int i,int j,int[][] dp,int m,int n){
        if(i>=m || j>=n || dp[i][j]==1)return 0;
        
        if(dp[i][j]!=0)
            return dp[i][j];
        
        int temp=upath(i+1,j,dp,m,n)+upath(i,j+1,dp,m,n);
        
        dp[i][j]=temp;
        
        return temp;
        
    }
}