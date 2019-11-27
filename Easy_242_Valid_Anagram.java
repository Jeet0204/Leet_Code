class Solution {
    public boolean isAnagram(String s, String t) {
        
       char[] a;
       char[] b;
        
        if(s.length()!=t.length())
            return false;
        else
        {
           a = s.toCharArray();
           b = t.toCharArray();
           Arrays.sort(a);
           Arrays.sort(b);    
        }
        
        return Arrays.equals(a, b);
    }
}