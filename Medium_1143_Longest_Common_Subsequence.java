class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1==null || text2==null)
            return 0;
        
        int[][] result=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<=text1.length();i++)
        {
            // System.out.print(text1.charAt(i));
            for(int j=0;j<=text2.length();j++)
            {
                if(i==0||j==0)
                    result[i][j] = 0;
                else if(text1.charAt(i-1)==text2.charAt(j-1))
                    result[i][j] = result[i-1][j-1] + 1;
                else
                    result[i][j] = Math.max(result[i-1][j] , result[i][j-1]);
            }
        }
        return result[text1.length()][text2.length()];
    }
}