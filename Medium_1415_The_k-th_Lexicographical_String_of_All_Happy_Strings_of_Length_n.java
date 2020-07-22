class Solution {
    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        String str ="";
        String s = "abc";
        recr(n,list,str,s);
        return list.size()<k ? "":list.get(k-1);
    }
    
    public void recr(int size,List<String>  list, String string, String s)
    {
        if(string.length()==size)
        {
            list.add(string);
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                if(string.length()>0 && string.charAt(string.length()-1)==s.charAt(i))
                    continue;
                else
                {
                    string += Character.toString(s.charAt(i));
                    recr(size,  list, string, s);
                    string = string.substring(0,string.length()-1);
                }
            }
        }
    }
}