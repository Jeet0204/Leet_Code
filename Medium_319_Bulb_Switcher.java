class Solution {
    public int bulbSwitch(int n) {
        
        return (int)Math.sqrt(n);
        
        //Approach 2 (But having time constraint in some cases)
        // int[] result = new int[n+1];
        // int count=0;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=0;j<=n;j=j+i)
        //     {
        //             result[j] ^= 1;
        //     } 
        // }
        // for(int i=1;i<=n;i++)
        // {
        //     if(result[i]==1)
        //         count++;
        // }
        // return count;
    }
}