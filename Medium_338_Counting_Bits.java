class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        if (num<0)
            return result;
        for(int i=1;i<=num;i++)
        {
            if((i&1)==0)
            {
                result[i] = result[i/2];
            }
            else
            {
                result[i] = result[i-1]+1;
            }
        }
        return result;
    }
}