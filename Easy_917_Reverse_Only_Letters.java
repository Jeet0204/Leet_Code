class Solution {
    public String reverseOnlyLetters(String S) {
        if(S.length()==0)
            return "";
        
        char[] ch = S.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j)
        {
            if(!Character.isLetter(ch[i]))
                i++;
            else if(!Character.isLetter(ch[j]))
                j--;
            else
            {
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }
}