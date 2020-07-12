class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        boolean flag= false;
        for(int i=0;i<str.length/2;i++)
        {
            String string = str[i];
            str[i] = str[str.length-i-1];
            str[str.length-i-1] = string;
        }
        s = "";
        for(int i=0;i<str.length;i++)
        {
            if(str[i].isEmpty())
            {
                continue;           
            }
            else
                s += " " + str[i];
        }
        
        s = s.trim();

        return s;
    }
}