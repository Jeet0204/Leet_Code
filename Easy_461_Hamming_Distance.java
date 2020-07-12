class Solution {
    public int hammingDistance(int x, int y) {
        StringBuilder sb = new StringBuilder();
        int result = x^y;
        int count = 0;
        while(result>0)
        {
            sb.append(String.valueOf(result%2));
            result = result/2;
        }
        String s = sb.reverse().toString();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                count++;
        }
        return count;
    }
}