class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] result = new int[n][m];
        int count=0;
        int size=indices.length-1;
        while(size>=0)
        {
                for(int i=0;i<m;i++)
                {
                    result[indices[size][0]][i] += 1; 
                }
                for(int i=0;i<n;i++)
                {
                    result[i][indices[size][1]] += 1; 
                }
                size--;      
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(result[i][j]%2 != 0)
                    count++;
            }
        }
        return count;
    }
}