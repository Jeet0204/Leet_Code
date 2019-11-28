class Solution {
    public int climbStairs(int n) {
        int[] res=new int[n+1];
        res[1]=1;
        
        if(n<=1)
            return res[1];
        
        res[2]=2;
        for(int i=3;i<=n;i++)
        {
            res[i]=res[i-1]+res[i-2];
           
        }
        return res[n];
    }
}