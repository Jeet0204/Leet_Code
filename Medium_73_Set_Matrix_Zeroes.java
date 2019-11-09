class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] a1= new boolean[matrix.length];
        boolean[] a2 = new boolean[matrix[0].length];
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    a1[i] = true;
                    a2[j] = true;
                }
            }
        }
        
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i])
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        for(int i=0;i<a2.length;i++)
        {
            if(a2[i])
            {
                for(int j=0;j<matrix.length;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
    } 
}