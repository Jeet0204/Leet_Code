class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0)
            return -1;
        int mins = 0;
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                    fresh++;
                else if(grid[i][j]==2)
                    queue.offer(new int[]{i,j});
            }
        }
        int[][] dir = new int[][]{{0,-1},{0,1},{1,0},{-1,0}};
        while(!queue.isEmpty() && fresh>0)
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                int[] q = queue.poll();
                for(int[] d:dir)
                {
                    int r = d[0] + q[0];
                    int c = d[1] + q[1];
                    
                    if(r>=0 && r<grid.length && c>=0 && c<grid[0].length &&  grid[r][c]==1)
                    {
                        fresh--;
                        grid[r][c] = 2;
                        queue.offer(new int[]{r,c});
                    }
                }
            }
            mins++;
        }
        
        return fresh==0?mins:-1;
    }
}