class Solution {
    public int getMaximumGold(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int sum=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                System.out.println("In grid: "+grid[i][j]);
                sum = Math.max(sum,dfs(grid,i,j,visited));
            }
        }
        return sum;
    }    
    public int dfs(int[][] grid,int i,int j, boolean[][] visited)
    {
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==0 || visited[i][j])
            return 0;
        int dummy = 0;
        int sum=grid[i][j];


        visited[i][j] = true;
        dummy = Math.max(dummy,dfs(grid,i+1,j,visited));
        dummy = Math.max(dummy,dfs(grid,i-1,j,visited));
        dummy = Math.max(dummy,dfs(grid,i,j+1,visited));
        dummy = Math.max(dummy,dfs(grid,i,j-1,visited));
        visited[i][j] = false;
        
        return sum+dummy;
        
        
        
    }
}