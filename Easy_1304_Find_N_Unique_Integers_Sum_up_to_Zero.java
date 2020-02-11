class Solution {
    public int[] sumZero(int n) {
        int[] result =new int[n];
        int sum=0;
        int i=0;
        
        if(n==1)
            return result;
    
        
        while(sum==0 && i<n-1)
        {     
            result[i] = i+1;
            result[i+1] = -1*(i+1);   
            sum += i + (-1*i);  
            i+=2;
        }
        
        if(n%2!=0)
            result[i++]=0;
        
        return result;
    }
}