class Solution {
    public void rotate(int[][] matrix) {
        int start,last,temp,top;
        for(int i=0;i<(matrix.length/2);i++)
        {
            start = i;
            last = matrix.length -1 -i;
            for(int j=start;j<last;j++)
            {
                temp = j-start;
                top = matrix[start][j];
                matrix[start][j] = matrix[last-temp][start];
                matrix[last-temp][start] = matrix[last][last-temp];
                matrix[last][last-temp] = matrix[j][last];
                matrix[j][last] = top;
                
            }
        }
            
        
    }
}