class Solution {
    public String longestPalindrome(String s) {
        int[][] str = new int[s.length()][s.length()];
        int min = 0;
        int max = 0;
        
        if(s.length()==0)
            return "";
        
        for(int i=0;i<s.length();i++)
        {
            str[i][i] = 1;
            min = i;
            max = i;
        }
        
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                str[i][i+1]=1;
                min = i;
                max = i+1;
            }
            else
                str[i][i+1]=0;
        }
        
        for(int i=2;i<s.length();i++)
        {
            for(int j=0;j<s.length()-i;j++)
            {
                if((s.charAt(j)==s.charAt(j+i)) && str[j+1][j+i-1]==1 )
                {
                    str[j][j+i] = 1;
                    min = j;
                    max = j+i;
                }
            }
        }
        
        return s.substring(min,max+1);
    }
}