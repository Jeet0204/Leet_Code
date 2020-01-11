class Solution {
    public int subtractProductAndSum(int n) {
       int sum=0, product=1;
        if(n==0)
            return 0;
        
        while(n>0)
        {
            sum = sum + (n%10);
            product = product * (n%10);
            n = n/10;
        }
        
        return (product-sum);
    }
}