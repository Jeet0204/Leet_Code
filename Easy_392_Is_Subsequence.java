class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()==0 && t.length()!=0)
            return true;
        if(s.length()!=0 && t.length()==0)
            return false;
        if(s.length()==0 && t.length()==0)
            return true;
        
        
        char[] ch = t.toCharArray();
        char[] c = s.toCharArray();
        int i=0;
        int j=0;
        while(j<t.length())
        {
            if(c[i]==ch[j])
            {
                i++;
                if(i==s.length())
                    return true;
            }
            j++;
        }
        return false;
    }
}