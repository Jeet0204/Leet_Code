class Solution {
    public boolean checkPerfectNumber(int num) {
        int i=1;
        int sum=0;
        if(num<=0)
            return false;
       
        while(i<=num/2)
        {
            if(num%i==0)
                sum += i;
            i += 1;
        }
       
        return (sum == num) ? true : false;
    }
}