class Solution {
    public String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        String s="";
        for(int i=0;i<ch.length;i++)
        {
            if((int)ch[i] >=65 && (int)ch[i] <= 90)
                s += (char)((int)ch[i] + 32);
            else
                s += ch[i];
        }
        return s;
    }
}