class Solution {
    public int consecutiveNumbersSum(int N) {
        int sum, count=0, initial;
        
     
        for(int i=1;i<=N;i++)
        {
            N = N - i;
            if(N<0)
                break;
            if(N%i==0)
                count++;
        }
        
        return count;
    }
}