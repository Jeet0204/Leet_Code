class Solution {
    public int maximum69Number (int num) {
        int result = 0;
        int duplicate = num;
        int count = 0;
        while(num>0)
        {         
            count++;
            if(num%10==6)
                result = count;
            num = num/10;
        }
        result = (int)(duplicate + 3*Math.pow(10,result-1));
        return result;
    }
}