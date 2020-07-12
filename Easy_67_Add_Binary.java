class Solution {
    public String addBinary(String a, String b) {
        int carry =0;
        int i = a.length()-1;
        int j= b.length()-1;
        StringBuilder sb = new StringBuilder();
        
        while(i>=0 || j>=0)
        {
            char charA = (i >= 0) ? a.charAt(i--) : '0'; 
            char charB = (j >= 0) ? b.charAt(j--) : '0';
         
            if (charA == '1' && charB == '1')
            {
				sb = (carry==1) ? sb.append('1') : sb.append('0');
				carry = 1;
            } 
            else if (charA == '0' && charB == '0')
            { 
                sb = (carry==1) ? sb.append('1') : sb.append('0');
                carry = 0;
            }
            else 
            { 
                sb = (carry==1) ? sb.append('0') : sb.append('1');
            }
        }
        
        if(carry==1)
                sb.append('1');
        return sb.reverse().toString();
    }
}