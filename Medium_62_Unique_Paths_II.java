class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][]path;
        int unique_path =0;
        path = new int[100][100];

        for (int i=0;i<obstacleGrid.length;i++)
        {
            for(int j=0;j<obstacleGrid[0].length;j++)
                path[i][j]=0;          
        }
           
        
        if(obstacleGrid[0][0]==0)
        {
            path[0][0]=1;
        }
        
        for(int i=1;i<obstacleGrid.length;i++)
        {
            if(obstacleGrid[i][0]==0)
                path[i][0]=path[i-1][0];
        }
        
        for(int j=1;j<obstacleGrid[0].length;j++)
        {
            if(obstacleGrid[0][j]==0)
                path[0][j]=path[0][j-1];
        }
        
        for(int i=1;i<obstacleGrid.length;i++)
        {
            for(int j=1;j<obstacleGrid[0].length;j++)
            {
                if(obstacleGrid[i][j]==0)
                {
                    path[i][j] = path[i-1][j]+path[i][j-1];
                }         
            }
        }
        unique_path =  path[obstacleGrid.length-1][obstacleGrid[0].length-1];
        return unique_path;
        
    }
}s