class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] arr = new int[cells.length];
        for(int i=0;i<(N - 1) % 14 + 1;i++)
        {  
            arr = new int[cells.length];
            for(int j=0;j<cells.length;j++)
            {
                if(j==0 || j==cells.length-1)
                    arr[j] = 0;
                else if(cells[j-1] == cells[j+1])
                {
                    arr[j] = 1;
                }   
                else 
                    arr[j] = 0;
            }
            cells = arr;
        }
        return arr;
    }
}
