class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        recr(list, 0, S);
        return list;
    }
    
    
    public void recr(List<String> list, int start, String S)
    {
        list.add(S);
        for(int i=start;i<S.length();i++)
        {
            if(Character.isDigit(S.charAt(i)))
            {
                continue;
            }
            else
            {
                char[] ch = S.toCharArray();
                if(Character.isLowerCase(ch[i]))
                {
                    ch[i] = Character.toUpperCase(ch[i]);
                    recr(list, i+1,String.valueOf(ch));
                }
                else
                {
                    ch[i] = Character.toLowerCase(ch[i]);
                    recr(list, i+1,String.valueOf(ch));
                }
            }
        }
    }
}