class Solution {
    public String breakPalindrome(String palindrome) {
        int count=0;
        if(palindrome.length()==1)
            return "";
        
        char[] ch = palindrome.toCharArray();
        for(int i=0;i<ch.length/2;i++)
        {
            if(ch[i]=='a')
            {
                count++;
                continue;
            }
            else
            {
                ch[i] = 'a';   
                break;
            }
                
        }
        
        if(count==ch.length/2)
            ch[ch.length - 1] = (char)(ch[ch.length-1]+1);
        
        return String.valueOf(ch);
    }
}