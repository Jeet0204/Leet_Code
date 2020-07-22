class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> list = new ArrayList<String>();
        recr(list, "", 0, 0, n);
        return list;
    }
    
    public void recr(List<String> list, String str, int open, int close, int max){
        
        if(str.length() == max*2){
            list.add(str);
            return;
        }
        
        if(open < max)
            recr(list, str+"(", open+1, close, max);
        if(close < open)
            recr(list, str+")", open, close+1, max);
    
    }
}