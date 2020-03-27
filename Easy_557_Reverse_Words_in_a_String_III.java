class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String final_string="";
        for(int i=0;i<str.length;i++)
        {
            char[] ch = str[i].toCharArray();
            int j=0;
            int k=ch.length-1;
            while(j<k)
            {
                char temp=ch[j];
                ch[j]=ch[k];
                ch[k]=temp;
                j++;
                k--;
            }
            final_string += String.valueOf(ch) + " ";
        }
        return final_string.trim();
    }
}