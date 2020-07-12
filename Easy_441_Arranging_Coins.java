class Solution {
    public int arrangeCoins(int n) {
        int length = n;
        for(int i=1;i<length;i++)
        {
            if(n-i < 0)
                return i-1;
            else if(n-i == 0)
                return i;
            else
                n = n-i; 
        }
        return n;
    }
}