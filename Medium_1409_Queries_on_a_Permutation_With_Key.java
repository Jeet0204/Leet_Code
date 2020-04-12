class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] result =new int[m];
        int[] ans = new int[queries.length];
        
        for(int i=0;i<m;i++)
            result[i] = i+1;
        
        for(int i=0;i<queries.length;i++)
        {
            for(int j=0;j<result.length;j++)
            {
                if(queries[i]==result[j])
                {
                    ans[i] = j;
                    for(int k=j;k>0;k--)
                    {
                        int temp = result[k];
                        result[k] = result[k-1];
                        result[k-1] = temp;
                        
                    }
                }
            }
        }
        return ans;
    }
}