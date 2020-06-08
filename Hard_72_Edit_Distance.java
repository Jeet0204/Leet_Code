class Solution {
    public int minDistance(String word1, String word2) {
        int[][] result = new int[word2.length()+1][word1.length()+1];
        int count=0;
        
        for(int i=0;i<1;i++)
        {
            for(int j=1;j<=word1.length();j++)
            {
                count++;
                result[i][j] = count;
            }
        }
        
        count=0;
        for(int j=0;j<1;j++)
        {
            for(int i=1;i<=word2.length();i++)
            {
                count++;
                result[i][j] = count;
            }
        }
        
        for(int i=0;i<=word2.length();i++)
        {
            for(int j=0;j<=word1.length();j++)
            {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        
        
        for(int i=1;i<=word2.length();i++)
        {
            for(int j=1;j<=word1.length();j++)
            {
                if(word1.charAt(j-1)==word2.charAt(i-1))
                {
                    result[i][j] = result[i-1][j-1];
                }
                else{
                    result[i][j] = Math.min(Math.min(result[i-1][j-1],result[i][j-1]),result[i-1][j])+1;
                }
                    
            }
        }
        return result[word2.length()][word1.length()];
    }
}