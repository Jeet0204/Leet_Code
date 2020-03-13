class Solution {
    public String freqAlphabets(String s) {
        String string="";
        int num;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length-2;)
        {
            if(ch[i+2]=='#')
            {
                
                num = Integer.parseInt(Character.toString((char)ch[i]) + Character.toString((char)ch[i+1]))+96;
                string += Character.toString((char)num);
                i=i+3;
            }
            else
            {
                num = Integer.parseInt(Character.toString(ch[i]))+96;
                string += Character.toString((char)num);
                i=i+1;
            }
        }
        if(ch[s.length()-2]=='#')
        {
            num = Integer.parseInt(Character.toString((char)ch[s.length()-1]))+96;
            string += Character.toString((char)num);
        }
        else if(ch[s.length()-1]!='#')
        {
            num = Integer.parseInt(Character.toString((char)ch[s.length()-2]))+96;
            string += Character.toString((char)num);
            num = Integer.parseInt(Character.toString((char)ch[s.length()-1]))+96;
            string += Character.toString((char)num);
        }
        return string;
    }
}