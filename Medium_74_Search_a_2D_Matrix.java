class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean bool=false;
        for(int i=0;i<matrix.length;i++)
        {
            // System.out.print(matrix[i][0]+"........"+matrix[0].length+"?????");
            if(matrix[0].length!=0){
                if(matrix[i][0]==target || matrix[i][matrix[0].length-1]==target)
                {
                    bool =true;
                    break;
                }
                 else if(matrix[i][0]<target && matrix[i][matrix[0].length-1]>target)
                {
                    for(int j=1;j<matrix[0].length-1;j++)
                    {
                        if(matrix[i][j] == target)
                            bool = true;
                        
                    }
                     break;
                }
                else
                    continue;
            }
            
            else{
                bool = false;
            }
        }
        return bool;
    }
}